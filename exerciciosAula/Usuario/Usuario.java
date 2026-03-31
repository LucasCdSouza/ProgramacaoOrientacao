public class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return "********";
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("A senha deve ter no mínimo 8 caracteres.");
        }
    }
}