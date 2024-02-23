package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos usuários você vai cadastrar? ");
        int registeredUsers = sc.nextInt();

        String userName[] = new String[registeredUsers];
        int userAge[] = new int[registeredUsers];

        for (int i = 0; i<registeredUsers; i++) {

            System.out.printf("\nDados do %do usuário: \n", i +1);

            System.out.print("Name: ");
            userName[i] = sc.next();

            System.out.print("Age: ");
            userAge[i] = sc.nextInt();

        }

        int oldestUser = 0;
          // o loop for começa com i igual a 1 porque sso é comum quando já inicializou oldestUser fora do loop com o valor 0.
         // a ideia é começar a comparar as idades a partir do segundo usuário.
        for (int i = 1; i < registeredUsers; i++) {
            
          // comparando a idade do usuário na posição i com a idade do usuário na posição indiceMaisVelho. 
          // se a idade de userAge[i] for maior que a idade do usuário mais velho até agora (representado por userAge[oldestUser]),
          // atualizamos oldestUser para i, indicando que encontramos uma pessoa mais velha.
            if (userAge[i] > userAge[oldestUser]) {  
                oldestUser = i;
            }
        }

        // pegando o indice da pessoa mais velha de oldestUser e usando para acessar o array userName[]
        // e obter o nome da pessoa mais velha, que é armazenado na variável 
        String oldestUserName = userName[oldestUser]; 

        System.out.println("Usuário mais velho(a): "+ oldestUserName);

        sc.close();
    }
}
