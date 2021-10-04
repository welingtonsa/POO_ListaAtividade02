import java.util.Scanner;

/*
IFTM 29/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

20 - Faça um programa que receba do usuário dois
arrays, A e B, com 10 números inteiros  cada. crie 
um novo array C calculando C = A - B . Mostre na tela os dados
do array c. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variavei de controle do sistema. ****************/
        
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];

        Scanner userInput = new Scanner(System.in); 

        /* Entre com valores do arrayA*********************/
        for (int i : arrayA) {
            arrayA[i] = userInput.nextInt();
        }
        
        /* Entre com valores do arrayB*********************/
        for (int i : arrayB) {
            arrayB[i] = userInput.nextInt();
        }

        /* Subtraindo valores do arrayA - arrayB e salvando em arrayC.*/
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] - arrayB[i];
        }

        /* Exibindo cada valor e posição. *******************/
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println("Posição: " + i + " Valor: " + arrayC[i]);
        }
    }
}
