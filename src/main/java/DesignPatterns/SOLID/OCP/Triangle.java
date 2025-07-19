package DesignPatterns.SOLID.OCP;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double  calculateArea()
    {
        return 0.5 * base * height;
    }
}
