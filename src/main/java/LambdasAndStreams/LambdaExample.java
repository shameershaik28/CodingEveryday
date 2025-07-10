package LambdasAndStreams;

public class LambdaExample {
    interface Greeting {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);

        greet.sayHello("Alice");

    }
}

