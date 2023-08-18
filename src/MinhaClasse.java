public class MinhaClasse {

    public static void main(String[] args) {

        System.out.println("Hello, Santander!");

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



        String primeiroNome = "José";
        String segundoNome = "Maurício";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        System.out.printf("%s", nomeCompleto);
    }

    public static String nomeCompleto(String primeroNome, String segundoNome) {
        return "Retorno do método " + primeroNome.concat(" ").concat(segundoNome);
    }
}
