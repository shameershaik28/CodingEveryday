package abstraction;

import oops.Car;

public class main {
    public static void main(String[] args) {
        Vehicle v = new car();
        v.start();
        v.fuel();

        Animal a = new Dog();
        a.bark();
        a.eat();
    }
}
