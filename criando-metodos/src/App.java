public class App {
    public static String retornaNome (String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }

    public static void main(String[] args) throws Exception {
        String nome = "Marcelo";
        String sobrenome = "Moura";
        String nomeSobrenome = retornaNome(nome, sobrenome);
        System.out.println(nomeSobrenome);
    }
}
