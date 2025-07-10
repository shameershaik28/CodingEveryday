package Collections;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Python");

        System.out.println(books.pop()); // Python
        System.out.println(books.pop()); // Java
    }
}

