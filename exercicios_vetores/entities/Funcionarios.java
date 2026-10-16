package exercicios_vetores.entities;

public class Funcionarios {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void  aumentoSalarial(double porcentagem) {
         salario += salario * porcentagem / 100.0;
    }
}
