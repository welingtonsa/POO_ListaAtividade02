import java.util.Scanner;

/*
IFTM 29/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

19 - Faça um programa que leia um vetor de outo 
posições. Em seguida, leia também dois valores x e y quaisquer correspodentes a 
duas posições no vetor. Seu programa deverá exibir a soma
 dos valores encontrados nas respectivas posições x e y.
*/

public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema. ***************/
        int[] myVector = new int [8];
        int x, y, soma;
        Scanner userInput = new Scanner(System.in);

        /* Repetição para entrada de até 8 valores. ********/
        for (int i = 0; i < 8; i++) {
            myVector[i] = userInput.nextInt();
        }

        /* Recebendo os valores para soma de x e y posições do myVector.*/
        System.out.println("Entre 1-7 digite  posição do vetor:");
        x = userInput.nextInt(); 
        System.out.println("Entre 1-7 digite  posição do vetor:");
        y = userInput.nextInt();

        /* Somando x e y posições. **************************/
        soma = myVector[x] + myVector[y];
        System.out.println("Soma das posições X e Y = " + soma);
    }
}
