package DesignPatterns.SOLID.ISP;

public class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Its Printing...");
    }
}

