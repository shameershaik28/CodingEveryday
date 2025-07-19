package DesignPatterns.SOLID.DIP;

public class Keyboard implements InputDevice {
    @Override
    public void getInput() {
        System.out.println("Keyboard is typing");
    }
}
