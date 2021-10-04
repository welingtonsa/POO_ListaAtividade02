/*
IFTM 23/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

 10 - Faça um programa que exiba a soma de todos os 
 números naturais abaixo de 1000 que são multiplos 
 de 3 e 5.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema******************/
        int multiploTres = 0, multiplosCinco = 0;

        /*Repetição para multiplicar e somas os multiplos de 3 e 5 */
        for (int i = 0; i < 1000; i++) {
            multiploTres = multiploTres + 3 * i;
            multiplosCinco = multiplosCinco + 5 * i;
        }

        System.out.println("Multiplos de Três: " + multiploTres);
        System.out.println("Multiplos de Cinco: " + multiplosCinco);
    }
}
