package cz.davson;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileOperation {

    public static void countDirectoriesByRoot() {
        File[] roots = File.listRoots();

        for (File root : roots) {
            System.out.println("Number of directories in " + root + " : " + countDirectoriesInDirectory(root));
        }
    }

    private static int countDirectoriesInDirectory(File directory) {
        File[] files = directory.listFiles();
        int dirCount = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    dirCount += countDirectoriesInDirectory(file) + 1;
                }
            }
        }

        return dirCount;
    }

    public static void copyFilesWithExtensionA(File directory, String destination, String[] extensions) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                for (String extension : extensions) {
                    if (file.getName().endsWith(extension)) {
                        try{
                            Files.copy(file.toPath(), Path.of(destination + "/" +file.getName()), REPLACE_EXISTING);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        };
                        //System.out.println(file);
                        //System.out.println(destination);
                    }
                }
                if (file.isDirectory()) {
                    copyFilesWithExtensionA(file, destination, extensions);
                }
            }
        }
    }

    public static void copyFilesWithExtensionB(File directory, String destination, String[] extensions) {
        File[] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir + "/" + name);
                if (file.isDirectory())
                    return true;

                String fileExt = name.substring(name.lastIndexOf(".") + 1);
                for (String ext : extensions) {
                    if (ext.substring(1).compareToIgnoreCase(fileExt) == 0)
                        return true;
                }

                return false;
            }
        });

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    copyFilesWithExtensionB(file, destination, extensions);
                }
                else {
                    try{
                        Files.copy(file.toPath(), Path.of(destination + "/" + file.getName()), REPLACE_EXISTING);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    };
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
}