package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.getCar("tesla");
        Car c3 = CarFactory.getCar("Hyundai");

        c1.drive();
        c3.drive();
    }
}
