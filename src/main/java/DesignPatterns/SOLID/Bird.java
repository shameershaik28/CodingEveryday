package DesignPatterns.SOLID;

// L : Liskov Substitution Principle (LSP)
public class Bird {
    void eat()
    {
        System.out.println("Bird is eating");
    }
}

interface Flyable
{
    void fly();
}

class sparrow extends Bird implements Flyable
{
    public void fly()
    {
        System.out.println("Sparrow is flying");
    }
}

class Ostrich extends Bird{

}

class LSPCorrectExample
{
    public static void main(String[] args) {
        Bird b = new sparrow();
        b.eat();

        Flyable f = new sparrow();
        f.fly();

        Bird b2 = new Ostrich();
        b2.eat();
    }
}
