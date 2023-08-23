package terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe seu primeiro nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe seu segundo nome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("\n|----------------------------|\n");

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.printf("Minha altura é %.2f cm", altura);

    }
}
