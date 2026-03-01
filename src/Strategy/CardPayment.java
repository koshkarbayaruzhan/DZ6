package org.example.strategy;

public class CardPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой: " + amount + " ₸");
    }
}
