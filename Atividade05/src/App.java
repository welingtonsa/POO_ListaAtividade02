/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

5 - Faça um programa que calcule e mostre a soma dos 
50 primeiros números pares. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema*******************/
        int soma = 0, qtd = 0; 

        for (int i = 0; i < 50; i++) {
            /*Condição para testar se i tem resto 0.*********/
            if (i % 2 == 0 ) {
                soma = soma + i; 
                qtd++;
            }
        }
        /*Resultado da soma do numeros pares******************/
        System.out.println("Resultado: " + soma);
        System.out.println("Qunatidade numeros pares: " + qtd);
    }
}
