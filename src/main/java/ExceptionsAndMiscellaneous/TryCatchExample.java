package ExceptionsAndMiscellaneous;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } finally {
            System.out.println("This always runs.");
        }
    }
}

