package ExceptionsAndMiscellaneous;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        // "test.txt" should be in your project folder
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
