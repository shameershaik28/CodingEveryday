package DesignPatterns.SOLID.LSP;

 class Parrot implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
