package Collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate ignored

        for (String name : names) {
            System.out.println(name);
        }
    }
}

