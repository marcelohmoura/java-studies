public class App {
    public static void main(String[] args) throws Exception {
        
        int sum = 1 + 1;
        int sub = 1 - 1;
        int mult = 2 * 2;
        int div = 4 / 2;
        int mod = 4 % 2;

        System.out.println("O resultado de sum é: " + sum);
        System.out.println("O resultado de sub é: " + sub);
        System.out.println("O resultado de mult é: " + mult);
        System.out.println("O resultado de div é: " + div);
        System.out.println("O resultado de mod é: " + mod);

        String nomeSobrenome = "Marcelo " + "Moura";

        System.out.println("Nome e sobrenome: " + nomeSobrenome);

        int pos = 1;
        int neg = -1;
        int negVal = - pos;
        int posVal = neg * -1;

        System.out.println("O valor positivo é: " + posVal);
        System.out.println("O valor negativo é: " + negVal);

        int numInicial = 1;
        int numInc = ++ numInicial; // Altera de fato o valor da variável numInicial, e faz a atribuição do novo valor
        int numDec = -- numInicial;

        System.out.println("O valor incrimentado é: " + numInc);
        System.out.println("O valor incrimentado é: " + numDec);

        boolean igualdade = 1 == 1;
        boolean diferente = 1 != 2;
        boolean maior = 4 > 3;
        boolean menor = 4 < 3;
        boolean maiorOuIgual = 4 >= 3;
        boolean menorOuIgual = 4 <= 3;

        System.out.println(igualdade);
        System.out.println(diferente);
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(maiorOuIgual);
        System.out.println(menorOuIgual);

        boolean condicaoE = true && true;
        boolean condicaoOu = true || false;

        System.out.println(condicaoE);
        System.out.println(condicaoOu);

    }
}
