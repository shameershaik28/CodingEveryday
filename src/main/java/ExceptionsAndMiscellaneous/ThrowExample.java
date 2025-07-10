package ExceptionsAndMiscellaneous;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("You must be 18+");
        }
        System.out.println("Access granted");
    }
}

