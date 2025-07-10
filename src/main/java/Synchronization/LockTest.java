package Synchronization;

public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock example = new ReentrantLock();

        // Thread 1: calls increment 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Thread 2: also calls increment 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start(); // Step 4: Start both threads
        t2.start();

        t1.join();  // Step 5: Wait for both to finish
        t2.join();

        System.out.println("Final count: " + example.getCount()); // Step 6
    }
}

