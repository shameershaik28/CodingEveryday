package abstraction;

abstract class Vehicle {
    abstract void start();

    void fuel()
    {
        System.out.println("fuel");
    }


}
class car extends Vehicle {
    void start() {
        System.out.println("car start");
    }
}
