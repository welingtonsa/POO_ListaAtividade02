import java.util.Scanner;

/*
IFTM 30/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

21 - Faça um programa que leia um vetor de 10 
posições. Verifique se existem valores iguais 
 e os escreva na tela. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema ****************/
        int[] myVector = new int[10];
        Scanner userInput = new Scanner(System.in);

        /* Repetição para entrada dos valores de acordo com entrada do usuario.*/
        for (int i = 0; i < myVector.length; i++) {
            myVector[i] = userInput.nextInt();
        }

        System.out.println();

        /* Repetição para com comparar posições e valores. **/
        for (int i = 0; i < myVector.length; i++) {
            for (int j = 0; j < myVector.length; j++) {  

               /* Eliminando posições iguais.*/ 
               if (i != j) {
                   /* Se há valores iguais monstre na tela. */
                    if (myVector[i] == myVector[j]) {
                        System.out.println(myVector[i] + " = " + myVector[j]);   
                    }
               }
            }
        }
    }
}
