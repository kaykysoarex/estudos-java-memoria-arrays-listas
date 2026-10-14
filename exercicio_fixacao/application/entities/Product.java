package exercicio_fixacao.application.entities;

/**
 * Product
 */
public class Product {

    private double preco;

    public Product(double preco) {
        this.preco = preco;
    }

    public double Getpreco() {
        return preco;
    }

    public void Setpreco(double preco) {
        this.preco = preco;
    }
}