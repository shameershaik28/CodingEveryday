package DesignPatterns.Singleton.ThreadSafeSingleton;

public class AdvanceSingleton {
    private static AdvanceSingleton instance;

    private AdvanceSingleton() {
        System.out.println("AdvanceSingleton constructor");
    }

    public static synchronized AdvanceSingleton getInstance() {
        if (instance == null) {
            instance = new AdvanceSingleton();
        }
        return instance;
    }

}
