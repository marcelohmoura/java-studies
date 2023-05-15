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
        /////////////////////////////////////////////////////////////////////////////////////

        // Conversão de String para int

        System.out.println("Digite uma String para ser convertida:");
        Scanner entradaStr = new Scanner(System.in);
        String str = entradaStr.next();

        ConversaoNumeroInteiro conversao = new ConversaoNumeroInteiro();
        try {
            int inteiro = conversao.stringParaInteiro(str);
            System.out.println("Resultado: " + inteiro);
        }
        catch(Exception e) {
            System.out.println("Erro: O valor informado não pode ser convertido para inteiro.");
        }
    }
}
