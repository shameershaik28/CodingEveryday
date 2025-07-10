package ExecutorCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // 1. Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> System.out.println("Hello from thread"+ Thread.currentThread().getName()));


        // 2. Create a simple task using Runnable
        Runnable task1 = () -> {
            System.out.println("Hello from Task 1! " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Hello from Task 2! " + Thread.currentThread().getName());
        };

        Runnable task3 = () -> {
            System.out.println("Hello from Task 3! " + Thread.currentThread().getName());
        };

        // 3. Submit tasks to executor
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        // 4. Shut down the executor
        executor.shutdown();
    }
}

