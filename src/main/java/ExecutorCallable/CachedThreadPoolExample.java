package ExecutorCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is running in thread: " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

