import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> mp = new HashMap<>();

        String inputFile = "src/cz/davson/files/inputFile.txt";
        String outputFile = "src/cz/davson/files/outputFile.txt";

        Charset charset = Charset.forName("UTF-8");

        Path filePathInput = Paths.get(inputFile);
        Path filePathOutput = Paths.get(outputFile);

        Files.deleteIfExists(filePathOutput);
        Files.createFile(filePathOutput);

        if (Files.exists(filePathInput)) {
            System.out.println("Reading all lines!");
            List<String> lines = Files.readAllLines(filePathInput, charset);

            for (String line : lines) {
                String[] arrayOfWords = line.split(" ");
                for (int i = 0; i < arrayOfWords.length; i++) {
                    System.out.println("Slovo["+ i + "] : " + arrayOfWords[i]);

                    if(mp.containsKey(arrayOfWords[i])){
                        mp.put(arrayOfWords[i], mp.get(arrayOfWords[i])+1 );
                    }
                    else
                    {
                        mp.put(arrayOfWords[i],1 );
                    }
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
                mp.entrySet()
                        .stream()
                        .sorted((o1, o2) -> o1.getKey().compareToIgnoreCase(o2.getKey()))
                        .forEach( e -> {
                            System.out.println(e.getKey()+ " - "+e.getValue());
                            try {
                                bw.write(e.getKey()+ " - "+e.getValue() + "\n");
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        });
                bw.close();

                System.out.println("Calculating & write to outputFile!");
            } else throw new IOException("Input File not found!");
        }
    }