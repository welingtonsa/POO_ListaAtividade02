import java.util.Scanner;

/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

12 - Elabore um programa que faça a leitura de
vários números inteiros até que se digite números 
negativos. O programa tem de retornar o maior e 
o menor número lido.

*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema *****************/
        Scanner userInput = new Scanner(System.in);
        int entradaUsuario = 0, maior = 0, menor = 0;

        /*Entrada do usuario.*/
        System.out.println("Digite valores inteiros: Digite -1 para sair:");
        entradaUsuario = userInput.nextInt();         
        maior = entradaUsuario;
        menor = entradaUsuario;

        do {
           entradaUsuario = userInput.nextInt();
           if (entradaUsuario > 0) {
                if (entradaUsuario > maior) {
                    maior = entradaUsuario;
                    System.out.println("Maior!");
                }    
                if (entradaUsuario < menor) {
                    menor = entradaUsuario;
                    System.out.println("Menor!");
                }
           }            
        } while (entradaUsuario > 0);

        System.out.println("EXIT!");
        System.out.println("Menor: " + menor + " < > Maior: " + maior );
    }
}
