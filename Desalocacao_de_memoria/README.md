# Java — Garbage Collector e Escopo Local

Material de estudo sobre o gerenciamento de memória em Java, abordando a desalocação de objetos e o tempo de vida das variáveis.

## 1. Garbage Collector (GC)

O Garbage Collector é o mecanismo do Java responsável por liberar a memória ocupada por objetos que não podem mais ser alcançados por referências ativas.

```java
Product p = new Product();

p = null;
```

Após `p = null`, se não houver outras referências acessíveis ao objeto, ele poderá ser coletado pelo Garbage Collector.

**Importante:** não é necessário liberar manualmente a memória dos objetos. O GC faz esse gerenciamento automaticamente, mas não garante a liberação imediata.

## 2. Escopo Local

O escopo determina onde uma variável pode ser acessada. Uma variável local é declarada dentro de um método ou bloco e só pode ser utilizada dentro desse escopo.

```java
public void exemplo() {
    int numero = 10;

    System.out.println(numero);
}
```

A variável `numero` só pode ser acessada dentro do método `exemplo()`. Quando a execução sai do escopo, ela deixa de estar acessível.

## 3. Diferença principal

- **Garbage Collector:** gerencia a memória dos objetos que não podem mais ser alcançados.
- **Escopo local:** determina onde uma variável pode ser utilizada e limita seu tempo de vida.

## 🎯 Objetivo

Compreender como Java gerencia a memória automaticamente e como o escopo controla o acesso às variáveis.

---

**Projeto de estudos pessoal — Sistemas de Informação.**