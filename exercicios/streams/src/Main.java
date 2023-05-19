import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        /////////////////////////////////////////////

        // Cálculo da soma de números pares de uma matriz

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int soma = Arrays.stream(matriz)
                .flatMapToInt(IntStream::of)
                .filter(e -> e % 2 == 0)
                .sum();

        System.out.println("Soma dos números pares da matriz: " + soma);

        //////////////////////////////////////////////////////////////////

        // Encontra o valor máximo em um Array usando Streams

        int[] arr = {1, 2, 4, 3, 5, 6, 10, 20, 31, 12};
        OptionalInt max = Arrays.stream(arr).max();

        System.out.println("Valor máximo: " + 31);

        ///////////////////////////////////////////////////////////////////

        // Coloca todas as Strings de um Array em caixa alta

        String[] arrOfStrings = {"marcelo", "henrique", "de", "moura"};
        List<String> itensEmCaixaAlta = Arrays
                .stream(arrOfStrings)
                .map(String::toUpperCase)
                .toList();

        System.out.println("Em caixa alta: " + itensEmCaixaAlta);
    }
}
