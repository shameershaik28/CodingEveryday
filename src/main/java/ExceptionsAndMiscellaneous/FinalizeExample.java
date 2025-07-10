package ExceptionsAndMiscellaneous;

public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Make object eligible for GC

        System.gc(); // Suggest Java to run GC (not guaranteed)
    }
}

