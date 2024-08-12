package file.manage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        var fileName = "myFile.txt";
        var file = new File(fileName);

        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            try {
                var fileCreated = new PrintWriter(new FileWriter(file));
                fileCreated.close();
                System.out.println("File created successfully");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
