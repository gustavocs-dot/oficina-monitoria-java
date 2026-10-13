# Oficina de Monitoria de Java

Anotações pessoais e exercícios da oficina de monitoria de Java. Aqui ficam o conteúdo programático da oficina e o código que desenvolvi em cada aula.

## Sumário

- [Conteúdo programático](#conteúdo-programático)
  1. [Lógica e algoritmos](#1-lógica-e-algoritmos)
  2. [Sintaxe básica de Java](#2-sintaxe-básica-de-java)
  3. [Entrada de dados e condicionais](#3-entrada-de-dados-e-condicionais)
  4. [Estruturas de repetição](#4-estruturas-de-repetição)
  5. [Erros e depuração](#5-erros-e-depuração)
  6. [Vetores e números aleatórios](#6-vetores-e-números-aleatórios)
  7. [Métodos](#7-métodos)
- [O que já desenvolvi](#o-que-já-desenvolvi)
- [Como executar os programas](#como-executar-os-programas)
- [Minhas dúvidas e observações](#minhas-dúvidas-e-observações)

---

## Conteúdo programático

### 1. Lógica e algoritmos

**Três conceitos que não se misturam:**

| Conceito | O que é |
|---|---|
| Algoritmo | A receita: os passos para resolver o problema, independente de linguagem |
| Código-fonte | O algoritmo escrito em Java (arquivo `.java`) |
| Programa em execução | O código já compilado e rodando na máquina |

**Todo problema tem 3 partes:**
- **Entrada:** o que o programa recebe (ex.: duas notas)
- **Processamento:** o que ele faz com isso (ex.: calcular a média)
- **Saída:** o que ele mostra (ex.: "Aprovado")

**Onde pratiquei:** [`aula4/aula4Classificacao.java`](aula4/aula4Classificacao.java) segue exatamente esse exemplo: recebe duas notas, calcula a média e mostra se o aluno foi aprovado.

---

### 2. Sintaxe básica de Java

#### Estrutura mínima de um programa

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

- `class`: o "molde" onde fica o código. O nome deve ser igual ao do arquivo.
- `main`: o ponto de partida. O Java começa a execução por aqui.
- **Compilador (`javac`)**: traduz o `.java` para um formato que a máquina executa. Se houver erro de escrita, ele avisa antes de rodar.

#### Tipos de variáveis

| Tipo | Guarda | Exemplo |
|---|---|---|
| `int` | número inteiro | `int idade = 27;` |
| `double` | número decimal | `double nota = 8.5;` |
| `boolean` | verdadeiro/falso | `boolean aprovado = true;` |
| `char` | um caractere (aspas simples) | `char letra = 'A';` |
| `String` | texto (aspas duplas) | `String nome = "Ana";` |

**Onde pratiquei:** [`aula1/helloWorld.java`](aula1/helloWorld.java), meu primeiro programa: a classe `helloWorld` fica no arquivo `helloWorld.java`.

---

### 3. Entrada de dados e condicionais

#### Lendo dados com Scanner

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        teclado.close();
    }
}
```

Métodos mais usados: `nextInt()`, `nextDouble()`, `next()` (uma palavra) e `nextLine()` (linha inteira).

> **Números com casas decimais:** em um computador configurado em português, `nextDouble()` espera **vírgula**, então digite `7,5`. Com `7.5` o programa para com `InputMismatchException`, e o mesmo acontece se `nextInt()` receber um número com vírgula. Já na saída, o Java mostra `7.5`, com ponto.

#### Condicionais: if, else if, else

```java
double media = 7.0;

if (media >= 7) {
    System.out.println("Aprovado");
} else if (media >= 5) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

- **Operadores de comparação:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Operadores lógicos:** `&&` (e), `||` (ou), `!` (não)
- **Atribuição não é comparação:** `=` guarda um valor na variável; `==` compara dois valores.

> Para comparar textos, use `texto.equals("abc")`, não `==`.

**Sequência de `else if`:** cada condição só é testada se as anteriores deram falso, então não precisa repetir o limite de baixo. Em `mencaoFinal.java`, ao chegar em `else if (N1 <= 4.9)` o programa já sabe que a nota passa de 2,9. Por isso `N1 >= 3 && N1 <= 4.9` virou só `N1 <= 4.9`, que é mais curto e não deixa "buracos" (antes, uma nota 2,95 não cabia em nenhuma faixa e caía no `else`).

**Onde pratiquei:**
- [`aula1/helloWorld.java`](aula1/helloWorld.java): `nextLine()` e `.equals()` para conferir o nome digitado.
- [`aula2/maiorIdade.java`](aula2/maiorIdade.java): `nextInt()` e `if`/`else` com `>=`.
- [`aula3/mencaoFinal.java`](aula3/mencaoFinal.java): sequência de `else if` que converte a nota em menção.

---

### 4. Estruturas de repetição

Toda repetição precisa de: **início**, **condição** e **atualização**.

#### while
Repete enquanto a condição for verdadeira.

```java
int contador = 1;            // inicialização
while (contador <= 5) {      // condição
    System.out.println(contador);
    contador++;              // atualização
}
```

#### for
Reúne início, condição e atualização na mesma linha.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Cuidado com o laço infinito:** se esquecer a atualização (`contador++`), a condição nunca fica falsa e o programa não para.

#### Teste de mesa

Simular o programa no papel, volta por volta, mostra exatamente quando o laço para. Exemplo com [`aula2/enquanto.java`](aula2/enquanto.java):

```java
int x = 5;
int y = 0;

while (x > 2) {
    y = y + x;
    x = x - 1;
    System.out.println(x);
}
```

| Volta | Condição `x > 2` | `y = y + x` | `x = x - 1` | Imprime |
|---|---|---|---|---|
| 1 | 5 > 2: verdadeira | 0 + 5 = 5 | 4 | `4` |
| 2 | 4 > 2: verdadeira | 5 + 4 = 9 | 3 | `3` |
| 3 | 3 > 2: verdadeira | 9 + 3 = 12 | 2 | `2` |
| — | 2 > 2: **falsa** | o laço termina | — | — |

**Onde pratiquei:** `while` em [`aula2/enquanto.java`](aula2/enquanto.java) e `for` em [`aula3/aula3.java`](aula3/aula3.java).

---

### 5. Erros e depuração

#### Dois tipos de erro

| Erro | Quando aparece | Exemplo |
|---|---|---|
| **Compilação** | Antes de rodar; o código está escrito errado | esquecer `;`, tipo errado |
| **Lógica** | O programa roda, mas dá o resultado errado | usar `>` onde era `>=` |

#### Como ler uma mensagem de erro
1. Olhe a **primeira linha**: ela diz o tipo do erro.
2. Procure o **número da linha** indicado.
3. Leia a descrição com calma. Ela costuma dizer o que está faltando.

#### Como depurar sozinho
- Imprima valores com `System.out.println()` para ver o que as variáveis guardam.
- Teste com valores simples primeiro.
- Reproduza o programa "no papel", passo a passo (veja o [teste de mesa](#teste-de-mesa) da seção 4).

#### Erros que já corrigi

**Compilação:** a primeira versão de `Aula3.java` tinha um `:` sobrando depois de `main(String[] args)`. O compilador mostrou o arquivo, a linha (`2`) e, com o `^`, a posição exata:

```text
Aula3.java:2: error: '{' or ';' expected
    public static void main (String[] args): {
                                           ^
```

Corrigido no commit [`17b2224`](https://github.com/gustavocs-dot/Oficina-Monitoria-Java/commit/17b2224046aaed83c6340c57bb7648aa18f426f3).

**Lógica:** em `mencaoFinal.java`, a última opção era um `else` que mostrava "SS". O programa compilava normalmente, mas uma nota 15 também virava "SS". A correção trocou esse `else` por `else if (N1 <= 10)` e acrescentou um `else` com "Nota não reconhecida" (commit [`6248086`](https://github.com/gustavocs-dot/Oficina-Monitoria-Java/commit/624808694e15e0baacf82f7e507dc38c960188da)).

---

### 6. Vetores e números aleatórios

#### Vetores (arrays)
Guardam vários valores do mesmo tipo em uma única variável. Cada valor ocupa uma posição (índice), e **a contagem começa em 0**.

```java
String[] participantes = {"Ana", "Bruno", "Carlos", "Diana"};

System.out.println(participantes[0]);       // Ana
System.out.println(participantes[3]);       // Diana
System.out.println(participantes.length);   // 4 (quantidade de elementos)
// participantes[4] dá ArrayIndexOutOfBoundsException: as posições vão de 0 a 3
```

#### Sorteando números com Random

```java
import java.util.Random;   // no topo do arquivo

Random random = new Random();
int numero = random.nextInt(4);   // sorteia 0, 1, 2 ou 3 (o 4 não entra)
```

Como `nextInt(4)` vai de 0 a 3, o número sorteado serve direto como índice de um vetor de 4 elementos. Com `random.nextInt(participantes.length)`, o sorteio se ajusta sozinho se a lista mudar de tamanho.

**Onde pratiquei:** [`aula3/aleatorio.java`](aula3/aleatorio.java) sorteia um participante da lista.

---

### 7. Métodos

Um método é um bloco de código com nome, que pode receber valores (**parâmetros**) e devolver um resultado (**`return`**). Serve para não repetir código e para dividir o problema em partes menores.

```java
public static double media(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}
```

| Parte | No exemplo | Significado |
|---|---|---|
| Modificadores | `public static` | por enquanto, sempre os mesmos do `main` |
| Tipo de retorno | `double` | tipo do valor devolvido (`void` = não devolve nada) |
| Nome | `media` | como o método é chamado |
| Parâmetros | `double nota1, double nota2` | valores que o método recebe |
| `return` | `return (nota1 + nota2) / 2;` | devolve o resultado para quem chamou |

Para usar, basta chamar pelo nome dentro do `main`:

```java
double m = media(8, 6);   // m recebe 7.0
```

Um método também pode usar o resultado de outro: `aprovado(media(nota1, nota2))` primeiro calcula a média e depois confere se ela é maior ou igual a 6.

**Onde pratiquei:** [`aula4/aula4Dobrar.java`](aula4/aula4Dobrar.java) (devolve `int`), [`aula4/aula4Media.java`](aula4/aula4Media.java) (devolve `double`) e [`aula4/aula4Classificacao.java`](aula4/aula4Classificacao.java) (devolve `boolean` e usa um método `void`).

---

## O que já desenvolvi

Registro do que fiz em cada aula. O código de cada uma fica na pasta `aulaN/` correspondente.

### Aula 1: Primeiro programa e entrada de dados

| Arquivo | O que faz | Conceitos |
|---|---|---|
| [`helloWorld.java`](aula1/helloWorld.java) | Pede o nome; se for "Gustavo", dá boas-vindas, senão mostra "Acesso Bloqueado" | `Scanner`, `nextLine()`, `.equals()`, `if`/`else` |

### Aula 2: Condicionais e repetição com while

| Arquivo | O que faz | Conceitos |
|---|---|---|
| [`maiorIdade.java`](aula2/maiorIdade.java) | Lê a idade e informa se a pessoa é maior ou menor de idade | `nextInt()`, `if`/`else`, `>=` |
| [`enquanto.java`](aula2/enquanto.java) | Diminui `x` de 5 até 2, somando os valores em `y`, e imprime 4, 3 e 2 | `while` (início, condição e atualização) |

### Aula 3: else if, for, vetores e números aleatórios

| Arquivo | O que faz | Conceitos |
|---|---|---|
| [`aula3.java`](aula3/aula3.java) | Anotações da aula em comentários e um `for` de 4 voltas que acumula `i` em `y` | comentários, operadores, `for` |
| [`mencaoFinal.java`](aula3/mencaoFinal.java) | Converte a nota em menção: II (até 2,9), MI (até 4,9), MM (até 6,9), MS (até 8,9) ou SS (até 10); acima de 10, mostra "Nota não reconhecida" | `if` / `else if` / `else` |
| [`aleatorio.java`](aula3/aleatorio.java) | Sorteia um número de 0 a 3 e mostra o participante dessa posição da lista | `Random`, vetor `String[]`, índice |

### Aula 4: Métodos

| Arquivo | O que faz | Conceitos |
|---|---|---|
| [`aula4Dobrar.java`](aula4/aula4Dobrar.java) | Lê um número inteiro e mostra o dobro, calculado pelo método `dobrar` | método com parâmetro e `return` |
| [`aula4Media.java`](aula4/aula4Media.java) | Lê duas notas e mostra a média, calculada pelo método `media` | `nextDouble()`, método que devolve `double` |
| [`aula4Classificacao.java`](aula4/aula4Classificacao.java) | Calcula a média de duas notas e informa se o aluno foi aprovado (média maior ou igual a 6) | métodos `boolean` e `void`, um método chamando outro |

<!--
  MODELO PARA UMA NOVA AULA (este comentário não aparece no GitHub)
  Copie o bloco abaixo, cole logo acima deste comentário e preencha.

### Aula 5: tema da aula

| Arquivo | O que faz | Conceitos |
|---|---|---|
| [`arquivo.java`](aula5/arquivo.java) | descrição curta | conceitos praticados |

-->

---

## Como executar os programas

Com o JDK 11 ou mais recente (testado com o JDK 25), dá para rodar um arquivo `.java` direto, sem compilar antes. A partir da pasta raiz do repositório:

```bash
java aula1/helloWorld.java
```

Para ver as duas etapas separadas, compilar e depois executar:

```bash
cd aula1
javac helloWorld.java
java helloWorld
```

O `javac` gera o arquivo `helloWorld.class`, que não precisa ir para o GitHub (para o Git ignorá-lo, crie um arquivo `.gitignore` com a linha `*.class`).

> Nos programas que leem notas, digite os decimais com vírgula (`7,5`). Veja o motivo na [seção 3](#3-entrada-de-dados-e-condicionais).

---

## Minhas dúvidas e observações

- (escreva aqui o que você quiser revisar depois)
