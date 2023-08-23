package terminaleargumentos;

public class AboutMe {

    /*
    * Esta classe apesar de não apresentar nenhum erro de sintax, não consegue ser executada pela IDE.
     */

    public static void main(String[] args) {

        //os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}
