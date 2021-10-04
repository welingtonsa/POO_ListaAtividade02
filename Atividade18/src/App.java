/*
IFTM 29/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

18 - Faça um programa que possua um array de nome A
 que armazene seis números inteiros. O programa deve 
 executar os seguintes passos:
 
 a. Atribua os seguintes valores a esse array: 1, 0, 5, -2, -5, 7.
 b. Armazene em uma variável a soma dos valores das  posições
 A [0]. a[1], e A[5] do arrau e mostre na tela essa soma. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*VAriaveis de controle do sistema. ****************/
        int[] A = {1, 0, 5, -2, -5, 7};
        int soma = 0;
        int count = 0; 

        /*Soma das posições pré-determinadas. **************/
        soma = A[0] + A[1] + A[5];
        System.out.println("Soma das posições A[0],A[1] e A[5] = " + soma);

        /*Atribuindo o valor 100 a posição 4. **************/
        A[4] = 100;

        /*Imprimindo casa posição linha  a linha . *********/
        for (int i : A) {            
            System.out.print("P:" + count + "| Valor: " + i + " |" );
            count++;
        }

    }
}
