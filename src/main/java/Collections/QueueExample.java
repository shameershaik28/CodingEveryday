package Collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Task1");
        tasks.offer("Task2");

        System.out.println(tasks.poll()); // Task1
        System.out.println(tasks.poll()); // Task2
    }
}

