package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Activity_14 {
    public static void main(String[] args) throws IOException {
        try{
            String FilePath = "C:\\Users\\SauravBharti\\IdeaProjects\\M1_25th_April_Java\\src\\main\\java\\newfile.txt";
            File file = new File(FilePath);
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
            File fileUtil = FileUtils.getFile(FilePath);
            FileUtils.writeStringToFile(fileUtil,"My name is Saurav", "UTF8");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("C:\\Users\\SauravBharti\\IdeaProjects\\M1_25th_April_Java\\src\\main\\java\\Jungle");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(newFile, "UTF8"));

        }catch(IOException errMessage) {
            System.out.println(errMessage);
        }


    }
}
