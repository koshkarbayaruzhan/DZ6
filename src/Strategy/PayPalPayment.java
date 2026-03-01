package org.example.strategy;

public class PayPalPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount + " ₸");
    }
}
