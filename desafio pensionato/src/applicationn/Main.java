package applicationn;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int ocupadedRooms = sc.nextInt();

        // Declarando o vetor com posições de 0-9
        Student student[] = new Student[9];

        for (int i = 0; i < ocupadedRooms; i++) {
            System.out.print("Rent #" + (i+1));
            System.out.print("\nName: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            student[roomNumber] = new Student(name, email, roomNumber);
            System.out.println();

        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i<9; i++) {
            if (student[i] != null) {
                System.out.println(i + ": " + student[i]);
            }
        }

        sc.close();

    }
}