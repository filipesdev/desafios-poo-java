import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numberToExecute = sc.nextInt();
        int evens;

        int calculator[] = new int[numberToExecute];

        for (int i = 0; i < numberToExecute; i++) {
            System.out.print("Digite um número: ");
            calculator[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares: ");

        evens = 0;
        for ( int i=0; i<numberToExecute; i++) {
            if (calculator[i] % 2 == 0) {
                System.out.printf("%d ", calculator[i]);
                evens ++;
            }
        }

        System.out.printf("\n\nQuantidade de números pares = %d\n", evens);

        sc.close();
    }
}