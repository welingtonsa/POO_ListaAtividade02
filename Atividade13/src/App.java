import java.util.Scanner;

/*
IFTM 29/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

13 - Em matemátematica, o número harmôico designado
por Hn define-se como o enésimo termo da série harmônico. 
Ou seja: Jn = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

Apresente um programa que valvule o valor de qualquer Hn.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*/
        int entrada, count = 0;
        float mediaHarmonica, divisao = 0;
        Scanner userInput = new Scanner(System.in);

        /** Repeção para entrada de valores.  */
        do {
            System.out.println("Digite N valores para caluclo da media Harmonica:");
            entrada = userInput.nextInt();

            /** Eliminando numeros negativo. */
            if (entrada > 0) {
                /** Calculando a divisão.  */
                divisao = entrada/1; 
                /** Somando todo N maiores que 0. */
                count ++;
            }

            /** Divisão da media Harmonica pelo quantidade de N > 0  */
            mediaHarmonica = divisao / count;

        } while (entrada > 0);
        System.out.println(count);
        System.out.println(divisao);
        System.out.println(mediaHarmonica);

    }
}
