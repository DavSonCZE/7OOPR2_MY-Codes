package cz.davson;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String workingDir = System.getProperty("user.dir");
        String destDirectoryA = new File(workingDir + "/output/methodA/").getAbsolutePath();
        String destDirectoryB = new File(workingDir + "/output/methodB/").getAbsolutePath();
        //String destDirectoryC = new File(workingDir + "/output/methodC/").getAbsolutePath();
        File fileA = new File(destDirectoryA);
        File fileB = new File(destDirectoryB);
        //File fileC = new File(destDirectoryC);
        fileA.mkdirs();
        fileB.mkdirs();
        //fileC.mkdirs();

        FileOperation.showAllDrives();

        File[] roots = File.listRoots();
        String[] extensions = {".png", ".jpg"};
        FileOperation.copyFilesWithExtensionA(roots[0], destDirectoryA, extensions); // Disk C: (roots[0]) [Záleží na označení disků]
        FileOperation.copyFilesWithExtensionB(roots[0], destDirectoryB, extensions); // Disk C: (roots[0]) [Záleží na označení disků]

        FileOperation.countDirectoriesByRoot();
    }
}