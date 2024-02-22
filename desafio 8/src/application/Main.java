package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int number = sc.nextInt();

        int ageMinor = 0;
        double sumAvarageHeight, avarageHeight;

        String name[] = new String[number];
        int age[] = new int[number];
        double height[] = new double[number];

        for (int i = 0; i < number; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            if (age[i] < 16) {
                ageMinor++;
            }
        }
        double percentAgeMinor = ((double) ageMinor / number) * 100.0;

        sumAvarageHeight = 0;
        for (int i = 0; i < number; i++) {
            sumAvarageHeight += height[i];
        }
        avarageHeight = sumAvarageHeight / number;

        System.out.printf("Altura média: %.2f%n", avarageHeight);
        System.out.println("Pessoas com menos de 16 anos: " + percentAgeMinor);

        for (int i = 0; i < number; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}