package exercicio_fixacao1.application;

import java.util.Locale;

import exercicio_fixacao1.application.entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product p1 = new Product(100);
        Product p2 = new Product(0);

        p2 = p1;

        p2.Setpreco(250);
        System.out.println(p1.Getpreco());

    }
}
