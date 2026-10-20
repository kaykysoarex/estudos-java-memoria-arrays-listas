package listas_parte2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria"); // Adiciona Maria à lista
        list.add("Alex");  // Adiciona Alex à lista
        list.add("Bob");   // Adiciona Bob à lista
        list.add("Anna");  // Adiciona Anna à lista

        list.add(2, "Marco"); // Insere Marco no índice 2, deslocando os próximos elementos

        System.out.println(list.size()); // Retorna a quantidade de elementos da lista

// Percorre a lista e imprime cada nome
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

// Remove todos os nomes cuja primeira letra é 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

// Retorna o índice do elemento; se não existir, retorna -1
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");

// Filtra a lista e cria outra lista somente com nomes que começam com 'A'
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

// Busca o primeiro nome que começa com 'J'; se não encontrar, retorna null
        String name = list.stream()
                .filter(x -> x.charAt(0) == 'J')
                .findFirst()
                .orElse(null);

        System.out.println(name);

    }
}
