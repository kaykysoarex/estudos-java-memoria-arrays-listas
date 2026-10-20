# Java — List (Aula 2)

## 📚 Objetivo

Aprender a manipular listas em Java utilizando métodos para adicionar, remover, consultar e filtrar elementos.

## 1. Criando uma List

```java
List<String> list = new ArrayList<>();
```

- `List`: interface que define as operações da lista.
- `String`: tipo de dado armazenado.
- `ArrayList`: classe que implementa a interface `List`.
- `<>`: permite que o Java identifique o tipo dos elementos.

## 2. Principais métodos

| Método                         | Função                                        |
| ------------------------------ | --------------------------------------------- |
| `add(elemento)`                | Adiciona um elemento                          |
| `add(indice, elemento)`        | Insere em uma posição específica              |
| `size()`                       | Retorna a quantidade de elementos             |
| `removeIf()`                   | Remove elementos que atendem a uma condição   |
| `indexOf()`                    | Retorna o índice de um elemento               |
| `stream()`                     | Inicia o processamento dos elementos da lista |
| `filter()`                     | Filtra elementos conforme uma condição        |
| `collect(Collectors.toList())` | Reúne os resultados em uma nova lista         |
| `findFirst()`                  | Retorna o primeiro resultado encontrado       |
| `orElse(null)`                 | Retorna `null` se não houver resultado        |

## 3. Inserção por índice

```java
list.add(2, "Marco");
```

Insere `"Marco"` na posição de índice `2`. Os elementos seguintes são deslocados para a direita.

**Importante:** os índices começam em `0`.

## 4. Removendo elementos com removeIf

```java
list.removeIf(x -> x.charAt(0) == 'M');
```

Remove todos os nomes cuja primeira letra é `'M'`.

- `x`: representa cada elemento analisado.
- `charAt(0)`: retorna o primeiro caractere da String.
- `== 'M'`: verifica se o caractere é igual a `'M'`.
- `->`: separa o parâmetro da condição.

## 5. Consultando índices

```java
System.out.println(list.indexOf("Bob"));
System.out.println(list.indexOf("Marco"));
```

`indexOf()` retorna a posição do elemento na lista. Se o elemento não existir, retorna `-1`.

## 6. Filtrando com Stream

```java
List<String> result = list.stream()
    .filter(x -> x.charAt(0) == 'A')
    .collect(Collectors.toList());
```

Cria uma nova lista contendo somente os nomes que começam com `'A'`.

A lista original não é alterada por esse filtro.

## 7. Encontrando o primeiro resultado

```java
String name = list.stream()
    .filter(x -> x.charAt(0) == 'J')
    .findFirst()
    .orElse(null);
```

Procura o primeiro nome que começa com `'J'`.

- Se encontrar, retorna o nome.
- Se não encontrar, retorna `null`.

## Resumo

Nesta aula, aprendi a manipular listas usando inserção por índice, remoção condicional, consulta de posições e filtragem com `Stream`.

Esses recursos permitem trabalhar com coleções de forma mais flexível e selecionar elementos de acordo com condições específicas.

**Observação:** para utilizar `ArrayList`, `List` e `Collectors`, é necessário importar as classes correspondentes de `java.util` e `java.util.stream`.
