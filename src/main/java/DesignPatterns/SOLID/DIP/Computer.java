package DesignPatterns.SOLID.DIP;

public class Computer {
    private InputDevice device;

    public Computer(InputDevice device) {
        this.device = device;
    }

    public void useInput()
    {
        device.getInput();
    }
}
