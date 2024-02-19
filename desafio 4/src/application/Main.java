package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What´s the dollar price? ");
        CurrencyConverter.dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.amountDollar = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = R$%.2f%n ", CurrencyConverter.dollarConverter());
        scanner.close();
    }
}