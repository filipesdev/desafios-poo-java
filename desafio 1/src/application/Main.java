package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter a rectangle width and height: ");
        rectangle.Width = scanner.nextDouble();
        rectangle.Height = scanner.nextDouble();

        System.out.printf("AREA: %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.Diagonal());


        scanner.close();
    }
}