package DesignPatterns.Singleton.BasicSingleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instnace is created ");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void getMessage()
    {
        System.out.println("Hello from Singleton");
    }
}
