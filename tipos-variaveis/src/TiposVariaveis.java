public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Tipos Primitivos 

        byte b;     // => 0
        short s;    // => 0
        int i;      // => 0
        long l;     // => 0L
        float f;    // => 0F
        double d;   // => 0.0D
        char c;     // => '\u0000'
        boolean bb; // => false
        //* Caso não seja inicializadas, as variáveis possuem um valor padrão */

        // Separando números em grupos de dígitos usando Underscore

        // A partir do Java 7, é possível separar grupos de números usando Underscore para
        // facilitar a leitura, porém algumas regras devem ser levadas em consideração, não podendo
        // ser usado nos seguintes casos:
        // - No começo ou final de um número
        // - Junto com a notação '.' no caso de números com casas decimais
        // - Anterior aos sufixos F ou L no caso de float e long 
        // - Em posições onde se é esperado String

        l = 1234_5678_9012_3456L;
        f =  3.14_15F;
        System.out.println(l);
        System.out.println(f);

        // Declarando Constantes

        final double VALOR_DE_PI = 3.14;
        //* Por Convenção utilizando Caixa Alta e Underscore para nomear um constante */
    }
}
