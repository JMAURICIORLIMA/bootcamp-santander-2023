# Sintaxe

### Aula 01

#### Anatomia das classes

Um dos principais recursos que utilizamos no paradigma de orientação a objetos são as classes, com elas podemos
abstraire criar representações do mundo real para o código.

```java
public class MinhaClasse {

  //SEU CÓDIGO AQUI

}
```
* 99,9% das nossas classes iniciarão com public class.
* Toda classe precisa de nome, exemplo MinhaClasse.
* Após o nome, precisamos definir o corpo { } onde iremos compor nossas classes com atributos e métodos.

```java
public class MinhaClasse {
  // CORPO DA CLASSE

  public static void main(String[] args) {
    // CORPO DO MÉTODO MAIN
  }

}
```

* É de suma importância, que agora você consiga se localizar,dentro do conjunto de chaves { } existentes em sua classe.
* Dentro de uma aplicação, **recomenda-se que somente uma classe possua o método** `main`, responsável por iniciar todo 
o nosso programa.
* O método main recebe seu nome main, sempre terá a visibilidade public, será definido como static, não retornará nenhum
valor com `void`,e receberá um parâmetro do tipo array de caracteres `String[]`.  

<br>

### Aula 02

**Padrão de nomenclatura**

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões
estão expressos nos itens abaixo:

* Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve
também ser maiúscula, exemplo:

    `Calculadora.java`, `CalculadoraCientifica.java`

* Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```
[Sintaxe](https://sintaxe.netlify.app/topicos/linguagens/java/basico/sintaxe)

<br>

#### Variáveis e métodos

Como identificar a diferença entre, declaração de variáveis e métodos em nossa programação? Existe uma estrutura comum
para ambas as finalidades, exemplo:

```java
// Estrutura
Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal
```

Uma variável é um meio de armazenar dados em memória. Em outras palavras, ela funciona como um container para valores
em um programa.


Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra
da segunda palavra deverá ser MAIÚSCULA, exemplo: `ano` e `anoFabricacao`. O nome dessa prática para nomear variáveisdessa
forma se chama camelCase.

````
ℹ️ Informação

Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor,
exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo,
determinamos como escrita o código abaixo:
````

<br>

```java
String BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000
```

<br>

```
🚨 Cuidado

Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir
algumas regras da linguagem.
```

<br>


*   Deve conter apenas letras, `_` (underline), `$` ou os números de `0 a 9`;
*   Deve obrigatoriamente se iniciar por uma letra (preferencialmente), `_` ou `$`, jamais com número;
*   Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
*   Não pode conter espaços;
*   Não podemos usar palavras-chave da linguagem;
*   O nome deve ser único dentro de um escopo.

<br>

```java
// Declaração inválida de variáveis

int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com numérico
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem

// Declaração válida de variáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1; ou numeroUm
int longo = 1;
```

<br>


*   Estrutura de declaração de métodos:

As mesmas regras estruturais de variáveis se aplicam a métodos, em breve iremos abordar mais convenções e estruturação
de métodos.

```java
// Estrutura
TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

//Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
```

<br>

```
🔔 Atenção

Como parte da estrutura de declaração de variáveis e métodos, também temos o aspecto da visibilidade, mas ainda não é necessário nesta etapa de estudos.
```

<br>

### Complemento Aula 02 e 03

**Variáveis** são espaços de memória reservados para armazenar valores em um programa de computador. Elas servem como
contêineres para guardar diferentes tipos de informações, como números, textos, objetos e outros dados relevantes para
o funcionamento do programa. Cada variável tem um nome único que a identifica e um tipo que determina o tipo de dado
que pode ser armazenado nela.

Em Java, você declara uma variável especificando seu tipo e nome, e opcionalmente atribui um valor inicial a ela. Aqui
está a sintaxe básica de declaração de variáveis em Java:

```java
tipoDaVariavel nomeDaVariavel; // Declaração

tipoDaVariavel nomeDaVariavel = valorInicial; // Declaração com atribuição de valor inicial
```

Exemplos:

```java
int idade; // Declaração de uma variável inteira chamada "idade"

double salario = 2500.50; // Declaração e atribuição de um valor inicial para a variável "salario"

String nome = "João"; // Declaração e atribuição de um valor inicial (texto) para a variável "nome"

        // Aula 3 (definições de nome de variáveis auto descritívas).
        // 1º Tipo da variável a ser definida
        // 2º Nome a ser dado para variável
        // 3º Dado correspondente para a variável.
        String nome = "José Maurício";
        int anoDeNascimento = 1990;

        // Variável booleana sempre receberá 2 tipo de valores.
        // true = verdadeiro / false = falso.
        boolean cargaLiberada = false;
        boolean pesoMaximoPermitido = true;

        // Alteração de um valor de uma variável
        cargaLiberada = true;
```

Os tipos de variáveis em Java incluem tipos primitivos (como int, double, char) e tipos de referência
(como String, objetos personalizados). Cada tipo de variável tem um tamanho e faixa de valores associados a ele.

Variáveis desempenham um papel fundamental na programação, permitindo que você armazene, manipule e utilize dados em
suas aplicações. Ao usar variáveis com sabedoria, você pode criar programas dinâmicos e flexíveis que atendam às
necessidades específicas do seu projeto.

<br>

Em programação, um método é um bloco de código que realiza uma ação ou executa uma série de instruções. Métodos são
usados para organizar a lógica do programa em partes reutilizáveis, o que torna o código mais modular e mais fácil de
manter. Em Java, um método é declarado dentro de uma classe e pode ser chamado para executar sua funcionalidade.

**Definição de Método:**

A definição de um método inclui seu cabeçalho (assinatura) e seu corpo. O cabeçalho especifica o nome do método, o tipo
de valor que o método retorna (ou "void" se não retornar valor) e os parâmetros que ele aceita. O corpo do método contém
o código que será executado quando o método for chamado.

Exemplo de definição de método em Java:

```java
public int somar(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

**Declaração de Método:**

A declaração de um método ocorre quando você o cria na sua classe. Isso envolve especificar seu nome, tipo de retorno,
parâmetros e implementação (código). A declaração não inclui o código real do método, apenas sua assinatura.

Exemplo de declaração de método em Java:

```java
public class MinhaClasse {

  public static void main(String[] args) {
      
    // Isso também é um método.
    System.out.println("Hello, Santander!");


    String primeiroNome = "José";
    String segundoNome = "Maurício";

    String nomeCompletoRetornado = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompletoRetornado);

    System.out.printf("%s", nomeCompletoRetornado);
  }

  public static String nomeCompleto(String primeroNome, String segundoNome) {
    return "Retorno do método " + primeroNome.concat(" ").concat(segundoNome);
  }
}

```

Observe que essa declaração define o método, mas não fornece sua implementação. Você deve adicionar o código dentro das
chaves `{ }` para que o método funcione corretamente.

Depois de definir e declarar um método, você pode chamá-lo em outras partes do seu programa para executar a lógica
contida nele. Isso ajuda a dividir a funcionalidade do programa em partes menores e mais gerenciáveis, facilitando a
criação e manutenção do código.

O código que você forneceu imprimirá o seguinte resultado quando executado:

```
Hello, Santander!
Retorno do método José Maurício
Retorno do método José Maurício
```

Vamos analisar o que está acontecendo no código:

1. A primeira linha imprime "Hello, Santander!" no console.

2. Duas variáveis de string, `primeiroNome` e `segundoNome`, são declaradas e inicializadas com os valores "José" e
"Maurício", respectivamente.

3. O método `nomeCompleto` é chamado passando `primeiroNome` e `segundoNome` como argumentos. O método concatena esses
nomes e retorna o resultado, que é armazenado na variável `nomeCompletoRetornado`.

4. O valor retornado pelo método `nomeCompleto` ("Retorno do método José Maurício") é impresso no console duas vezes,
primeiro usando `System.out.println` e depois usando `System.out.printf`.

Portanto, o resultado final será a impressão das mensagens conforme indicado acima.

> Inclusão de dados retirados do CHATGPT.