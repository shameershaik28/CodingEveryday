package DesignPatterns.Strategy;

public class PaymentContext implements PaymentStrategy{
    private PaymentStrategy strategy;


    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(int amount){
       if(strategy==null){
           System.out.println("Please select a payment method.");
       }
       else
       {
           strategy.pay(amount);
       }
    }
}
