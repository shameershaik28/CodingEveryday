package Practise;

public class Client {
    public static void main(String[] args) {
        System.out.println("I'm the main class");
        Adder a  = new Adder();
        Subtractor s = new Subtractor();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

    }
}
