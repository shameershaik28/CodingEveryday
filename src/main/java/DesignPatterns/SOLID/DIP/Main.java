package DesignPatterns.SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        InputDevice i = new Keyboard();
        InputDevice i2 = new Touchscreen();
        Computer c1 = new Computer(i);
        Computer c2 = new Computer(i2);
        c1.useInput();
        c2.useInput();
    }
}
