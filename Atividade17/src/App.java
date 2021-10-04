import java.util.Scanner;

/*
IFTM 04/10/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

17 - Faça um programa que leia cinco valores 
e armazene em um vetor. Em seguida mostre 
tpdps ps valores lidos juntamente com a media
dos valores. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /** Variaveis de controle do sistema.************* */
        int[] myVector = new int[5];
        int soma= 0, entradaUsuario;
        double media;
        Scanner userInput = new Scanner(System.in);

        /** Recebendo valores do usuario.  */
        for (int i = 0; i < myVector.length; i++) {
            myVector[i] = userInput.nextInt();

            soma = soma + myVector[i];
        }

        media = soma / myVector.length;

        for (int i = 0; i < myVector.length; i++) {
            System.out.print(". "+ myVector[i]);
        }
        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);
    }
}
