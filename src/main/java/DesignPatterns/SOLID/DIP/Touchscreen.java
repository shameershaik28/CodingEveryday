package DesignPatterns.SOLID.DIP;

public class Touchscreen implements InputDevice {
    @Override
    public void getInput() {
        System.out.println("Touchscreen is in used");
    }
}
