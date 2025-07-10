package Generics;

import java.util.*;

public class WildcardExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        System.out.println("Unbounded wildcard:");
        printList(stringList);  // Works with any list

        System.out.println("\nUpper-bounded wildcard:");
        sumNumbers(intList);    // Works with List<Integer>
        sumNumbers(numberList); // Works with List<Number>

        System.out.println("\nLower-bounded wildcard:");
        addNumbers(objectList); // Works with List<Object>
        addNumbers(numberList); // Works with List<Number>

        System.out.println("Object List after addNumbers: " + objectList);
        System.out.println("Number List after addNumbers: " + numberList);
    }

    // Unbounded wildcard: accepts any type of list
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Upper-bounded wildcard: accepts Number or any subclass (e.g., Integer, Double)
    public static void sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        System.out.println("Sum: " + sum);
    }

    // Lower-bounded wildcard: accepts Integer or any superclass (e.g., Number, Object)
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
        System.out.println("Numbers added.");
    }
}

