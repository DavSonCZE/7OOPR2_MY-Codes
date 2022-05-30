package cz.davson;

import java.io.File;
public class FileOperation {

    public static void showFilesWithExtension(File directory, String[] extensions, int size) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                for (String extension : extensions) {
                    if (file.getName().endsWith(extension) && calculateFileSize(file)>size) {
                        System.out.print(file);
                        System.out.print(" |Size: " + calculateFileSize(file) + " kbit" + "\n");
                    }
                }
                if (file.isDirectory()) {
                    showFilesWithExtension(file, extensions, size);
                }
            }
        }
    }

    public static void showAllDrives(){
        File[] roots = File.listRoots();
        int i=0;

        System.out.println("List of all usable disks: ");
        System.out.println("------------------------: ");
        for (File root : roots) {
            System.out.println("Disc ID: " + root + " : " + i++);
        }
    }
    public static long calculateFileSize(File file){
            long bytes = file.length();
            long kilobytes = (bytes / 1024);
            return kilobytes;
        }
    }