import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "src/files/spz.txt";
        Path filePathInput = Paths.get(inputFile);

        if(Files.exists(filePathInput)){
            System.out.println("Reading all lines!");
            List<String> lines = Files.readAllLines(filePathInput);

            for(String line: lines){
                for (String words : line.split(",")) {

                    System.out.print("Pro SPZ:" + words + ": ");
                    CountCifry(words);
                }
            }
        }
        else throw new IOException("Input File not found!");
    }

    private static void CountCifry(String words) {
        int counter = 0;

        HashSet<String> chars = new HashSet<>();

        for (int i = 0; i < words.length(); i++) {
            Character ch = words.charAt(i);

            if (Character.isDigit(ch)) {
                int number = Character.getNumericValue(ch);
                chars.add(String.valueOf(ch));
                counter=counter+number;
            }
        }

        System.out.print(chars);
        System.out.print("=" + counter);
        System.out.println(" ");
    }
}
