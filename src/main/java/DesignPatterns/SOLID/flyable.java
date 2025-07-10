package DesignPatterns.SOLID;

//I – Interface Segregation Principle (ISP)
 interface flyable {
    void fly();
}

interface walkable
{
    void walk();
}


class Dog implements walkable
{
    public void walk()
    {
        System.out.println("Dog walk");
    }
}

class Parrot implements flyable, walkable
{
    public void fly()
    {
        System.out.println("Parrot fly");
    }
    public void walk()
    {
        System.out.println("Parrot walk");
    }
}

class ISPExample
{
    public static void main(String[] args) {
         walkable f = new Dog();
         f.walk();

         flyable p = new Parrot ();
         p.fly();
         walkable f2 = new Parrot ();
         f2.walk();
    }
}
