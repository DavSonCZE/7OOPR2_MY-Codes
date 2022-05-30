import java.io.File;
import java.io.IOException;
import java.nio.file.*;
public class Operation {

    public static void copy(File inputDir, File outputDir) throws IOException {
        File[] inList = inputDir.listFiles();
        File[] outList  = outputDir.listFiles();

        if(inList != null)
        {
            if (outList == null)
            {
                System.out.println("Output directory -> not found. Creating one.");
                outputDir.mkdir();
            }
            copyFiles(inputDir, outputDir);
            for (File file : inList)
            {
                if (file.isDirectory())
                {
                    Path outDir;
                    outDir = Paths.get(outputDir.getPath() + "\\" + file.getName());
                    copy(file, outDir.toFile());
                }
            }
        }
        else {
            System.out.println("Input directory -> not found. Exiting program.");
        }
    }

    public static void copyFiles(File inputDir, File outputDir) throws IOException {
        File[] inList = inputDir.listFiles();
        File[] outList = outputDir.listFiles();
        String date = String.valueOf(java.time.LocalDate.now());

        for (File file : inList)
        {
            if (file.isDirectory()) continue;

            int exists = fileAlreadyExists(file, outList);
            switch (exists) {
                case -2:
                    Files.copy(file.toPath(), Paths.get(outputDir.toPath() + "\\" + file.getName()));
                case -1:
                    continue;
                default:
                {
                    String renameStr = outList[exists].getParent()+"\\"+date+"_"+outList[exists].getName();
                    renameStr = checkIfNameExists(outList, renameStr);
                    File rename = new File(renameStr);
                    outList[exists].renameTo(rename);
                    Files.copy(file.toPath(), Paths.get(outputDir.toPath() + "\\" + file.getName()));
                }
            }
        }
        return;
    }

    public static String checkIfNameExists(File[]directory, String name) {
        String ret = name;
        for (File file:directory) {
            if (file.getName().equals(name)) {
                ret = "old_" + ret;
                checkIfNameExists(directory, ret);
            }
        }

        return ret;
    }

    public static boolean checkIfBytesAreSame(byte[] bytes0, byte[] bytes1) {
        if (bytes0.length == 0 && bytes1.length == 0) {
            return true;
        }
        if (bytes0.length != bytes1.length) {
            return false;
        }
        for (int i = 0; i < bytes0.length; i++) {
            if (bytes0[i]!=bytes1[i]) {
                return false;
            }
        }

        return true;
    }

    public static int fileAlreadyExists(File fileToCheck, File [] directory) throws IOException
    {
        byte[] f1 = Files.readAllBytes(fileToCheck.toPath());
        int numberOfFile = 0;
        for (File file:directory) {
            if (file.getName().equals(fileToCheck.getName())) {
                byte[] f2 = Files.readAllBytes(file.toPath());
                if (checkIfBytesAreSame(f1, f2)) {
                    System.out.println("Found identical file: " + fileToCheck.getName());
                    return -1;
                }
                else {
                    System.out.println("Found file with same name :" + fileToCheck.getName() + ", with different content. Creating -> new file.");
                    return numberOfFile;
                }
            }

            numberOfFile++;
        }

        System.out.println("File " + fileToCheck.getName() + " is normal. Continuing");
        return -2;
    }
}