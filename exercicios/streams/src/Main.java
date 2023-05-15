import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    class Str {
        public static int getTamanhoString(String str) {
            return str.length();
        }
    }

    public static void main(String[] args) {
        // Ordena Strings da menor para a maior.

        List<String> lista = Arrays.asList("abcd", "a", "abc", "ab");
        List<String> listaOrdenada = lista.stream()
                .sorted(Comparator.comparing(Str::getTamanhoString))
                .collect(Collectors.toList());

        System.out.println(listaOrdenada);

    }
}
