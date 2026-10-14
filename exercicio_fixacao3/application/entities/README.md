# Exercício 03 — Referências entre Objetos em Java

## Objetivo
Entender como um objeto pode guardar uma referência para outro objeto.

## Conceitos praticados
- Classes e objetos.
- Construtores.
- Atributos de referência.
- Palavra-chave `this`.
- Acesso a atributos de objetos relacionados.

## Código principal

```java
Endereco endereco = new Endereco("Rua Maria coelho dias");

Person person = new Person("Kayky", endereco);

System.out.println(person.nome);
System.out.println(person.endereco.rua);
```

## Resultado esperado

```text
Kayky
Rua Maria coelho dias
```

## Explicação

1. `new Endereco(...)` cria um objeto que armazena o nome da rua.
2. `new Person("Kayky", endereco)` cria uma pessoa e recebe a referência do endereço.
3. `this.endereco = endereco` guarda essa referência no atributo da pessoa.
4. `person.nome` acessa o nome da pessoa.
5. `person.endereco.rua` acessa o endereço associado à pessoa e obtém o nome da rua.

## Aprendizado principal

Um objeto pode armazenar uma referência para outro objeto. Assim, podemos acessar seus dados por meio dessa ligação.

Exemplo: `Person` → `Endereco`.

Essa relação ajuda a entender como os objetos se conectam na memória Heap.
