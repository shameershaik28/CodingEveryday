package Generics;

public class GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        Integer[] numbers = {1, 2, 3};

        printArray(names);     // prints names
        printArray(numbers);   // prints numbers
    }
}

