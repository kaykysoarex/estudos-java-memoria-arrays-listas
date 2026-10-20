package listas_parte2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import listas_parte2.entities.Funcionarios;

public class MainEx {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionarios:");
        int n = sc.nextInt();

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");

            System.out.println("Digite o ID:");
            Integer id = sc.nextInt();

            // Verifica se o ID já existe na lista
            boolean idExistente = false;

            for (Funcionarios funcionario : funcionarios) {
                if (funcionario.getId().equals(id)) {
                    idExistente = true;
                    break;
                }
            }

            // Enquanto o ID existir, solicita outro
            while (idExistente) {
                System.out.println("ID existente! Digite outro ID:");
                id = sc.nextInt();

                idExistente = false;

                for (Funcionarios funcionario : funcionarios) {
                    if (funcionario.getId().equals(id)) {
                        idExistente = true;
                        break;
                    }
                }
            }

            sc.nextLine(); // Consome a quebra de linha

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o salario:");
            Double salario = sc.nextDouble();

            // Adiciona o funcionário com o ID, nome e salário
            funcionarios.add(new Funcionarios(id, nome, salario));
        }
        
        System.out.println("Digite o ID do funcionario que tera aumento:");
        Integer idAumento = sc.nextInt();

        boolean encontrado = false;

        for (Funcionarios funcionario : funcionarios) {
            if (funcionario.getId().equals(idAumento)) {
                System.out.println("Digite a porcentagem:");
                Double aumentoSalarial = sc.nextDouble();

                funcionario.aumentoSalario(aumentoSalarial);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O ID digitado não existe!");
        }

        System.out.println("\nFuncionarios cadastrados:");

        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        sc.close();
    }
}
