package ExecutorCallable;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        // 1. Create ExecutorService
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // 2. Create a Callable task
        Callable<String> task = () -> {
            return "Result from thread: " + Thread.currentThread().getName();
        };

        // 3. Submit the task and get a Future
        Future<String> future = executor.submit(task);

        // 4. Get the result (this blocks until result is ready)
        String result = future.get(); // may throw InterruptedException or ExecutionException
        System.out.println("Returned: " + result);

        // 5. Shutdown
        executor.shutdown();
    }
}

