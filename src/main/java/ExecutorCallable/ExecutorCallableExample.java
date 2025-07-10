package ExecutorCallable;

import java.util.concurrent.*;

public class ExecutorCallableExample {
    public static void main(String[] args) {
        // Step 1: Create ExecutorService with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Step 2: Create Callable task
        Callable<String> task = () -> {
            Thread.sleep(1000); // simulate delay
            return "Task completed!";
        };

        // Step 3: Submit task and get Future
        Future<String> future = executor.submit(task);

        // Step 4: Retrieve result
        try {
            String result = future.get(); // waits until task is done
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 5: Shutdown the executor
        executor.shutdown();
    }
}

