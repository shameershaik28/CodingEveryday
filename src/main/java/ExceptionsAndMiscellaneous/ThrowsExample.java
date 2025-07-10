package ExceptionsAndMiscellaneous;

public class ThrowsExample {
    public static void main(String[] args) throws Exception {
        sayHello();
    }

    public static void sayHello() throws Exception {
        throw new Exception("Something went wrong!");
    }
}
