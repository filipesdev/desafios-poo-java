import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos númeross você vai digitar? ");
        int number = sc.nextInt();

        double vect[] = new double[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avarage = sum / vect.length;

        System.out.print("Valores = ");

        for (int i = 0; i<vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSoma = %.2f%n" , sum);
        System.out.printf("Média = %.2f%n" , avarage);

        sc.close();
    }
}