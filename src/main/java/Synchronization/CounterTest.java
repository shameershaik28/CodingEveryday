package Synchronization;

import lombok.Getter;

public class CounterTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads will run and increment the same counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // shared method
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment(); // shared method
            }
        });

        t1.start();
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish

        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    @Getter
    private int count = 0;
    private final Object lock = new Object(); // synchronized block

    public void increment() {
         synchronized (lock) { // synchronized block
             count++;
         }
    }

}

