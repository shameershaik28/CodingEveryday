package ExceptionsAndMiscellaneous;

public class AutoboxingExample {
    public static void main(String[] args) {
        int num = 10;
        Integer boxed = num;   // 🔁 Autoboxing: int → Integer
        int unboxed = boxed;   // 🔁 Unboxing: Integer → int

        System.out.println("Boxed: " + boxed);
        System.out.println("Unboxed: " + unboxed);
    }
}

