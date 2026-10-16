package exercicios_vetores.application;

import exercicios_vetores.entities.Funcionarios;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionarios cadastrados: ");
        int numeroFunc = sc.nextInt();

        Funcionarios[] funcionarios = new Funcionarios[numeroFunc];
        sc.nextLine();

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            double salário = sc.nextDouble();
            sc.nextLine();

            funcionarios[i] = new Funcionarios(nome, salário);
        }

        System.out.println("Cadastro de pessoas: ");

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome());

            System.out.println("Salário: " + String.format("%.2f", funcionarios[i].getSalario()));

        }

        System.out.println("Digite a % de aumento salarial: ");
        double porcentagemAumento = sc.nextDouble();

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].aumentoSalarial(porcentagemAumento);

            System.out.printf(
                    "%s - %.2f%n",
                    funcionarios[i].getNome(),
                    funcionarios[i].getSalario()
            );
        }

        sc.close();
    }
}
