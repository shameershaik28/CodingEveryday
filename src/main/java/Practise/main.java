package Practise;

public class main {
    public static void main(String[] args) {
        Student s = new Student(29, "Shameer");
        s.display();
        s.sayHello("Elif");


        Point topLeft = new Point();
        topLeft.x = 29;
        topLeft.y = 30;

        Rectangle r = new Rectangle();
        r.topLeft = topLeft;

        r.height = 5;
        r.width = 4;


        // Now you can call the methods
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        Point bottomRight = r.bottomRight();
        System.out.println("Bottom Right: (" + bottomRight.x + ", " + bottomRight.y + ")");


        Person p1 = new Person(29, "Shameer");
        System.out.println("Name: " + p1.name + " Age: " + p1.age);

        C run = new C();
        run.fun();
        run.fun1();
        run.fun2();


    }
}
