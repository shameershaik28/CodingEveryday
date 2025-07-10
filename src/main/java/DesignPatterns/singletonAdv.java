package DesignPatterns;

public class singletonAdv {
    private static singletonAdv instance = null;

    private singletonAdv() {

    }

//using synchronized
    public static singletonAdv getInstance() {
        if (instance == null) {
            synchronized (singletonAdv.class) {
                if (instance == null) {
                    instance = new singletonAdv();
                }
            }
        }
        return instance;
    }
}
