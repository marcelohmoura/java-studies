import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numerosHardCoded = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numeros = new int[10];

        for(int i = 0; i <= 9; i+= 1) {
            numeros[i] = i;
        }
        System.out.println("Numeros Hard Coded: " + Arrays.toString(numerosHardCoded));
        System.out.println("Numeros Hard Coded: " + Arrays.toString(numeros));

        // ArrayList
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> elementos = new ArrayList<Integer>();

        nomes.add("Marcelo");
        nomes.add("Ricardo");
        nomes.add("Paulo");
        nomes.add("Rafael");

        System.out.println(nomes);

        elementos.add(1);
        elementos.add(2);
        elementos.add(3);

        for (int i = 0; i < elementos.size(); i+= 1) {
            int valor = elementos.get(i);
            elementos.set(i, valor + 1);
        }
        for (int i : elementos) {
            System.out.println(elementos);
        }

        // HashMap
        HashMap<String, String> capitaisPaises = new HashMap<String, String>();

        capitaisPaises.put("Brasil", "Brasília");
        capitaisPaises.put("Uruguai", "Montevidéu");
        capitaisPaises.put("Argentina", "Buenos Aires");

        System.out.println(capitaisPaises);

        // HashSet
        HashSet<String> cores = new HashSet<String>();

        cores.add("Azul");
        cores.add("Preto");
        cores.add("Amarelo");

        System.out.println(cores);
    }
}
