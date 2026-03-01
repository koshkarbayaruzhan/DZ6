package org.example.strategy;

public class PaymentContext {

    private IPaymentStrategy strategy;

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
