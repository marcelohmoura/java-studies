public class Divisao {
    int n = 4, dividendo = 0;

    public int calculoDivisao() {
        if (dividendo == 0) {
            throw new RuntimeException("Não é permitido divisão por zero.");
        }
        else {
            return n / dividendo;
        }
    }
}
