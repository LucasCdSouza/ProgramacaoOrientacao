public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario("Lucas", "12345678");

        System.out.println("Nome: " + u.getNome());
        System.out.println("Senha: " + u.getSenha());

        u.setSenha("123"); // inválida
    }
}