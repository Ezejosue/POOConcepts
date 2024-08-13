package file.manage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        var fileName = "myFile.txt";
        var file = new File(fileName);

        try {
            System.out.println("File content: ");
            var fileReader = new BufferedReader(new FileReader(file)); // BufferedReader is used to read text from a character-input stream and FileReader is used to read the contents of a file
            var line = fileReader.readLine(); // readLine() reads a line of text

            while (line != null) {
                System.out.println(line);
                line = fileReader.readLine();
            }

            fileReader.close();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
