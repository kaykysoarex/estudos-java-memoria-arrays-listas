package listas_parte2.entities;

public class Funcionarios {

    private Integer id;
    private String nome;
    private Double salario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double aumentoSalario(Double percentual) {
        this.salario += this.salario * percentual / 100.0;
        return this.salario;
    }

    public String toString() {
        return "Lista de funcionarios: \n" + getId() + ", " + getNome() + ", " + String.format("%.2f", getSalario());
    }

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
}
