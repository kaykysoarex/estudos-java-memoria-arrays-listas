# Exercício 02 — Referências e `null` em Java

## Objetivo
Entender como declarar uma referência sem objeto, verificar se ela é `null` e depois atribuir um objeto a ela.

## Conceitos praticados
- Tipos de referência.
- Valor `null`.
- Condicional `if`.
- Criação de objetos com `new`.
- Escopo de variáveis.

## Código principal

```java
Person person = null;

if (person == null) {
    person = new Person("Kayky");
    System.out.println(person.nome);
}
```

## Resultado esperado

```text
Kayky
```

## Explicação

1. `Person person = null;` declara uma referência que ainda não aponta para nenhum objeto.
2. `if (person == null)` verifica se a referência está vazia.
3. `new Person("Kayky")` cria um objeto da classe `Person`.
4. `person = new Person("Kayky")` atribui a referência do objeto à variável.
5. `System.out.println(person.nome)` acessa e imprime o nome armazenado no objeto.

## Aprendizado principal

**`null` indica que uma referência não aponta para nenhum objeto.** Antes de acessar os atributos de um objeto, precisamos garantir que a referência aponta para um objeto válido para evitar um `NullPointerException`.
