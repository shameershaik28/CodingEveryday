package Synchronization;

public class StaticAndInstance {
    private static int staticCount = 0;
    private int instanceCount = 0;

    // Static synchronized method
    public static synchronized void staticIncrement() {
        staticCount++;
        System.out.println("Static Count: " + staticCount + " by " + Thread.currentThread().getName());
    }

    // Instance synchronized method
    public synchronized void instanceIncrement() {
        instanceCount++;
        System.out.println("Instance Count: " + instanceCount + " by " + Thread.currentThread().getName());
    }
}

