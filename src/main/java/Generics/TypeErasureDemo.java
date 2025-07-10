package Generics;

import java.util.*;

public class TypeErasureDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass()); // true!
    }
}

//Because both are just ArrayList at runtime — type is erased.