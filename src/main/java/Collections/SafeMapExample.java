package Collections;

import java.util.concurrent.ConcurrentHashMap;

public class SafeMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        Runnable writer = () -> scores.put("NewUser", 100);
        Runnable reader = () -> {
            for (String name : scores.keySet()) {
                System.out.println(Thread.currentThread().getName() + " reads: " + name + " = " + scores.get(name));
            }
        };

        Thread t1 = new Thread(writer, "Writer");
        Thread t2 = new Thread(reader, "Reader");

        t1.start();
        t2.start();
    }
}

