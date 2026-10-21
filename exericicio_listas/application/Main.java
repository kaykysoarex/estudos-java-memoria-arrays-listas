
package application;

import entities.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        // PARTE 1 - CADASTRO DOS PRODUTOS

        System.out.print("Quantos produtos serao cadastrados? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.println();
            System.out.println("Produto #" + i);

            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasId(lista, id)) {
                System.out.print("ID ja cadastrado. Digite outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preco: ");
            double preco = sc.nextDouble();

            lista.add(new Produto(id, nome, preco));
        }

        // PARTE 2 - AUMENTO DO PRECO

        System.out.println();
        System.out.print("Digite o ID do produto que tera aumento: ");
        int id = sc.nextInt();

        Produto produto = lista.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        if (produto == null) {
            System.out.println("Este ID nao existe!");
        } else {
            System.out.print("Digite o percentual de aumento: ");
            double percentual = sc.nextDouble();

            produto.aumentarPreco(percentual);
        }

        // PARTE 3 - LISTAGEM DOS PRODUTOS

        System.out.println();
        System.out.println("Lista de produtos:");

        for (Produto obj : lista) {
            System.out.println(obj);
        }

        sc.close();
    }

    // Verifica se o ID ja existe na lista

    public static boolean hasId(List<Produto> lista, int id) {

        Produto produto = lista.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);

        return produto != null;
    }
}

