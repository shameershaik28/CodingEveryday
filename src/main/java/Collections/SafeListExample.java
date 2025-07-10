package Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class SafeListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();

        names.add("Alice");
        names.add("Bob");

        // Multiple threads reading and writing
        Runnable task = () -> {
            for (String name : names) {
                System.out.println(Thread.currentThread().getName() + " reads: " + name);
                names.add("New-" + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}

