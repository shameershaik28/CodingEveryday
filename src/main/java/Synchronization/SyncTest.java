package Synchronization;

public class SyncTest {
    public static void main(String[] args) {
        StaticAndInstance obj1 = new StaticAndInstance();
        StaticAndInstance obj2 = new StaticAndInstance();

        Thread t1 = new Thread(() -> {
            obj1.instanceIncrement();  // Locks obj1
            StaticAndInstance.staticIncrement(); // Locks class
        });

        Thread t2 = new Thread(() -> {
            obj2.instanceIncrement();  // Locks obj2 (different from obj1)
            StaticAndInstance.staticIncrement(); // Locks class
        });

        t1.start();
        t2.start();
    }
}
