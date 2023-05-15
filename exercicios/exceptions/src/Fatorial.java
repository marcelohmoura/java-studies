public class Fatorial {
    int n = -1;
    int fatorial = 1;

    public int calculoFatorial() {
        if (n < 0) {
            throw new RuntimeException("Erro: O valor de entrada não deve ser negativo.");
        }
        else {
            for (int i = 1; i <= n; ++i) {
                fatorial *= i;
            }
        }
        return fatorial;
    }
}
