# Sintaxe

### Aula 01

#### Anatomia das classes

Um dos principais recursos que utilizamos no paradigma de orientação a objetos são as classes, com elas podemos
abstraire criar representações do mundo real para o código.

```
public class MinhaClasse {

  //SEU CÓDIGO AQUI

}
```
* 99,9% das nossas classes iniciarão com public class.
* Toda classe precisa de nome, exemplo MinhaClasse.
* Após o nome, precisamos definir o corpo { } onde iremos compor nossas classes com atributos e métodos.

```
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

```
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
```
[Sintaxe](https://sintaxe.netlify.app/topicos/linguagens/java/basico/sintaxe)

<br>

#### Variáveis e métodos

Como identificar a diferença entre, declaração de variáveis e métodos em nossa programação? Existe uma estrutura comum
para ambas as finalidades, exemplo:

```
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

```
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

```
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

```
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