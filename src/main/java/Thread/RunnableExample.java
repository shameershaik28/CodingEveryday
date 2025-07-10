package Thread;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread count: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread count: " + i);
        }
    }
}

