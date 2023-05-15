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

        String resultado = data.dataValida(dataParaConversao) == true ? "Data válida." : "Data inválida.";

        System.out.println(resultado);
    }
}
