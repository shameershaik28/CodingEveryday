package Polymorphism;

public class MethodOveriding {
    String sound;

    public void makeSound() {
        System.out.println("bark loud");
    }

}

class dog extends MethodOveriding {
    public void makeSound() {
        System.out.println("bark slowly");
    }
}
