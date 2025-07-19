package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(1000);




    }
}
