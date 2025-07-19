package DesignPatterns.SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);
        Shape triangle = new Triangle(5, 10);


        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("The Circle area is : " + areaCalculator.area(circle));
        System.out.println("The Rectangle area is : " + areaCalculator.area(rectangle));
        System.out.println("The Triangle area is : " + areaCalculator.area(triangle));

    }
}
