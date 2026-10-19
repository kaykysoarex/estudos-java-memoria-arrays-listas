# Java — For Each

## O que é?

O `for each` é uma estrutura de repetição utilizada para percorrer todos os elementos de um vetor ou coleção, sem precisar controlar os índices manualmente.

## Sintaxe

```java
for (Tipo variavel : colecao) {
    // Código
}
```

- **Tipo:** tipo dos elementos.
- **Variável:** recebe o elemento atual.
- **Coleção:** vetor ou coleção percorrida.

## Exemplo com vetor

```java
int[] numeros = {10, 20, 30};

for (int numero : numeros) {
    System.out.println(numero);
}
```

O laço percorre o vetor e imprime cada número.

## Exemplo com objetos

```java
for (Pensionato pensionato : pensionatos) {
    if (pensionato != null) {
        System.out.println(pensionato.getNome());
    }
}
```

Nesse exemplo, cada objeto do vetor é acessado pela variável `pensionato`. A verificação de `null` evita acessar posições sem objetos.

## For tradicional x For Each

| For tradicional | For Each |
|---|---|
| Utiliza índices. | Percorre os elementos diretamente. |
| Permite controlar as posições. | Deixa o código mais simples. |
| Útil quando o índice é necessário. | Útil para consultar e exibir elementos. |

## Resumo

- Percorre todos os elementos de um vetor ou coleção.
- Não exige controle manual de índices.
- Funciona com tipos primitivos e objetos.
- Não fornece diretamente o índice do elemento.
- É indicado quando precisamos acessar os elementos sem controlar suas posições.

**Conclusão:** o `for each` simplifica a leitura e a escrita de códigos que percorrem vetores e coleções.

---

*Material de estudo — Java | Sistemas de Informação*
