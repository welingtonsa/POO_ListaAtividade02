import java.util.Scanner;

/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

7 - Elabore um algoritimo que peça ao usuário
para digitar 10 valores. Some esses valores e 
apresente o resultado na tela. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle ddo sistema*****************/
        Scanner userInput = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 10 valores inteiros: ");
        /*Para cada i soma entrada do usurio.*/
        for (int i = 0; i < 10; i++) {
            soma = soma + userInput.nextInt();
        }
        /*Imprime para usuario resultado da sooma das entradas*/
        System.out.println("Soma = " + soma);
    }
}
