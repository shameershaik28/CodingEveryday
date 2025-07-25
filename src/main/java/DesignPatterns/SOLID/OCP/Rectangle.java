package DesignPatterns.SOLID.OCP;

public class Rectangle implements Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
        return length * width;
    }
}
