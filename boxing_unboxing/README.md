# Java — Boxing, Unboxing e Wrapper Classes

## 1. Wrapper Classes

São classes que representam os tipos primitivos do Java como objetos.

| Tipo primitivo | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

**Para que servem?**
- Permitem utilizar valores primitivos em coleções, como `ArrayList`.
- Permitem representar a ausência de valor com `null`.
- Oferecem métodos para conversão e manipulação de valores.

## 2. Boxing e Autoboxing

**Boxing:** conversão de um tipo primitivo para seu objeto Wrapper.

**Autoboxing:** quando o Java realiza essa conversão automaticamente.

```java
int numero = 10;

Integer objeto = Integer.valueOf(numero); // Boxing
Integer outroObjeto = numero;             // Autoboxing
```

## 3. Unboxing e Auto-unboxing

**Unboxing:** conversão de um objeto Wrapper para seu tipo primitivo.

**Auto-unboxing:** quando o Java realiza essa conversão automaticamente.

```java
Integer objeto = Integer.valueOf(20); // Boxing

int numero = objeto.intValue(); // Unboxing
int outroNumero = objeto;       // Auto-unboxing
```

## 4. Wrappers e valores nulos

Tipos primitivos não aceitam `null`, mas objetos Wrapper aceitam.

```java
int idade = 0;
Integer idadeNaoInformada = null;
```

O `null` pode representar um valor ainda não informado.

**Atenção:** tentar fazer auto-unboxing de um Wrapper que contém `null` causa `NullPointerException`.

## 5. Exemplo prático com ArrayList

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10); // Autoboxing
        numeros.add(20); // Autoboxing

        int primeiro = numeros.get(0); // Auto-unboxing

        System.out.println(primeiro);
    }
}
```

O `ArrayList` trabalha com objetos `Integer`, por isso o Java converte automaticamente os valores primitivos quando necessário.

## Resumo para memorizar

- **Wrapper Classes:** representam tipos primitivos como objetos.
- **Boxing:** primitivo → objeto Wrapper.
- **Autoboxing:** conversão automática de primitivo para Wrapper.
- **Unboxing:** objeto Wrapper → primitivo.
- **Auto-unboxing:** conversão automática de Wrapper para primitivo.
- **`null`:** representa a ausência de uma referência a objeto; Wrappers podem receber `null`, mas primitivos não.

---

*Material de estudo — Java | Sistemas de Informação*
