package ExceptionsAndMiscellaneous;

import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt"); // File may not exist!
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }
    }
}

