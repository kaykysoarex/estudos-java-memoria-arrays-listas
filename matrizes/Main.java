package matrizes;

public class Main {
    public static void main(String[] args) {

        // Criando uma matriz com 2 linhas e 3 colunas
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Acessando um elemento da matriz
        System.out.println(matriz[0][0]); // 10

        // Primeira posição: linha
        // Segunda posição: coluna
        System.out.println(matriz[1][2]); // 60

        // Percorrendo todas as linhas e colunas
        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

                System.out.print(matriz[linha][coluna] + " ");
            }

            System.out.println(); // Pula para a próxima linha
        }
    }
}