package DesignPatterns.SOLID;

//O – Open/Closed Principle (OCP)
abstract class Shape {
    abstract double area();

}

class Circle extends Shape {
double radius;

Circle(double radius) {
    this.radius = radius;
}

public double area() {
    return Math.PI * radius * radius;
}

}

class Rectangle extends Shape {
    double length;

    Rectangle(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }
}

class Main
{
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10);

        System.out.println("Area of circle is : "+circle.area());
        System.out.println("Area of rectangle is : "+rectangle.area());
    }
}
