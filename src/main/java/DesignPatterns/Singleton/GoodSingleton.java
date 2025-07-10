package DesignPatterns.Singleton;

public class GoodSingleton {
    private static volatile GoodSingleton instance;

    public GoodSingleton() {
        System.out.println("Connecting to the database");
    }

    public static GoodSingleton getInstance() {
        if(instance == null) {
            synchronized (GoodSingleton.class) {
                if(instance == null) {
                    instance = new GoodSingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from GoodSingleton");
    }
}

class SingletonExample
{
    public static void main(String[] args) {
        GoodSingleton a = GoodSingleton.getInstance();
        GoodSingleton b = GoodSingleton.getInstance();

        a.sayHello();

        if(a==b)
        {
            System.out.println("Pefect: its a singleton ");
        }
        else
            {
            System.out.println("Its not working sorry ");
            }
    }
}


