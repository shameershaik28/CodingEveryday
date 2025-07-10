package Collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // allows duplicates

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

