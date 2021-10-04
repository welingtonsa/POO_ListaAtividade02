import java.util.Random;

/*
IFTM 30/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

25 - Leia uma matriz de tamanho 10x3  com as ntas
de 10 alunos em três provas. Em seguida, calcule e 
escreva na tela o número de alunos cuja pior nota
foi na prova 1, o número de alunos cuja  pior nota
foi na prova 2 e o número de allunos cuja pior
nota foi na prova 3. 
*/
public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis de controle do sistema. ***************/
        int negativoProva01 = 0;
        int negativoProva02 = 0;
        int negativoProva03 = 0;
        int[][] nota = new int[10][3];
        Random dice = new Random();

        /* As notas foram randomizadas para acelerar processo de teste. */
        /* i linhas*/
        for(int i = 0; i < 10; i ++){
            /* j colunas*/
            for(int j = 0; j < 3; j ++){
                nota[i][j] = dice.nextInt(10);
            }
            System.out.println();
        }

        /* Imprimindo todas notas para verificar apos contagem negativas. */
        /* i linhas*/
        System.out.println("Pr 01 | Pr 02 | Pr 03");
        for(int i = 0; i < 10; i ++){
            /* j colunas*/
            for(int j = 0; j < 3; j ++){     
                /* Imprimi notas Prova 1 a Prova 3*/           
                System.out.print("    "+nota[i][j]);

                /* Selecionando provas para e verificando notas menores. */
                switch (j) {
                    case 0:
                        if (nota[i][j] < 6) {
                            negativoProva01 ++;
                        }
                        break;
                    case 1:
                        if (nota[i][j] < 6) {
                            negativoProva02 ++;
                        }
                        break;
                    case 2:
                        if (nota[i][j] < 6) {
                            negativoProva03 ++;
                        }
                        break;                
                    default:
                        break;
                }
            }
            System.out.println();            
        }
        System.out.println();  

        /* Imprimindo todas as provas e seus negativos. */
        System.out.println("Negativos da Prova 01 :" + negativoProva01);
        System.out.println("Negativos da Prova 02 :" + negativoProva02);
        System.out.println("Negativos da Prova 02 :" + negativoProva03);
    }
}
