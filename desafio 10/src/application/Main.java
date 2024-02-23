package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos usuários você vai cadastrar? ");
        int registeredUsers = sc.nextInt();

        String userName[] = new String[registeredUsers];
        int userAge[] = new int[registeredUsers];

        for (int i = 0; i<registeredUsers; i++) {

            System.out.printf("\nDados do %do usuário: \n", i +1);

            System.out.print("Name: ");
            userName[i] = sc.next();

            System.out.print("Age: ");
            userAge[i] = sc.nextInt();

        }

        int oldestUser = 0;
        for (int i = 1; i < registeredUsers; i++) {
            if (userAge[i] > userAge[oldestUser]) {
                oldestUser = i;
            }
        }

        String oldestUserName = userName[oldestUser];

        System.out.println("Usuário mais velho(a): "+ oldestUserName);

        sc.close();
    }
}