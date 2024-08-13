package file.manage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        var fileName = "myFile.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName)); // readAllLines() reads all lines from a file as a List of Strings
            System.out.println("File content: ");
            lines.forEach(System.out::println); // forEach() performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
