package Synchronization;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // allow 2 threads at a time

        for (int i = 1; i <= 5; i++) {
            int threadId = i;
            Thread t = new Thread(() -> {
                try {
                    System.out.println("Thread " + threadId + " waiting for permit...");
                    semaphore.acquire();  // acquire permit (if available)

                    System.out.println("Thread " + threadId + " got permit.");
                    Thread.sleep(2000);   // simulate task
                    System.out.println("Thread " + threadId + " done.");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();  // release permit
                    System.out.println("Thread " + threadId + " released permit.");
                }
            });

            t.start();
        }
    }
}

