package DesignPatterns.Singleton.BasicSingleton;

public class Main {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        ob1.getMessage();

        System.out.println(ob1==ob2);
    }
}
