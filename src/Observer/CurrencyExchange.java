package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {

    private final List<IObserver> observers = new ArrayList<>();
    private double rate;

    public void setRate(double rate) {
        this.rate = rate;
        notifyObservers();
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(rate);
        }
    }
}
