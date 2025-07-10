package ExecutorCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> System.out.println("Task 1 - " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task 2 - " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Task 3 - " + Thread.currentThread().getName());

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown(); // always shutdown after use
    }
}

