public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void mostrarDados() {
        System.out.println(" - " + nome + " - " + idade + " - " + matricula);
    }
}