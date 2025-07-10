package Synchronization;

import lombok.Getter;

public class ReentrantLock {
    @Getter
    private int count = 0;
    private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();

    public void increment() {
        lock.lock();  // acquire the lock
        try {
            count++;
        } finally {
            lock.unlock(); // always release the lock (important!)
        }
    }

}

