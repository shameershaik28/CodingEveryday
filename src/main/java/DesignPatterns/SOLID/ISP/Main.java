package DesignPatterns.SOLID.ISP;

public class Main {
    public static void main(String[] args) {
        Printer p  = new SimplePrinter();
        Printer p2 = new AdvancedPrinter();
        Scanner s = new AdvancedPrinter();
        Fax f = new AdvancedPrinter();

        p.print();
        p2.print();
        s.scan();
        f.fax();



    }
}
