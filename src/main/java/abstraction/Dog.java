package abstraction;

public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("bark");
    }
    @Override
    public void eat() {
        System.out.println("eat");
    }
}
