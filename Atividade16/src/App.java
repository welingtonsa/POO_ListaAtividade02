import java.util.Scanner;

/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

16 - Crie um programa que leia seis valores inteiros
e em sequida mostre na tela os valores lidos na ordem
inversa. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema. ***************/
        int a, b, c, d, e, f; 
        Scanner userInput = new Scanner(System.in);

        /* Lendo os numeros. *******************************/
        a = userInput.nextInt();
        b = userInput.nextInt();
        c = userInput.nextInt();
        d = userInput.nextInt();
        e = userInput.nextInt();
        f = userInput.nextInt();
        
        /* Exibindo valores em ordem inversa. ***************/
        System.out.println(f+", "+e+", "+d+", "+c+", "+b+", "+a);
        
    }
}
