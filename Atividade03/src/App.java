import java.util.Scanner;

/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

3 - Faça um programa que leia um número inteiro N
e depois imprima os N primeiros números naturais ímpares.
*/

public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        int entradaUsuario;
        Scanner userInput = new Scanner(System.in) ; 

        /** Recebendo entrada do usuario */
        System.out.println("Digite um valor inteiro: ");
        entradaUsuario = userInput.nextInt(); 
        
        /*Repetição de controle para calcular de 0 ate entrada do usario.*/
        for (int i = 0; i < entradaUsuario; i++) {
            /*Tese booleano, caso negativo imprima numero impar para usuario.*/
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
    }
}
