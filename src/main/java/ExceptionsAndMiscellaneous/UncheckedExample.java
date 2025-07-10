package ExceptionsAndMiscellaneous;

public class UncheckedExample {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());  // ❌ NullPointerException (at runtime)
    }
}

