package exercicios_2_matrizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite o número de linhas:");
        int l = sc.nextInt();

        System.out.println("Digite o número de colunas:");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        System.out.println("Digite os elementos");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               
              soma += mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Soma: " + soma);
        sc.close();
    }
}
