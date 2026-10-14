# Exercício 01 — Referências de Objetos em Java

## 🎯 Objetivo
Entender como duas variáveis podem apontar para o mesmo objeto e como a alteração feita por uma delas afeta a outra.

## 📚 Conceitos praticados
- Criação de objetos com `new`.
- Tipos de referência.
- Atribuição de referências.
- Encapsulamento com `private`, `get` e `set`.
- Garbage Collector.

## 💻 Código principal

```java
Product p1 = new Product(100);
Product p2 = new Product(0);

p2 = p1;

p2.setPreco(250);

System.out.println(p1.getPreco());
```

## ✅ Resultado

```text
250.0
```

## 🧠 Explicação

1. `p1` referencia um objeto `Product` com preço `100`.
2. `p2` inicialmente referencia outro objeto, com preço `0`.
3. Com `p2 = p1`, as duas variáveis passam a referenciar o mesmo objeto.
4. `p2.setPreco(250)` altera o preço desse objeto.
5. Ao consultar o preço por `p1`, o resultado é `250.0`, pois ambas as referências apontam para o mesmo objeto.

O objeto criado inicialmente por `p2` fica sem referência alcançável após a atribuição e pode ser recolhido pelo Garbage Collector.

## 📌 Aprendizado principal

**Atribuir uma referência a outra não copia o objeto. Copia a referência para o objeto.**

Por isso, alterações no objeto realizadas por uma referência podem ser observadas através da outra.
