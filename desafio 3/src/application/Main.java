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

        System.out.print("Enter your first note : ");
        student.avarage1 = sc.nextDouble();

        System.out.print("Enter your second note : ");
        student.avarage2 = sc.nextDouble();

        System.out.print("Enter your third note : ");
        student.avarage3 = sc.nextDouble();

        System.out.print(student.name);
        System.out.println(", FINAL GRADE: " + student.getAvarage());

        if (student.getAvarage() < 60) {
            System.out.println("Study more... FAILED");
            System.out.printf("MISSING: %.2f POINT TO PASS%n", student.calculateMissingPoints());
        } else {
            System.out.printf("PASS WITH %.2f EXTRA POINTS:%n ", student.calculateExtraPoints());
        }

        sc.close();
    }
}