package Thread;

public class SingleThreadExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        doTask();  // Runs in the main thread

        System.out.println("Main thread ends");
    }

    public static void doTask() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task count: " + i);
        }
    }
}

