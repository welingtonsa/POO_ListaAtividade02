import java.util.Scanner;

/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

8 - Faça um algoritimo que leia um número 
positivo e imprima seus divisores. Exemplo:
os divisores do número 66 são: 1,2,3,11,22,33, e 66.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do Sistema*******************/
        int entradaUsuario, divisor;
        Scanner userInput = new Scanner(System.in); 

        System.out.println("Digite um valor inteiro:");
        entradaUsuario = userInput.nextInt();

        for (int i = 1; i <= entradaUsuario; i++) {

            if (entradaUsuario % i == 0) {
                System.out.println("Divisores: " + i);
            }
            
            
        }
        
    }
}
