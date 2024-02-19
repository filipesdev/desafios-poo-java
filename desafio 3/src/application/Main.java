package application;

import entitites.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter your name: ");
        student.name = sc.nextLine();

        student.avarage1 = sc.nextDouble();
        student.avarage2 = sc.nextDouble();
        student.avarage3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + student.getAvarage());

        if (student.getAvarage() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f POINTS%n", student.calculateMissingPoints());

        } else {
            System.out.println("PASS");
        }

        sc.close();

    }
}