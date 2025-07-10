package Collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 90);
        scores.put("Alice", 95);
        scores.put("John", 85); // updates existing value

        for (String name : scores.keySet()) {
            System.out.println(name + " = " + scores.get(name));
        }
    }
}

