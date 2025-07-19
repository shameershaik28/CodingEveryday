package DesignPatterns.SOLID.ISP;

public class AdvancedPrinter implements Printer, Scanner, Fax {
    @Override
    public void print()
    {
        System.out.println("Printing Advanced Printer");
    }

    @Override
    public void scan()
    {
        System.out.println("Scanning Advanced Printer");
    }

    @Override
    public void fax()
    {
        System.out.println("Faxing Advanced Printer");
    }
}
