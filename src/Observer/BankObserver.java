package org.example.observer;

public class BankObserver implements IObserver {

    @Override
    public void update(double rate) {
        System.out.println("Банк получил новый курс: " + rate);
    }
}
