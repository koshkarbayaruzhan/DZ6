package org.example.strategy;

public class CryptoPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой: " + amount + " ₸");
    }
}
