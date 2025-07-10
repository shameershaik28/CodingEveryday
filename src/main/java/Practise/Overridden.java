package Practise;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class Overridden {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();  // Output: Parent static method (not Child)
    }
}

