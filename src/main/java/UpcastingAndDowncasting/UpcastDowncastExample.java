package UpcastingAndDowncasting;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpcastDowncastExample {
    public static void main(String[] args) {
        // 🔼 Upcasting (Dog → Animal)
        Animal animal = new Dog(); // Upcasting happens automatically
        animal.sound();            // Works ✅
        // animal.bark();          // ❌ Not allowed here (it's hidden)

        // 🔽 Downcasting (Animal → Dog)
        Dog dog = (Dog) animal;    // Manual cast
        dog.bark();                // Works ✅
    }
}

