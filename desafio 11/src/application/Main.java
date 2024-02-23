package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double calculate;
        int avarageGrade;

        System.out.print("Quantos alunos serão: ");
        int numbersToExecute = sc.nextInt();

        String studentName[] = new String[numbersToExecute];
        double firstGrade[] = new double[numbersToExecute];
        double secondGrade[] = new double[numbersToExecute];


        for (int i = 0; i<numbersToExecute; i++) {
            System.out.printf("\nDigite o nome do aluno, primeira nota e segunda do %do aluno(a): \n", i+1);
            sc.nextLine();
            studentName[i] = sc.nextLine();
            firstGrade[i] = sc.nextDouble();
            secondGrade[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        // Inicializa um loop que acontece até atingir o valor de numbersToExecute.
        for (int i = 0; i<numbersToExecute; i++) {
            calculate = (firstGrade[i] + secondGrade[i]) / 2;

            if (calculate > 6) {
                avarageGrade = i;

                // obtem o nome do estudante aprovado com base no índice avarageGrade
                String approvedStudents = studentName[avarageGrade];
                System.out.println(approvedStudents);
            }
        }

        sc.close();
    }
}
