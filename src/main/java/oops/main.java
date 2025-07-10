package oops;

import static oops.passByValueAndRef.changeValue;

public class main {
    public static void main(String[] args) {
        /* Car class
        Car c = new Car();
        Car c1 = new Car("Tesla");
        Car c2 = new Car("Hyundai", 2025);
        Car c3 = new Car(c);

        c.StartEngine();
        c1.StartEngine();
        c2.StartEngine();
        c3.StartEngine();
     */

        /* Address class
        Address original = new Address("hyderabad","india",502319);

        //shallow copy
        Address shallowCopy = original;

        //deep copy
        Address deepcopy = new Address(original.city, original.country, original.zip);

        original.city = "Mumbai";

        //print
        original.print();
        shallowCopy.print();
        deepcopy.print();
        */

//        student s1 = new student("shameer");
//        student s2 = new student("Teja");
//
//        s1.print();
//        s2.print();
//
//
//        student.nameChange("Myschoolahhaha");
//
//        s1.print();
//        s2.print();

        int a = 50;
        changeValue(a);
        System.out.println("a = " + a); // Output: 50



    }
}
