/*
IFTM 22/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

4 - Faça um programa que determine e motre os 
cincos primeiros multiplos de e considerando 
números maiores que 0.
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema. *****************/
        int entradoUsuario = 10;

        /*Repeção para exibir os multiplos da entrada do usuario ate 5. */
        for (int i = 0; i <= 5; i++) {
            System.out.printf("Resultado: %2d \n" ,entradoUsuario * i);
        }
    }
}
