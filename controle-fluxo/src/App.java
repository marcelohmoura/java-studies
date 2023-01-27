public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Marcelo";
        int idade = 23;
        double nota = 3.5;
        
        // Estrutura condicional simples
        if (5 > 4) {
            System.out.println("5 é maior que 4");
        }

        // Estrutura de condicional composta
        if (3 > 6) {
            System.out.println("3 é maior que 6");
        } else {
            System.out.println("3 não é maior que 6");
        }

        // Estrutura condicional encadeada
        if ("Marcelo" == nome) {
            if (23 == idade) {
                System.out.println("Meus dados estão corretos!");
            }
        } else {
            System.out.println("Ops, pessoa errada...");
        }

        // Estrutura condicional ternária
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        // Estrutura Switch Case
        String planoTelefonia = "simples";

        switch(planoTelefonia) {
            case "simples":{
                System.out.println("O plano selecionado foi: " + planoTelefonia);
                break;
            }
            case "plus":{
                System.out.println("O Plano selecionado foi: " + planoTelefonia);
                break;
            }
            default:
                System.out.println("Não existe plano de telefonia com o nome informado."); 
        }
    }
}
