import java.util.Scanner;

/*
IFTM 30/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

23 - Faça um programa que leia uma matriz de 
tamanho 3x3  e faça as seguintes operações entre matrizes:

    a - soma entre 2 matrizes
    b - subtração entre 2 matrizis
    c - multiplicação entre 2 matrizes
    d - divisão das duas matrizes. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema ****************/
        int myMatrix[][] = new int [3][3];
        double soma[][] = new double[3][3];
        double subtracao[][] = new double[3][3];
        double multiplicacao[][] = new double[3][3];
        Scanner userInput = new Scanner(System.in); 


        /* Preenchendo a matrix com valores fornecidos pelo usuario.*/
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                System.out.println("Digite um valor: ");
                myMatrix[i][j] = userInput.nextInt();
            }
        }

        /* Imprimindo os valores padrões fornecidos pelo usuario. */
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                System.out.print(myMatrix[i][j] + " ");

                /* Soma dos vetores.*/
                soma[i][j] = myMatrix[i][j] + myMatrix[i][j];
                subtracao[i][j] = myMatrix[i][j] - myMatrix[i][j];
                multiplicacao[i][j] = myMatrix[i][j] * myMatrix[i][j];
            }
            System.out.println();
        }
        System.out.println();

        /* Imprimindo a soma do vetor.***************************/
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma.length; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* Imprimindo a subtração.*******************************/
         for (int i = 0; i < subtracao.length; i++) {
            for (int j = 0; j < subtracao.length; j++) {
                System.out.print(subtracao[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        /* Imprimindo a multiplicação ****************************/
        for (int i = 0; i < multiplicacao.length; i++) {
            for (int j = 0; j < multiplicacao.length; j++) {
                System.out.print(multiplicacao[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
