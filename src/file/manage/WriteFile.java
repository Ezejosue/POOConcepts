package file.manage;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        boolean append = true;
        var fileName = "myFile.txt";
        var file = new File(fileName);

        try {
            append = file.exists();
            var output = new PrintWriter(new FileWriter(file, append));// PrintWriter is used to write formatted text to a file and FileWriter is used to write the contents of a file
            var newContent = "Hello, World!";
            output.println(newContent);// println() prints a line of text
            output.close();
            System.out.println("Content written to file");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
