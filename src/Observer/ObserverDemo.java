package org.example.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        IObserver bank = new BankObserver();
        IObserver trader = new TraderObserver();
        IObserver mobile = new MobileAppObserver();

        exchange.attach(bank);
        exchange.attach(trader);
        exchange.attach(mobile);

        System.out.println("Установка курса: 450.5");
        exchange.setRate(450.5);

        System.out.println("\nУдаляем трейдера\n");
        exchange.detach(trader);

        System.out.println("Установка курса: 470.0");
        exchange.setRate(470.0);
    }
}
