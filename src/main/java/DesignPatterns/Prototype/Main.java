package DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Circle original = new Circle("Red", 2);
        Circle copy = original.clone();
        original.displayInfo();
        copy.setColor("blue");
        copy.displayInfo();
    }
}
