import java.util.Scanner;

/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

 9 - Escreva um programa que leia um número inteiro
e calcule a soma de todos os divisores desse número, 
com exceção dele próprio. Exemplo: a soma dos divosores
do número 66 é 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78.
*/
public class App {
    public static void main(String[] args) throws Exception {
        int entradaUsuario, somaDivisores = 0; 
        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        entradaUsuario = userInput.nextInt();

        for (int i = 1; i < entradaUsuario; i++) {
            if (entradaUsuario % i == 0) {
                System.out.println(i);
                somaDivisores = somaDivisores + i;
            }
        }
        System.out.println("Soma dos divisores = " + somaDivisores);
    }
}
