package ExceptionsAndMiscellaneous;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

