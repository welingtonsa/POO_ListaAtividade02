import java.util.Scanner;

/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

 11 - Escreva um programa que leia um numero inteiro,
 maior ou igual a zwro, do usuario. Imprima o enésimo
 termo da sequência de fibonacci. essa sequência
 começa no termo de ordem zero,e , a partir do 
 segundo termo, seu valor é dado pela soma dos dois 
 termos anteriores. Alguns termos dessa sequência são:
 Exe: 0,1,1,2,3,5,8,13,21,34....

*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        long  resultado, numero01 = 0, numero02 = 1;
        int entradaUsuario; 
        Scanner userInput = new Scanner(System.in); 

        System.out.println("Digite quantos valores desejar ver da sequencia de fibonacci:");
        entradaUsuario = userInput.nextInt();

        /*Imprimindo os primeiros valores da sequencia******/
        System.out.println(numero01);
        System.out.println(numero02);

        System.out.println("Sequencia:");
        /*Seguindo a sequencia ate o centesimo N*/
        for (int i = 0; i < entradaUsuario; i++) {            
            resultado = numero01 + numero02;
            System.out.println(resultado);
            numero01 = numero01 + numero02;
            numero02 = numero01 - numero02;
        }
        System.out.println("Fim:");
    }
}
