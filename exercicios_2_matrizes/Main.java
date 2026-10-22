package exercicios_2_matrizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int pares = 0;
         
        System.out.println("Digite o número de linhas:");
        int l = sc.nextInt();

        System.out.println("Digite o número de colunas:");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        int maior = mat[0][0];
        System.out.println("Digite os elementos");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                soma += mat[i][j] = sc.nextInt();

                if (mat[i][j] % 2 == 0) {
                    pares++;
                }

                if (i == 0 && j == 0) {
                    maior = mat[i][j];
                } else if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }

            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Quantidades de pares: " + pares);
        System.out.println("Maior número: " + maior);
        sc.close();
    }
}
