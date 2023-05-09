public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Marcelo Moura");
        pessoa.setIdade(23);
        pessoa.setEndereco("Araraquara");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());

        Estudante estudante = new Estudante();

        estudante.setMatricula("N503HB-7");
        estudante.setCurso("Ciência da Computação");

        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Curso: " + estudante.getCurso());

        Professor professor = new Professor();

        professor.setNome("Ricardo");
        professor.setIdade(42);
        professor.setEndereco("Ribeirão Preto");
        professor.setDisciplina("Programação Orientada a Objetos");
        professor.setSalario(10845.32);

        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Endereço: " + professor.getEndereco());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: " + professor.getSalario());
    }
}