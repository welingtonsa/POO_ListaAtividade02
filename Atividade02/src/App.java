import java.util.Scanner;

/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

2 - Fa um programa que leia um número inteiro 
positivo N e imrpima todos os númetos naturais de
0 até N em ordem decrescente.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        int entradaUsuario;
        Scanner userInput = new Scanner(System.in);

        /* Recebendo entrada do usuario. */
        System.out.println("Digite um valor Inteiro:");
        entradaUsuario = userInput.nextInt();

        /*Repetição para decrementar ate 0 *****************/
        for (int i = entradaUsuario; i > 0; i--) {
            System.out.println(i);
        }
    }
}
