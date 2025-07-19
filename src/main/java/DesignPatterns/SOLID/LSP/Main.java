package DesignPatterns.SOLID.LSP;

public class Main {
    public static void main(String[] args) {
        Bird p = new Parrot ();
        Bird o = new Ostrich();
        FlyingBird fp = new Parrot();

        p.eat();
        fp.fly();
        o.eat();


    }
}
