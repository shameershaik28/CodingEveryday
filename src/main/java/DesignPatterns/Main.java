package DesignPatterns;

public class Main {
    public static void main(String[] args) {
//        //singleton
//        Singleton s1 = Singleton.getObject();
//        Singleton s2 = Singleton.getObject();
//        Singleton s3 = Singleton.getObject();


        singletonAdv s4 = singletonAdv.getInstance();
        singletonAdv s5 = singletonAdv.getInstance();

    }
}
