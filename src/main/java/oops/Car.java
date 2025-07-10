package oops;

public class Car {
    //properties or variables
    String brand;
    int  year;

    //default constructor
    public Car()
    {
        this("shameer", 0); //it calls 2 parametrized constructor
        System.out.println("default constructor ");
    }

    // with 1 parameterized constructor

    public Car(String brand) {
        System.out.println("1 parameterized constructor");
        this.brand = brand;
    }

    //2 parametrized constructor
    public Car(String brand, int year) {
        System.out.println("2 parameterized constructor");
        this.brand = brand;
        this.year = year;
    }


    //copy constructor
    public Car(Car other)
    {
        this.brand = other.brand;
        this.year = other.year;
    }



    public void StartEngine()
    {
        System.out.println(brand+ " "+ year + " Starting Engine" );
    }
}
