package exercicio_fixacao2.application;

import exercicio_fixacao2.application.entities.Person;

public class Main {
    public static void main(String[] args) {
        Person person = null;

        if (person == null) {
             person = new Person("Kayky");
            System.out.println(person.nome);
        }
    }
}
