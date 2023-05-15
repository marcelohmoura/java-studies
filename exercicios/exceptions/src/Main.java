import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fatorial ////////////////////////////////////////////////////////////////////////////
        Fatorial fatorial = new Fatorial();

        try {
            System.out.printf("Resultado Fatorial: %d", fatorial.calculoFatorial());
        }
        catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
        ////////////////////////////////////////////////////////////////////////////////////////

        // Divisao
        Divisao divisao = new Divisao();

        try {
            System.out.printf("Resultado Divisão: %d", divisao.calculoDivisao());
        }
        catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
        ////////////////////////////////////////////////////////////////////////////////////

        // String -> Data dd/MM/yyyy

        Data data = new Data();
        System.out.println("Digite a data a ser convertida:");
        Scanner entrada = new Scanner(System.in);
        String dataParaConversao = entrada.next();

        try {
            System.out.println("Digite a data a ser validada: " + data.dataValida(dataParaConversao));
        }
        catch (DateTimeParseException e) {
            System.out.println("Data inválida.");
        }
    }
}
