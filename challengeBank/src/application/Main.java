package application;

import entities.Account;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();


        System.out.print("Is there an initial account deposit (y/n): ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter your initial deposit: ");
             double initialDeposit = sc.nextDouble();
             account = new Account(number, holder, initialDeposit);
        } else {
             account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.print(account);

        sc.close();
    }
}