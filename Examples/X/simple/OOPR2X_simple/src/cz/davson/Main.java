package cz.davson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = "src/cz/davson/files/inputFile.txt";
        String outputFile = "src/cz/davson/files/outputFile.txt";

        Path filePathInput = Paths.get(inputFile);
        Path filePathOutput = Paths.get(outputFile);

        Files.deleteIfExists(filePathOutput);
        Files.createFile(filePathOutput);

        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        if(Files.exists(filePathInput)){
            System.out.println("Reading all lines!");
            List<String> lines = Files.readAllLines(filePathInput);

            int  characterInWord=0;
            for (String line: lines) {

                for (String words : line.split(" ")) {

                    characterInWord = calculateSizeOfWord(words);
                        String out = Integer.toString(characterInWord);
                        bw.write(out + " ");
                    }

                bw.write("\n");
                //Files.writeString(filePathOutput, "\n", StandardOpenOption.APPEND);
                }
                System.out.println("Calculating characters & write to outputFile!");
                bw.close();
            }
        else throw new IOException("Input File not found!");
        }

        public static int calculateSizeOfWord(String inputWord){
            int total=0;
            total=inputWord.length();
        return total;
        }
    }