package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] matriz = new int[m][n];

        System.out.println("Escreva os números inteiros que serão alocados dentro da sua matriz: ");
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

    }
}