/**
 * @author Marcelo Moura
 * @since 01/2023
 * 
 * Este projeto Java consiste em praticar a criação do Java Doc, entrada de dados via terminal
 * e entrada de dados através da Classe Scanner.
 */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e pressione Enter: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade e pressione Enter: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
}
