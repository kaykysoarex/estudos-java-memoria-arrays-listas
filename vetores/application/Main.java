package vetores.application;

import java.util.Locale;
import java.util.Scanner;
import vetores.entities.Person;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int cadastroValor = sc.nextInt();

        Person[] lista = new Person[cadastroValor];

        // Cadastro das pessoas
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            lista[i] = new Person(nome, altura);
        }

        // Soma das alturas
        double soma = 0.0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i].getAltura();
        }

        // Cálculo da média
        double media = soma / lista.length;

        // Exibição dos dados
        System.out.println("\nPESSOAS CADASTRADAS:");

        for (int i = 0; i < lista.length; i++) {
            System.out.printf(
                "%s - %.2f m%n",
                lista[i].getNome(),
                lista[i].getAltura()
            );
        }

        System.out.printf("%nALTURA MÉDIA: %.2f%n", media);

        sc.close();
    }
}
