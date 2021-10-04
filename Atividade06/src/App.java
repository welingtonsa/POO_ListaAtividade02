/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

6 - Faça um programa que mostre uma contagem 
regressiva na tela , iniciando em 10 e considerando
0 . Mostre uma mensagem "FIM!" após a contagem. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        /*Repetição regressiva até 0 se i  igual 0 FIM! */
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            if (i == 0) {
                System.out.println("FIM!");
            }
        }
    }
}
