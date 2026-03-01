package org.example.observer;

public class MobileAppObserver implements IObserver {

    @Override
    public void update(double rate) {
        System.out.println("Мобильное приложение обновило курс: " + rate);
    }
}
