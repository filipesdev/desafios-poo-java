package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix M lines: ");
        int lines = scanner.nextInt();
        System.out.print("Matrix N rows: ");
        int rows = scanner.nextInt();
        int [][] matriz = new int[lines][rows];

        System.out.println("Input the numbers that will be alocated in your array: ");
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++) {

                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Input the number into the array you want to check: ");
        int chosenNumberToAvaliated = scanner.nextInt();

        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j<matriz.length; j++) {
                if (matriz[i][j] == chosenNumberToAvaliated) {
                    System.out.println("Position: " + i +", "+ j);
                    System.out.println("Left: " + matriz[i][j-1]);
                    System.out.println("Right: " + matriz[i][j+1]);
                    System.out.println("Up: " + matriz[i-1][j]);
                    System.out.println("Down: " + matriz[i+1][j]);
                }
            }
        }

        scanner.close();

    }
}