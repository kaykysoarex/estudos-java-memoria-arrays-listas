package exercicio_fixacao3.application;

import exercicio_fixacao3.application.entities.Person;
import exercicio_fixacao3.application.entities.Endereco;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua Maria coelho dias");

        Person person = new Person("Kayky", endereco);

        System.out.println(person.nome);
        System.out.println(person.endereco.rua);
    }
}
