package org.example.strategy;

import java.util.Scanner;

public class StrategyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Банковская карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");

        int choice = sc.nextInt();

        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1 -> context.setStrategy(new CardPayment());
            case 2 -> context.setStrategy(new PayPalPayment());
            case 3 -> context.setStrategy(new CryptoPayment());
            default -> {
                System.out.println("Ты выбрал херню.");
                return;
            }
        }

        context.executePayment(amount);
    }
}
