package LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Brenda");

        // Filter names that start with A and convert to uppercase
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filtered);  // Output: [ALICE, ANKIT]
    }
}

