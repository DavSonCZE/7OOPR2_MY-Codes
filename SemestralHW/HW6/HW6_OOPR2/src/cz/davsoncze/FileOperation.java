package cz.davsoncze;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileOperation {

    private static final Pattern patternPackage =
            Pattern.compile("package\\s(.*?);");

    private static final Pattern patternTypes =
            Pattern.compile("public\\s+(class|interface)\\s+(.*?)\\s+(?:extends\\s+(.*?)\\s+)?(?:implements\\s+(.*?)\\s+)?\\{(.*?)^\\}",
                    Pattern.DOTALL | Pattern.MULTILINE);

    private static final Pattern classMethods =
            Pattern.compile("(public|private|protected)\\s([a-zA-Z]+)\\s+([a-zA-Z]+)\\((.*?)\\)\\s+\\{(?:.*?)\\}",
                    Pattern.DOTALL | Pattern.MULTILINE);

    private static final Pattern interfaceMethods =
            Pattern.compile("([a-zA-Z0-9]+)\\s([a-z]+)\\((.*?)\\);");

    private static final Pattern inlineVariables =
            Pattern.compile("(public|private|protected)\\s([a-zA-Z]+)\\s([a-zA-Z]+);");

    private static final Pattern methodParams =
            Pattern.compile("([a-zA-Z]+)\\s([a-zA-Z]+)");

    public static void readFile(String inputFile, String outputFile) throws IOException {
        String workingDir = System.getProperty("user.dir");
        String input = new File(workingDir + "/input/" + inputFile).getAbsolutePath();
        String output = new File(workingDir + "/output/" + outputFile).getAbsolutePath();

        final Path inputPath = Path.of(input);
        final Path outputPath = Path.of(output);
        if (Files.exists(inputPath)) {
            String content = Files.readString(inputPath) + "\n";

            StringBuilder str = new StringBuilder("@startuml\n");
            Matcher matcher = patternPackage.matcher(content);
            boolean hasPackage = false;
            if (matcher.find()) {
                hasPackage = true;
                str.append("package ")
                        .append(matcher.group(1))
                        .append(" {\n");
            }

            matcher = patternTypes.matcher(content);
            while (matcher.find()) {
                String type = matcher.group(1);
                String className = matcher.group(2);
                String extendsClass = matcher.group(3);
                String implementsClass = matcher.group(4);
                String body = matcher.group(5);

                str.append(type)
                        .append(" ")
                        .append(className)
                        .append(" ")
                        .append(extendsClass != null ? "extends " + extendsClass + " " : "")
                        .append(implementsClass != null ? "implements " + implementsClass + " " : "")
                        .append("\n{\n");

                Matcher inlineVariablesMatcher = inlineVariables.matcher(body);
                while (inlineVariablesMatcher.find()) {
                    String variableAccessor = inlineVariablesMatcher.group(1);
                    String variableType = inlineVariablesMatcher.group(2);
                    String variableName = inlineVariablesMatcher.group(3);

                    str.append(variableAccessor.equals("public") ? "+" : (variableAccessor.equals("private") ? "-" : "#"))
                            .append(variableName)
                            .append(" : ")
                            .append(variableType)
                            .append("\n");
                }

                Matcher classMethodsMatcher = classMethods.matcher(body);
                while (classMethodsMatcher.find()) {
                    String methodAccessor = classMethodsMatcher.group(1);
                    String methodType = classMethodsMatcher.group(2);
                    String methodName = classMethodsMatcher.group(3);
                    String methodParamsBody = classMethodsMatcher.group(4);


                    str.append(methodAccessor.equals("public") ? "+" : (methodAccessor.equals("private") ? "-" : "#"))
                            .append(methodName)
                            .append("(");
                    Matcher params = methodParams.matcher(methodParamsBody);
                    boolean hasParams = false;
                    while (params.find()) {
                        String paramType = params.group(1);
                        String paramName = params.group(2);

                        str.append(hasParams ? ", " : "")
                                .append(paramName)
                                .append(" : ")
                                .append(paramType);
                        hasParams = true;
                    }
                    str.append(")")
                            .append(" : ")
                            .append(methodType)
                            .append("\n");
                }

                Matcher interfaceMethodsMatcher = interfaceMethods.matcher(body);
                while (interfaceMethodsMatcher.find()) {
                    String methodType = interfaceMethodsMatcher.group(1);
                    String methodName = interfaceMethodsMatcher.group(2);
                    String methodParamsBody = interfaceMethodsMatcher.group(3);

                    str.append("+")
                            .append(methodName)
                            .append("(");
                    Matcher params = methodParams.matcher(methodParamsBody);
                    boolean hasParams = false;
                    while (params.find()) {
                        String paramType = params.group(1);
                        String paramName = params.group(2);

                        str.append(hasParams ? ", " : "")
                                .append(paramName)
                                .append(" : ")
                                .append(paramType);
                        hasParams = true;
                    }
                    str.append(")")
                            .append(" : ")
                            .append(methodType)
                            .append("\n");
                }

                str.append("}\n");
            }

            if (hasPackage)
                str.append("}\n");
            str.append("@enduml");

            if (Files.exists(outputPath))
                Files.delete(outputPath);
            Files.writeString(outputPath, str.toString());

        }
    }
}
