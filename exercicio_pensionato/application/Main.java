package exercicio_pensionato.application;

import exercicio_pensionato.entities.Pensionato;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int quantidadeAlunos = sc.nextInt();
        sc.nextLine();

        Pensionato[] pensionatos = new Pensionato[quantidadeAlunos];

        for (int i = 0; i < pensionatos.length; i++) {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o email: ");
            String email = sc.nextLine();

            System.out.println("Digite o numero do quarto: ");
            int quarto = sc.nextInt();
            sc.nextLine();

            if (pensionatos[i].getQuarto() == quarto) {

            }
            pensionatos[i] = new Pensionato(nome, email, quarto);
        }

        for (int i = 0; i < pensionatos.length; i++) {
            System.out.println("Aluguel: #" + (i + 1));
            System.out.println("Nome: " + pensionatos[i].getNome());
            System.out.println("Email: " + pensionatos[i].getEmail());
            System.out.println("Quarto: " + pensionatos[i].getQuarto());
        }

        System.out.println();

        for (int i = 0; i < pensionatos.length; i++) {
            if (pensionatos[i] != null) {
                System.out.println("Quartos ocupados: ");
                System.out.println(pensionatos[i].getQuarto() + ": Nome: " + pensionatos[i].getNome() + " | Email: " + pensionatos[i].getEmail());
            }
        }
        sc.close();
    }
}
