import java.util.Scanner;

/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

15 - Crie um programa que leia do teclado seis 
valores inteiros e em seguida mostra na tela os
 valores lidos. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema. ***************/
        int entrada; 
        Scanner userInput = new Scanner(System.in);

        /* Repeteção para amostragem do numeros. ***********/
        do {
            entrada = userInput.nextInt();
            /* Eliminando número negativo para contagem. ***/
            if (entrada > 0) {
                /* Amostragem de casa numero. ***************/
                System.out.println("Numeros " + entrada);
            }
        } while (entrada > 0);
        
    }
}
