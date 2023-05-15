import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt();
        int restoDivisao = numero % 2;
        String resposta = "";

        System.out.println(numero);

        if (restoDivisao == 0) {
            resposta = "Par";
        } else {
            resposta = "Ímpar";
        }

        System.out.println(resposta);
    }
}