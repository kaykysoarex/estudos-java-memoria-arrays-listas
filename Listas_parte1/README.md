# List em Java — Conceito e Teoria

## O que é List?

`List` é uma **interface** do Java que define operações para trabalhar com listas de elementos.

Como uma interface não pode ser instanciada diretamente, utilizamos classes que a implementam, como `ArrayList` e `LinkedList`.

## Principais características

- **Tamanho variável:** pode aumentar ou diminuir durante a execução.
- **Inserção e remoção:** permite adicionar e remover elementos.
- **Acesso por índice:** os elementos podem ser acessados por suas posições, começando pelo índice `0`.
- **Implementações diferentes:** cada classe possui características e desempenho próprios.

## Array (vetor) vs. List

| Array (vetor) | List |
|---|---|
| Tamanho fixo após a criação | Tamanho variável |
| Pode armazenar tipos primitivos | Utiliza tipos de referência, como `Integer` |
| Acesso por índice | Acesso por índice |

## Principais implementações

- `ArrayList`: permite acesso rápido aos elementos por índice. Inserções e remoções no meio podem exigir o deslocamento de outros elementos.
- `LinkedList`: utiliza uma estrutura encadeada. O acesso por índice exige percorrer os elementos, enquanto algumas inserções e remoções podem ser eficientes.

## Exemplo

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Kayky");
        nomes.add("Maria");

        System.out.println(nomes.get(0));

        nomes.remove("Maria");
    }
}
```

## Resumo

`List` é uma interface utilizada para trabalhar com coleções de tamanho variável. Para criar uma lista, usamos uma classe que a implementa, como `ArrayList`. A escolha da implementação depende das operações que serão realizadas.

**Observação:** `ArrayList` e `LinkedList` são classes que implementam a interface `List`.
