import java.util.Scanner;

/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

14 - Escreva um  programa que leia certa quantidade
de números, imprima o maior deles e quantas vezes o maior
número doi lido. A quantidade de números a serem lidos 
deve ser fornecida pelo usuário. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        int entrada, maior = 0, count = 0; 
        Scanner userInpunt = new Scanner(System.in);

        do {
            /*Lendo determinada quantidade de números********/
            System.out.println("Digite numeros inteiros: / -1 para sair.");
            entrada = userInpunt.nextInt(); 
            /*Eliminando número negativo de saida do programa.*/
            if (entrada > 0 ) {
                /*Caso entrada for maior, salvo e contabilizo mais um maior. */
                if (entrada > maior) {
                    maior = entrada;
                    count ++;
                }
            }
        } while (entrada > 0);
        System.out.println();
        System.out.println("Apresentando Resultado> ");

        System.out.println("Maior: " + maior);
        System.out.println("Quantidade: " + count);


    }
}
