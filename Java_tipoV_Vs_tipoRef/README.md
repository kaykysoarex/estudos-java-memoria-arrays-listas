# Java — Tipo Valor vs. Tipo Referência

Este material faz parte dos meus estudos de Java e aborda as diferenças entre tipos primitivos e tipos referência, incluindo o comportamento das variáveis na memória.

## 📚 1. Tipo Valor

Os tipos primitivos armazenam o próprio valor na variável. Quando atribuímos uma variável primitiva a outra, o valor é copiado.

**Exemplo:**

```java
int x = 10;
int y = x;

y = 20;

System.out.println(x); // 10
System.out.println(y); // 20
```

Nesse caso, alterar `y` não modifica `x`, pois cada variável possui seu próprio valor.

**Principais tipos primitivos:**
- `int`
- `double`
- `boolean`
- `char`
- `byte`
- `short`
- `long`
- `float`

## 🔗 2. Tipo Referência

Variáveis de tipos referência armazenam uma referência a um objeto criado na memória. Quando uma referência é atribuída a outra, ambas passam a apontar para o mesmo objeto.

**Exemplo:**

```java
Product p1 = new Product();
p1.name = "Notebook";

Product p2 = p1;
p2.name = "Mouse";

System.out.println(p1.name); // Mouse
System.out.println(p2.name); // Mouse
```

Como `p1` e `p2` referenciam o mesmo objeto, a alteração feita por `p2` também pode ser observada por `p1`.

## 🚫 3. Valor `null`

O valor `null` indica que uma variável de referência não está apontando para nenhum objeto.

```java
Product p1 = null;
```

Tentar acessar um atributo ou método por meio de uma referência `null` causa um erro em tempo de execução chamado `NullPointerException`.

## 🧠 4. Diferenças principais

| Tipo Valor                                       | Tipo Referência                                    |
| ------------------------------------------------ | -------------------------------------------------- |
| Exemplo: `int`, `double`                         | Exemplo: `String`, `Product`                       |
| A atribuição copia o valor                       | A atribuição copia a referência                    |
| Cada variável primitiva mantém seu próprio valor | Duas referências podem apontar para o mesmo objeto |
| Não utiliza `null`                               | Pode receber `null`                                |

## 🎯 Objetivo

Compreender como Java trabalha com valores e referências, entender por que duas variáveis podem compartilhar o mesmo objeto e evitar erros comuns ao manipular objetos.

## 🛠️ Tecnologias

- Java
- Visual Studio Code
- Git e GitHub

---

**Projeto de estudos pessoal — Sistemas de Informação.**