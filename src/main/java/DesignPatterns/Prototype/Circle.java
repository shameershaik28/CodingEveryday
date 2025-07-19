package DesignPatterns.Prototype;

import lombok.Setter;

public class Circle implements Shape{
    @Setter
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public Circle clone()
    {
        return  new Circle(color, radius);
    }

    public void displayInfo()
    {
        System.out.println("Circle -> Radius: " + radius + ", Color: " + color);
    }


}
