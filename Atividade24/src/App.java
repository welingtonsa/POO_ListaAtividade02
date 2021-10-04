/*
IFTM 30/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo
-Lista de Exercício Introdução Java 02
-Lista referente a presença dos dias 21 e 22/09

24 - Calcular e imprimir na tela uma matrix de tamanho
 10x10, em que seus elementos são da forma:

    a - A[i][j] = 2i + 7j - 2 se i < j
    b - A[i][j] = 3i^2 - 1 se i = j
    c - A[i][j] = 4i^3 + 5j^2 + 1 se i > j
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Variaveis de controle do sistema *****************/
        int[][] myMatrixA = new int[10][10];
        int[][] myMatrixB = new int[10][10];
        int[][] myMatrixC = new int[10][10];

        /* a - A[i][j] = 2i + 7j - 2 se i < j. **************/
        for (int i = 0; i < myMatrixA.length; i++) {
            for (int j = 0; j < myMatrixA.length; j++) {
                if (i < j) {
                    myMatrixA[i][j] = 2 * i + 7 * j - 2;                    
                }
                System.out.printf("%3d ",myMatrixA[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        /* b - A[i][j] = 3i^2 - 1 se i = j*/
        for (int i = 0; i < myMatrixB.length; i++) {
            for (int j = 0; j < myMatrixB.length; j++) {
                if (i == j) {
                    myMatrixB[i][j] = 3 *  (i * i)- 1;                    
                }
                System.out.printf("%3d ",myMatrixB[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        /* c - A[i][j] = 4i^3 + 5j^2 + 1 se i > j. *****************/
        for (int i = 0; i < myMatrixC.length; i++) {
            for (int j = 0; j < myMatrixC.length; j++) {
                if (i > j) {
                    myMatrixC[i][j] = 4 * (i * i * i) + 5 * (j * j);                    
                }
                System.out.printf("%5d ",myMatrixC[i][j]);
            }
            System.out.println();
        }
        System.out.println();


    }
}
