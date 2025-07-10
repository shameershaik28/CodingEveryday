package Thread;

class MyTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread count: " + i);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        MyTask task = new MyTask();  // Creating a thread object
        task.start();  // Starts a new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread count: " + i);
        }

        System.out.println("Main thread ends");
    }
}

