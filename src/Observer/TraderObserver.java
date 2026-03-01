package org.example.observer;

public class TraderObserver implements IObserver {

    @Override
    public void update(double rate) {
        System.out.println("Трейдер анализирует курс: " + rate);
    }
}
