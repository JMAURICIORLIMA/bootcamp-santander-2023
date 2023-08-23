# Sintaxe

### Aula 01

#### Anatomia das classes

Um dos principais recursos que utilizamos no paradigma de orientação a objetos são as classes, com elas podemos
abstraire criar representações do mundo real para o código.

```java
public class anatomiadasclasses.MinhaClasse {

  //SEU CÓDIGO AQUI

}
```
* 99,9% das nossas classes iniciarão com public class.
* Toda classe precisa de nome, exemplo anatomiadasclasses.MinhaClasse.
* Após o nome, precisamos definir o corpo { } onde iremos compor nossas classes com atributos e métodos.

```java
public class anatomiadasclasses.MinhaClasse {
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
public class anatomiadasclasses.MinhaClasse {

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

<br>

### Aula 04
#### Indentação
<br>
Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a
visualização e o entendimento do programa.

![](https://sintaxe.netlify.app/assets/sintaxe-1.9903b952.png)

Abaixo, veja um exemplo de um algoritmo de validação, de aprovação de estudante.

Sem identação:
```java

// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)
System.out.println("REPROVADO");
else if(mediaFinal==6)
System.out.println("PROVA MINERVA");
else
System.out.println("APROVADO"); 		
}
}
```
<br>

Com identação:

```java
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
```

<br>

### Aula 05

#### Organização de pacotes

A organização de pacotes em Java é uma prática que envolve agrupar classes relacionadas em estruturas de diretórios
hierárquicas. Isso ajuda a manter o código-fonte organizado, facilitando a localização, manutenção e colaboração em
projetos mais complexos. A organização de pacotes também evita conflitos de nomes de classes e ajuda a modularizar o
código.

Aqui estão algumas diretrizes para organizar pacotes em seus projetos Java:

1. **Nomeação de Pacotes**: Os nomes dos pacotes são normalmente escritos em letras minúsculas. Se o nome do pacote
consistir em várias palavras, você pode usar o padrão CamelCase ou separar as palavras por pontos.

2. **Hierarquia de Pacotes**: Use uma hierarquia de pacotes para refletir a estrutura do seu projeto. Por exemplo, você
pode começar com o nome da sua organização ou domínio (revertido) e depois adicionar subpacotes para categorizar
diferentes partes do seu projeto.

3. **Nome de Classes**: Evite usar classes com nomes genéricos em pacotes de alto nível, pois isso pode levar a
conflitos. Use nomes descritivos que reflitam a finalidade da classe.

4. **Dependências Claras**: Organize pacotes de modo que suas dependências fiquem claras. Pacotes mais baixos podem
depender de pacotes mais altos, mas a estrutura deve ser lógica e evitar ciclos de dependência.

5. **Padrões de Projeto**: À medida que seu projeto cresce, considere usar padrões de projeto para dividir a lógica do
programa em camadas (MVC, camadas de serviço, etc.) e organizar melhor suas classes.

6. **Diretório de Origem**: Mantenha a estrutura de diretórios de acordo com a hierarquia de pacotes. Por exemplo, a
classe `com.empresa.projeto.anatomiadasclasses.MinhaClasse` deve estar localizada em `src/com/empresa/projeto/anatomiadasclasses.MinhaClasse.java`.

7. **Importações de Pacotes**: Use declarações `import` para importar classes de pacotes diferentes. Isso permite que
você use classes de outros pacotes em seu código.

8. **Documentação**: Forneça documentação (Javadoc) em seus pacotes e classes para facilitar o entendimento do código
por outros desenvolvedores.

Lembre-se de que não há uma única maneira correta de organizar pacotes; a abordagem exata dependerá do tamanho e da
complexidade do seu projeto. O objetivo é tornar seu código mais compreensível e gerenciável, facilitando o
desenvolvimento e a colaboração.

Exemplo:

Claro! Aqui está um exemplo simples de como você pode organizar pacotes em um projeto Java. Vamos supor que você esteja
desenvolvendo um aplicativo de gerenciamento de biblioteca.

Estrutura de Diretórios e Pacotes:
```
src/
└── com/
    └── biblioteca/
        ├── model/
        │   ├── Livro.java
        │   └── Autor.java
        ├── view/
        │   ├── TelaPrincipal.java
        │   └── TelaDetalhesLivro.java
        └── Main.java
```

Nesse exemplo, você criou um pacote principal chamado `com.biblioteca` para conter todas as classes relacionadas ao
aplicativo da biblioteca.

- O pacote `model` contém as classes que representam os objetos de dados do aplicativo, como `Livro` e `Autor`.
- O pacote `view` contém classes que representam a interface do usuário, como `TelaPrincipal` e `TelaDetalhesLivro`.
- O arquivo `Main.java` está no pacote principal `com.biblioteca` e é onde você pode começar a execução do aplicativo.

Agora, vamos dar uma olhada em um trecho de código em uma das classes para ver como as importações de pacotes e classes
funcionariam:

**Exemplo de Uso de Pacotes e Importações:**
```java
package com.biblioteca.view;

import com.biblioteca.model.Livro;

public class TelaDetalhesLivro {

    public void exibirDetalhes(Livro livro) {
        // Código para exibir detalhes do livro
    }
}
```

Nesse exemplo, a classe `TelaDetalhesLivro` está no pacote `com.biblioteca.view`, e ela importa a classe `Livro` do
pacote `com.biblioteca.model` para poder usá-la.

Essa estrutura de organização ajuda a manter o código bem separado, facilitando a localização e a manutenção de classes
relacionadas. Ela também evita conflitos de nomes de classes e permite que você organize seu código de maneira lógica e
escalável.

<br>

### Aula 06
#### Declaração e Atribuição

Declaração e atribuição de variáveis é uma das etapas fundamentais em programação, pois permite armazenar dados na
memória do computador para uso futuro. A aplicação de regras claras e precisas ajuda a evitar erros de sintaxe e de
lógica, bem como torna o código mais legível e fácil de manter.

Os métodos com e sem retorno também são importantes, pois permitem organizar o código em blocos reutilizáveis e mantê-lo
claro e conciso. Os métodos com retorno devolvem um valor, enquanto os métodos sem retorno não retorna nada. É
importante escolher a abordagem adequada para cada tarefa.

Finalmente, tornar uma variável uma constante pode ser útil quando você quer garantir que seu valor não mude
acidentalmente durante a execução do programa. Isso ajuda a preservar a integridade dos dados e a evitar erros de
lógica. Em geral, é uma boa prática usar constantes sempre que possível para garantir que o código seja claro, preciso e
fácil de manter.

<br>

**Declaração de variáveis**


Uma variável é uma referência a um espaço de memória utilizado pelo seu programa. De acordo com as convenções da
linguagem de programação, cada variável é composta por três elementos: tipo de dados, identificação e valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

``<Tipo> <nomeVariável> <atribuiçãoDeValorOpcional>``

<br>
Exemplos abaixo:

```java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```

<br>

````
🔔 Atenção

Existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:
````

```java

public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com 0, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com 0, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
    }
}
```

````
✔️ Conclusão

Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia,
podem estimular uma alteração de tipos de dados convencional.
````

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência
de seu valor na aplicação. Mas, cuidado!

````
🔔 Atenção

Java é linguagem de programação fortemente "tipado".
````

Veja o exemplo abaixo:

```java

// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;

// Mesmo sabendo que numeroNormal é igual a numeroCurto,
// não é possível atribuir a numeroCurto2
```

<br>

### Declaração de constantes


As Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses
valores são representados pela palavra reservada `final`, seguida do tipo. Por convenção, Constantes são sempre escritas
em CAIXA ALTA.

Abaixo, temos um exemplo explicativo sobre uso de variáveis e constantes:

```java

public class ExemploVariavel {
public static void main(String[] args) {
    /*
    * esta linha é considerada como declaração de variável iniciamos a existência
    * variável numero com valor 5 regra: tipo + nome + valor
    */
    int numero = 5;

    /*
    * na linha abaixo iremos alterar o valor do variável para 10 observe que o tipo
    * não é mais necessário, pois a variável já foi declarada anteriormente
    */
    numero = 10;

    System.out.print(numero);

    /*
    * ao usar a palavra reservada final, você determina que jamais
    * esta variavel poderá obter outro valor;
    * logo a linha 25 vai apresentar um erro de compilação
    * isso é considerado uma CONSTANTE na linguagem Java
    */
    final double VALOR_DE_PI = 3.14;

    VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
}
}
```

````
🔔 Atenção

Compreendemos que, para declarar uma variável como uma constante, utilizamos a palavra final, mas por convenção, esta
variável deverá ser escrita toda em caixa alta.
````

<br>
### Declaração de métodos


Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de
diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas
classes.

**Critério de Nomeação de Métodos**

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos
programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais
legível para nós e também para outras pessoas. Para métodos, os critérios são:

* Deve ser nomeado como verbo;
* Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

Exemplo de nomeação de métodos:

```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){}

calcularImprimir(){}
```

<br>

### Definindo parâmetros e retorno de métodos

Mas, como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, somos
auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do
mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar
algum valor ou não.
3. **Qual o tipo de parâmetro esperado pelo método?** Você deve analisar se o método irá receber algum parâmetro ou não.
4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é
necessário prever e tratar a possível existência de uma exceção. 
5. **Qual a visibilidade do método?** Avaliar se será necessário que o método seja visível a toda aplicação, somente em
pacotes, através de herança ou somente a nível a própria classe.

Abaixo, temos um exemplo de uma classe com alguns métodos e suas respectivas considerações:

```java
public class MyClass {

	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
```

<br>

### Aula 07
#### Tipos e variáveis

Com toda certeza, uma hora ou outra, seja na sua vida acadêmica ou profissional na área de desenvolvimento você já ouviu
falar em tipos de variáveis. Isso se deve ao fato de que o computador tem a necessidade que o programador “explique”
para ele o que exatamente quer, da forma mais especificada possível, e no Java não é diferente.

<br>

#### Tipos primitivos

Em Java, existem palavras reservadas especiais para representar tipos básicos de dados que são essenciais para construir
programas. Estes tipos básicos são chamados de tipos primitivos.

````
📌 Para fixar

Os oito tipos primitivos em Java são:

int, byte, short, long, float, double, boolean e char – esses tipos não são objetos e portanto representam valores
brutos. Eles são armazenados diretamente na pilha de memória.
````

Tabela de Tipos Primitivos e seus valores:

| Tipo  | Memória | Valor Mínimo               | Valor Máximo              |
|-------|---------|----------------------------|---------------------------|
| byte  | 1 byte  | -128                       | 127                       |
| short | 2 byte  | -32.768                    | 32.767                    |
| int	 | 4 bytes | -2.147.483.648             | 2.147.483.647             |
| long  | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

Os tipos primitivos, que podem conter partes fracionárias:

| Tipo   | Memória | Valor Mínimo   | Valor Máximo   | Precisão      |
|--------|---------|----------------|----------------|---------------|
| float  | 4 bytes | -3,4028E + 38  | 3,4028E + 38   | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308  | 15 dígitos    |

Embora o tipo `float` ocupe menos espaço na memória do que o tipo `double`, ele é menos utilizado devido a uma limitação
na precisão decimal entre 6 e 7 dígitos.

Com os avanços nos computadores, não há mais a necessidade de se preocupar com o uso dos tipos `short` e `byte`, pois a
memória é abundante.

De maneira semelhante, o tipo `long` também é pouco utilizado, pois valores grandes são raros de se trabalhar.

Portanto, na maioria das situações, utilizamos o tipo `int` para representar números inteiros ou `double` para
representar números fracionados.

````
ℹ️ Informação

Devemos compreender que os tipos primitivos sempre terão um valor padrão mesmo NÃO havendo uma atribuição explícita,
veja o código abaixo:
````

```java
byte 	b; //b=0
short 	s; //s=0
int 	i; //i=0
long 	l; //l=0

float 	f; //f=0.0
double 	d; //d=0.0

char    c; //c='\u0000'
boolean o; //b=false
```
 <br>

#### Declaração de variáveis


Uma variável é uma referência a um espaço de memória utilizado pelo seu programa. De acordo com as convenções da linguagem de programação, cada variável é composta por três elementos: tipo de dados, identificação e valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

`<Tipo> <nomeVariável> <atribuiçãoDeValorOpcional>`

Exemplos abaixo:
```java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
```

````
🔔 Atenção

Existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:
````
```java
public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com 0, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com 0, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
    }
}
```

````
✔️ Conclusão

Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia,
podem estimular uma alteração de tipos de dados convencional.
````

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência
de seu valor na aplicação. Mas, cuidado!

````
🔔 Atenção

Java é linguagem de programação fortemente "tipado".
````

Veja o exemplo abaixo:

```java

// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;

// Mesmo sabendo que numeroNormal é igual a numeroCurto,
// não é possível atribuir a numeroCurto2
```
<br>

### Aula 08
#### Declaração de constantes


As Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses
valores são representados pela palavra reservada `final`, seguida do tipo. Por convenção, **Constantes** são sempre
escritas em CAIXA ALTA.

Abaixo, temos um exemplo explicativo sobre uso de variáveis e constantes:

```java
public class ExemploVariavel {
    public static void main(String[] args) {
        /*
        * esta linha é considerada como declaração de variável iniciamos a existência
        * variável numero com valor 5 regra: tipo + nome + valor
        */
        int numero = 5;

        /*
        * na linha abaixo iremos alterar o valor do variável para 10 observe que o tipo
        * não é mais necessário, pois a variável já foi declarada anteriormente
        */
        numero = 10;

        System.out.print(numero);

        /*
        * ao usar a palavra reservada final, você determina que jamais
        * esta variavel poderá obter outro valor;
        * logo a linha 25 vai apresentar um erro de compilação
        * isso é considerado uma CONSTANTE na linguagem Java
        */
        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    }
}
```

````
🔔 Atenção

Compreendemos que, para declarar uma variável como uma constante, utilizamos a palavra final, mas por convenção, esta
variável deverá ser escrita toda em caixa alta.
````
<br>

### Aula 09
#### Operadores

Você já ouviu aquela frase antiga que diz que programação é simplesmente uma lista de instruções lógicas que, quando
executadas, nos entrega resultados incríveis? Bem, é isso mesmo! Quando começamos a escrever o nosso primeiro código,
logo percebemos que uma das coisas mais comuns é pedir informações ao usuário, fazer algumas operações lógicas e, em
seguida, apresentar o resultado final.

![](https://sintaxe.netlify.app/assets/sintaxe-2.dbb41438.jpg)

#### Classificação do Operadores
**Atribuição**

Representado pelo símbolo de igualdade `=`.

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java,
definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos
abaixo:

```java
//classe Operadores.java
String nome = "GLEYSON";
int idade = 22;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
Date dataNascimento = new Date();
```
<br>

**Aritméticos**

O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não
uma expressão mais complexa.

Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação) , `/` (divisão) e `%` (módulo).

```java
//classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);
```

<br>

**Atribuição abreviada de aritméticos**

Acabamos de aprender sobre operadores de atribuição e aritméticos, porém a linguagem Java ofere meios de abreviação
juntando estes dois contextos conforme abaixo:

```java
  //classe Operadores.java
  /*
    Vamos imaginar que n1 começaria com valor 10 e n2 com valor 5
    mas em seguida gostaria de somar o valor de n1 e n2 e atribuir a n2.
  */
  int n1 = 10;
  int n2 = 5;

  //forma literal
  n2 = n2 + n1;

  //forma abreviada
  n2 += n1;

  System.out.println(n2);
```
````
🔔 Atenção

O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
````

```java
    //classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    //qual o resultado das expressões abaixo?
    String concatenacao ="?";

    concatenacao = 1+1+1+"1";

    concatenacao = 1+"1"+1+1;

    concatenacao = 1+"1"+1+"1";

    concatenacao = "1"+1+1+1;

    concatenacao = "1"+(1+1+1);
```

<br>

### Aula 10
#### Operadores unérios

Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como
incrementar, decrementar, inverter valores numéricos e booleanos.

* (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
* (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
* (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
* (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
* (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

Exemplos abaixo:
```java
//classe Operadores.java
int numero = +5; //ou somente 5

//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedência conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
```

````
🚨 Cuidado

Muito cuidado com ordem de precedência, dos operadores unários!
````

<br>

### Aula 11
#### Operadores de incremento e decremento.

Os operadores de incremento e decremento são usados em programação para aumentar ou diminuir o valor de uma variável por
uma unidade. Eles são frequentemente utilizados em laços de repetição, cálculos matemáticos e outras situações em que
você precisa ajustar o valor de uma variável.

Aqui estão os operadores de incremento e decremento em Java:

1. **Operador de Incremento (++):**
   O operador de incremento (`++`) aumenta o valor da variável em uma unidade.

   Exemplo:
   ```java
   int contador = 5;
   contador++; // Incrementa contador para 6
   ```

2. **Operador de Decremento (--):**
   O operador de decremento (`--`) diminui o valor da variável em uma unidade.

   Exemplo:
   ```java
   int contador = 10;
   contador--; // Decrementa contador para 9
   ```

Além disso, os operadores de incremento e decremento podem ser usados em diferentes posições em uma expressão, o que
resultará em diferentes efeitos:

- Se o operador estiver antes da variável (prefixo), o valor será incrementado ou decrementado antes da avaliação da
expressão.

  Exemplo:
  ```java
  int x = 5;
  int y = ++x; // y será 6, x será 6
  ```

- Se o operador estiver depois da variável (sufixo), o valor será incrementado ou decrementado após a avaliação da
expressão.

  Exemplo:
  ```java
  int a = 10;
  int b = a--; // b será 10, a será 9
  ```

Lembre-se de que o uso adequado desses operadores é importante para garantir que você obtenha os resultados esperados
em seu código. Além disso, evite usá-los de maneira complexa em expressões para evitar confusão e melhorar a
legibilidade do código.

Exemplos que demonstram os resultados dos operadores de incremento e decremento tanto pós-incremento como
pós-decremento, assim como os resultados dos operadores de pré-incremento e pré-decremento.

**Operador de Pós-Incremento (`++`):**
```java
int a = 5;
int b = a++; // b recebe o valor original de 'a' (5), depois 'a' é incrementado para 6

System.out.println("a: " + a); // a será 6
System.out.println("b: " + b); // b será 5
```

**Operador de Pós-Decremento (`--`):**
```java
int x = 8;
int y = x--; // y recebe o valor original de 'x' (8), depois 'x' é decrementado para 7

System.out.println("x: " + x); // x será 7
System.out.println("y: " + y); // y será 8
```

**Operador de Pré-Incremento (`++`):**
```java
int c = 3;
int d = ++c; // c é incrementado para 4 antes de ser atribuído a 'd'

System.out.println("c: " + c); // c será 4
System.out.println("d: " + d); // d será 4
```

**Operador de Pré-Decremento (`--`):**
```java
int m = 9;
int n = --m; // m é decrementado para 8 antes de ser atribuído a 'n'

System.out.println("m: " + m); // m será 8
System.out.println("n: " + n); // n será 8
```

Observe como os resultados são diferentes dependendo se você usa os operadores de incremento e decremento como
pós-incremento/decremento ou pré-incremento/decremento. Isso acontece porque a operação ocorre antes ou depois da
atribuição da variável, afetando o valor que a variável terá após a operação.

Um exemplo de como usar o operador de negação (`!`) para inverter o valor de uma variável booleana:

```java
public class ExemploNegacao {

    public static void main(String[] args) {
        boolean estado = true;
        
        // Invertendo o valor da variável 'estado' usando o operador de negação
        boolean estadoInvertido = !estado;
        
        System.out.println("Estado original: " + estado);
        System.out.println("Estado invertido: " + estadoInvertido);
    }
}
```

Neste exemplo, a variável `estado` é inicializada como `true`. Usando o operador de negação `!`, o valor de `estado` é
invertido para `false` e atribuído à variável `estadoInvertido`.

A saída do programa será:

```
Estado original: true
Estado invertido: false
```

O operador de negação é útil para inverter o valor booleano de expressões lógicas, testar condições de não-verdadeiro e
outras situações em que você precisa negar uma afirmação.

<br>

### Aula 12
#### Operador ternário.

O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua
estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:

`<Expressão Condicional>` ? `<Caso condição seja true>` : `<Caso condição seja false>`
````
🔔 Atenção

O operador ternário muitas das vezes é interpretado como um controle de fluxo, sendo que o seu papel principal é uma
atribuição condicionada.
````
Exemplo abaixo:

```java
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
resultado = "verdadeiro";
else
resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(resultado);
```
<br>

### Aula 13
#### Operadores relacionais.

Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem
se o operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita, retornando um
valor booleano como resultado.

* `==` Quando desejamos verificar se uma variável é IGUAL A outra.
* `!=` Quando desejamos verificar se uma variável é DIFERENTE da outra.
* `>` Quando desejamos verificar se uma variável é MAIOR QUE a outra.
* `>=` Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
* `<` Quando desejamos verificar se uma variável é MENOR QUE outra.
* `<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

```java
//classe Operadores.java
int numero1 = 1;
int numero2 = 2;

if(numero1 > numero2)
System.out.print("Numero 1 maior que numero 2");

if(numero1 < numero2)
System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
System.out.print("Numero 1 é diferente de numero 2");
```
<br>

### Aula 14
#### Operadores lógicos.

Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de
duas ou mais expressões.

* `&&` - Operador Lógico "E"
* `||` - Operador Lógico "OU"

```Java
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas
expressões.
É como se estivesse escrito:
"Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
System.out.print("Um dos valores precisa ser verdadeiro");
```

**Expressões Lógicas Avançadas**

Nós acabamos de aprender que existem os operadores lógicos `&` (E) e `||` (OU), mas por que no exemplo acima, foram
ilustradas as condições:
````
if (condicao1 && condicao2) e if(condicao1 || condicao2) ?
````

````
✔️ Conclusão

A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer dizer que, se a condição1
atender aos critérios, não será necessário validar a condição2.
````

```java
// ComparacaoAvancada.java
int numero1 = 1;
int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
```
````
✔️ Conclusão

O mesmo acontece com o operador | e || , considerando que operador, agora representa que se uma das alternativas for
verdadeira, a outra nem precisa ser avaliada.
````
<br>

### Aula 15
#### Métodos


Os métodos, deverão ser nomeados com verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio,
todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção, a primeira letra, da segunda palavra
composta.

Exemplos sugeridos para nomenclatura de métodos:
```java
int somar(int n1, int n2){ return ... } // métodos podem retornar alguma valor

abrirConexao() throws Exception{} // este método diz que ao ser executado poderá propagar uma exceção

void concluirProcessamento() {} //nem sempre se alguma resposta, logo o retorno é void, vazio

findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```

#### Declaração de métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de
diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas
classes.

**Critério de Nomeação de Métodos**

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos
programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais
legível para nós e também para outras pessoas. Para métodos, os critérios são:

* Deve ser nomeado como verbo;
* Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

Exemplo de nomeação de métodos:
```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){}

calcularImprimir(){}
```
#
#### Definindo parâmetros e retorno de métodos


Mas, como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, somos
auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do
mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por
retornar algum valor ou não.
3. **Qual o tipo de parâmetro esperado pelo método?** Você deve analisar se o método irá receber algum parâmetro ou não.
4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é
necessário prever e tratar a possível existência de uma exceção.
5. **Qual a visibilidade do método?** Avaliar se será necessário que o método seja visível a toda aplicação, somente em
pacotes, através de herança ou somente a nível a própria classe.

Abaixo, temos um exemplo de uma classe com alguns métodos e suas respectivas considerações:
```java
public class MyClass {

	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
```
<br>

### Aula 16
#### Escopo

O escopo pode ser entendido como,o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de
acordo com o bloco onde ela foi declarada.**

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução, ao
qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu
bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da
Classe, sendo portanto, acessíveis por todos os métodos.

Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método,
ou seja, dentro das chaves que limitam o método.
Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão.
Sem um domínio sobre escopo de códigos, seu projeto tende a conter falhas estruturais e comprometer a proposta principal
da aplicação.
```java
public class Conta {
//variavel da classe conta
double saldo=10.0;

	public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}
	public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		//somente o método sacar conhece esta variavel
		System.out.println(novoSaldo);
	
	}
	public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}
}
```
<br>

### Aula 17
#### Palavras Reservadas


Palavras reservadas do java, ou keywords(palavras-chave), são palavras que possuem significado especifico no código.

A linguagem contém 52 palavras distribuídas em categorias com finalidades e fronteiras de uso bem definidas conforme
tabela abaixo:

**Descrevendo as palavras**

As palavras reservadas na linguagem Java possuem regras de indentificação e utilização conforme descrição abaixo:

![](https://sintaxe.netlify.app/assets/sintaxe-4.c9e469a6.png)

* Todas as palavras reservadas são minúsculas
* Nenhuma palavra reservada poderá ser utilizada definir nome de variáveis e métodos
* As palavras reservas determinam recursos ou caracteríticas de forma individual ou agrupada para o seu algorítimo
* Conhecer e compreender todas as 52 palavras reservadas leva tempo e prática

**Agrupando as palavras**

Para uma melhor interpretação e compreensão do uso das palavras reservadas em nosso cotidiano, é necessário
primeiramente, uma organização e classificação das mesmas. Sendo assim, será mais fácil compreender sua aplicabilidade
#
**Modificadores de acesso**

| Palavra | 	Descrição                                       |	Classe |	Variável |	Método |
|---------|--------------------------------------------------|--------|-------------|---------|
|public | 	Acesso de qualquer classe                       |	X |	X |	X |
|private | 	Acesso apenas dentro da classe                  |	X |	X |	X |
|protected | 	Acesso por classes no mesmo pacote e subclasses |	X |	X |	X |
#
**Tipos primitivos**

| Palavra | 	Descrição     |	Classe | Variável | 	Método |
|---------|----------------|--------|----------|--------|
|boolean |	um valor indicando verdadeiro ou falso | X | no retorno | |
|byte |	um inteiro de 8 bits (signed) |	X |	no retorno | |
|char |	um carácter Unicode (16bit unsigned) (signed) |	X |	no retorno | |
|double |	um carácter Unicode (16bit unsigned) (signed) |	X |	no retorno | |
|float |	um número de ponto flutuante de 32 bits |	X |	no retorno | |
#
**Modificadores de classes, variáveis ou métodos**

| Palavra      | 	Descrição                                                                                                                                           | 	Classe |	Variável |	Método |
|--------------|------------------------------------------------------------------------------------------------------------------------------------------------------|---------|-------------|---------|
| abstract     | classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata                                           | X       |	
| class        | especifica uma classe                                                                                                                                | X	      |
| extends      | indica a superclasse que a subclasse está estendendo                                                                                                 | X       |		
| final        | impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada	                               | X       |	X |	X |
| implements   | indica as interfaces que uma classe irá implementar                                                                                                  | X       |		
| interface    | especifica uma interface                                                                                                                             | X       |		
| native       | indica que um método está escrito em uma linguagem dependente de plataforma, como o C                                                                | X       |
| new          | instancia um novo objeto, chamando seu construtor                                                                                                    | X       |
| static       | faz um método ou variável pertencer à classe ao invés de às instâncias                                                                               | X       |
| strictfp     | usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões   | X       |
| synchronized | indica que um método só pode ser acessado por uma thread de cada vez                                                                                 | X       |
| transient    | impede a serialização de campos                                                                                                                      | X       |
| volatile     | indica que uma variável pode ser alterada durante o uso de threads                                                                                   | X       |
#
**Controle de fluxo dentro de um bloco de código**

| Palavra    | 	Descrição                                                                                                                                     | 	Classe | Variável | 	Método |
|------------|------------------------------------------------------------------------------------------------------------------------------------------------|---------|----------|---------|
| break      | sai do bloco de código em que ele está                                                                                                         |         |          | fluxo   |
| case       | executa um bloco de código dependendo do teste do switch                                                                                       |         |          | X       |
| continue   | pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop                                                     |         |          | fluxo   |
| default    | executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro                                                              |         |          | X       |
| do         | executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente |         |          | X       |
| else       | executa um bloco de código alternativo caso o teste "if" seja falso                                                                            |         |          | X       |
| for        | usado para realizar um loop condicional de um bloco de código                                                                                  |         |          | X       |
| if         | usado para realizar um teste lógico de verdadeiro ou falso                                                                                     |         |          | X       |
| instanceof | determina se um objeto é uma instância de determinada classe, superclasse ou interface                                                         |         |          | X       |
| return     | retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável)                               |         |          | X       |
| switch     | indica a variável a ser comparada nas expressões case                                                                                          |         |          | X       |
| while      | executa um bloco de código repetidamente enquanto a condição for verdadeira                                                                    |         |          | X       |
#
**Tratamento de erros**

| Palavra | 	Descrição                                                                                                                   | Classe | Variável | Método     |
|---------|------------------------------------------------------------------------------------------------------------------------------|--------|----------|------------|
| assert  | 	testa uma expressão condicional, para verificar uma suposição do programador                                                |        |          | X          |
| catch   | 	declara o bloco de código usado para tratar uma exceção                                                                     |        |          | X          |
| finally | 	bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção |        |          | X          |
| throw   | 	usado para passar uma exceção para o método que o chamou                                                                    |        |          | X          |
| throws  | 	indica que um método pode passar uma exceção para o método que o chamou                                                     |        |          | assinatura |
| try     | 	bloco de código que tentará ser executado, mas que pode causar uma exceção                                                  |        |          | X          |
#
**Controle de pacotes**

| Palavra | Descrição                                                           | Classe | Variável | Método |
|---------|---------------------------------------------------------------------|--------|----------|--------|
| import  | importa pacotes ou classes para dentro do código                    | X      |          |        |
| package | especifica a que pacote, todas as classes de um arquivo pertencem.  | X      |          |        |
#
**Variáveis de referência**

| Palavra | Descrição                             | Classe | Variável | Método |
|---------|---------------------------------------|--------|----------|--------|
| super   | refere-se a superclasse imediata      |        |          | X      |
| this    | refere-se a instância atual do objeto |        |          | X      | 
#
**Palavras reservadas não utilizadas**

| Palavra | Descrição                                                           | Classe | Variável | Método |
|---------|---------------------------------------------------------------------|--------|----------|--------|
| const   | não utilize para declarar constantes                                |        |          |        |
| goto    | não implementada na linguagem Java, por ser considerada prejudicial |        |          |        |


#### Combinação de palavras

Abaixo, iremos exercitar algumas das possibilidades mais recorrentes em combinar o uso das palavras reservadas a níveis
de: Classe, Atributos e Métodos

| Nível    | Combinação           | Explicação                                                             |
|----------|----------------------|------------------------------------------------------------------------|
| classe   | public class         | Determina que a classe é pública                                       |
| classe   | abstract class       | Determina que a classe é abstrata                                      |
| classe   | final class          | Determina que a classe é final e não pode ser herdada                  |
| classe   | class A extends B    | Determina que a classe A herda da classe B                             |
| classe   | class A implements B | Determina que a classe A implementa a interface B                      |
| atributo | public static        | Determina que o atributo é público e estático (nível de classe)        |
| atributo | public static final  | Determina que o atributo é público, estático e inalterável (constante) |
| método   | abstract void        | Determina que o método é abstrato e sem retorno                        |
| método   | synchronized void    | Determina que o método é sincronizado e sem retorno                    |

````
🔔 Atenção

A tabela acima é somente uma ilustração e um direcionamento para você poder fixar um pouco mais o conceito das palavras 
reservadas na linguagem Java.
````
#
#### Palavras "opostas"

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas
(antônimas) na linguagem Java conforme tabela abaixo:

| Palavra | Palavra    | Explicação                                                                                                                                                                                                                                                     |
|---------|------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| package | import     | Enquanto package determina o diretório real da classe, o import informa de onde será importada a classe. Isso porque, podemos ter classes de mesmo nome.                                                                                                       |
| extends | implements | enquanto extends determina que uma classe estende outra classe, implements determina que uma classe implementa uma interface, porém nunca o contrário.                                                                                                         |
| final   | abstract   | enquanto final determina fim de alteração de valor ou lógica comportamental, abstract em métodos, exige que sub-classes precisarão definir comportamento e um método abstrato. NOTA: Se uma classe contém um único método abstrato, toda classe precisa ser.   |
| throws  | throw      | Esta é uma das situações mais complicadas, de compreensão destas duas palavras. Enquanto a throws determina que um método pode lançar uma exceção, throw é a implementação que dispara a exceção. Vamos conhecer mais sobre este conceito no assunto Exceções. |
<br>

### Aula 18
#### Documentação e comentários

Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma
documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem
específicas, sem nem mesmo escrever uma linha de código.

Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a
habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos
atuais.

Aqui, temos o link da documentação de uma das principais classes da linguagem Java:

[String (Java Platform SE 7)](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)
 e 
[Documentação Java SE 8](https://docs.oracle.com/javase/8/docs/api/)

Javadoc é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir
do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples
inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar
um Javadoc em HTML.

#### Tags

Os desenvolvedores usam certos estilos de comentários e tags Javadoc ao documentar códigos-fonte. Um bloco de comentário
em Java iniciado com /** irá iniciar um bloco de comentário Javadoc, que será incluído no HTML gerado. Uma tag Javadoc
começa com um "@" (arroba). Na tabela abaixo, algumas destas tags.

| tag         | descrição                                                                                                                    |
|-------------|------------------------------------------------------------------------------------------------------------------------------|
| @author     | Nome do desenvolvedor                                                                                                        |
| @deprecated | Marca o método como deprecated. Algumas IDEs exibirão um alerta de compilação se o método for chamado.                       |
| @exception  | Documenta uma exceção lançada por um método — veja também @throws.                                                           |
| @param      | Define um parâmetro do método. Requerido para cada parâmetro.                                                                |
| @return     | Documenta o valor de retorno. Essa tag não deve ser usada para construtores ou métodos definidos com o tipo de retorno void. |
| @see        | Documenta uma associação a outro método ou classe.                                                                           |
| @since      | Documenta quando o método foi adicionado a a classe.                                                                         |
| @throws     | Documenta uma exceção lançada por um método. É um sinônimo para a @exception introduzida no Javadoc 1.2.                     |
| @version    | Exibe o número da versão de uma classe ou um método.                                                                         |

Vamos explorar como documentar um classe simples que realizar a divisão entre dois números inteiros.
```java
/**
* Calculadora Simples
* @author Gleyson Sampaio
  */
  public class Calculadora {
  /**
    * Realiza a divisão entre dois números inteiros
    *
    * @param dividendo     Número que será dividido
    * @param divisor       Número que irá dividir o dividendo
    * @return              O resultado da divisão entre o dividendo e o divisor
    * @author              Gleyson Sampaio
    * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
      */
      static Integer dividir(Integer dividendo, Integer divisor){
      return dividendo / divisor;
    }
}
```
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 14-30-17.png)
#
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 14-30-32.png)
#
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 14-31-09.png)
#
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 14-31-22.png)
#
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 14-32-07.png)
#

````
Nota: Para gerar a documentação via intellij

Navegue pela aba de menu > Tools

Generate JavaDoc...

Defina os paramêntros e diretório para geração da documentação e confirme
````
#
![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 15-05-06.png)
<br>

### Aula 19
#### Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou, nossos clientes tendo que instalar o Eclipse ou VsCode
para rodar o sistema em sua empresa ?

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para
qualquer sistema operacional.

No nosso caso, iremos aprender como executar um programa Java via terminal, como MS - DOS ou terminal do VsCode.
Vamos criar uma classe chamada `MinhaClasse.java` com o código abaixo:

```java
public class MinhaClasse {
    
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    
    }
}
```

````
Observe que nosso projeto Java criado por uma IDE, terá uma pasta chamada bin. É nesta pasta que ficarão os arquivos
.class, o nosso bytecode.
````

![](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b0a0e8dfb7fae04ab09b41daf0d22ac472dcd318%2Fimage%20(15)%20(1).png?alt=media)

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no meu caso
está em: C:\estudos\dio-trilha-java-basico\java-terminal.

![](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-134a5c7508ca0d898df7205309157802da074147%2Fimage%20(6)%20(1)%20(1).png?alt=media)

##### Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o MS-DOS ou Power Shell;
2. Localize o diretório do seu projeto: **`cd C:\estudos\dio-trilha-java-basico\java-terminal;`**
3. Acesse a pasta **** bin: ** **cd bin** **`;`
4. Agora digite o comando: **java MinhaClasse** (nome da sua classe sem a extensão **.class**).

![](https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-178df39af2221a5577f56bcc1310fff651679ffe%2Fimage%20(14)%20(1).png?alt=media)

<br>

### Aula 20
#### Argumentos

Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array `[]` de argumentos, do
tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:

````
java MinhaClasse agumentoUm argumentoDois
````

Exemplo:

```java
public class AboutMe {
    public static void main(String[] args) {
        
        
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
```

**Terminal - Linux**
1. Localize o diretório do arquivo.
2. Abra o terminal onde está o arquivo - Botão direito do mouse e abri terminal.
3. Insira o comando `java` `<NoDaClasse>.java` `<Argumento[0]>` `<Argumento[1]>` `<Argumento[2]>` `<Argumento[3]>`
4. Confirme com **Enter**

![](/home/mauricio/Imagens/Capturas de tela/Captura de tela de 2023-08-23 17-46-29.png)

<br>

### Aula 21
#### Scanner

Nos exemplos anteriores, percebemos que podemos receber, dados digitados pelo usuário do nosso sistema, porém, tudo
precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode
deixar margens de execução, com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de
dados mais seguras, agora vamos receber estes dados via Scanner.

A classe Scanner, permite que o usuário tenha, uma interação mais assertiva com o nosso programa, veja como vamos mudar
o nosso programa AboutMe para deixar mais intuitivo aos usuários:

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
```
#
**Referencias:** 
> https://sintaxe.netlify.app/topicos/linguagens/java/sobre
 
> https://glysns.gitbook.io/java-basico/
 
> Github do instrutor: https://github.com/glysns

> Linkedin do instrutor: https://www.linkedin.com/in/glysns/

> Meu Github: https://github.com/JMAURICIORLIMA

> Meu Linkedin: https://www.linkedin.com/in/josemauricio-rodriguesdelima/

***Bons estudos a todos.***