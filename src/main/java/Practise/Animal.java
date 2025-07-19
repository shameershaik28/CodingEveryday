package Practise;

// Parent class (also called Superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class (also called Subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the program
 class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create Dog object

        // Call methods
        dog.eat();     // Inherited from Animal
        dog.sleep();   // Inherited from Animal
        dog.bark();    // Defined in Dog
    }
}




