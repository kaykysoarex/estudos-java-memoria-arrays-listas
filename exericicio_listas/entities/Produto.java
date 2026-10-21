package entities;

public class Produto {

    private Integer id;
    private String nome;
    private Double preco;

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public double aumentarPreco(double percentual) {
        this.preco += this.preco * percentual / 100;
        return this.preco;
    }

    public String ToString() {
        return "Produtos cadastrados: \n" + getId() + ", " + getNome() + ", " + String.format("%.2f", getPreco());
    }
}
