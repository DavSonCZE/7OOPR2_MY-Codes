package cz.davson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");

        File[] roots = File.listRoots();
        String[] extensions = {".xlsx",".xls"};

        FileOperation.showAllDrives();
        System.out.println("\n File's that be found:");
        FileOperation.showFilesWithExtension(roots[0],extensions,250); // Disk: (roots[<ID> ]) [Záleží na označení disků]
    }


}