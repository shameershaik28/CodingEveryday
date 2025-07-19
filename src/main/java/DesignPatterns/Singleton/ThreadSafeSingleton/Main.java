package DesignPatterns.Singleton.ThreadSafeSingleton;

import DesignPatterns.Singleton.BasicSingleton.Singleton;

public class Main {
    public static void main(String[] args) {
        AdvanceSingleton s1 = AdvanceSingleton.getInstance();
        AdvanceSingleton s2 = AdvanceSingleton.getInstance();

        System.out.println(s1==s2);
    }
}
