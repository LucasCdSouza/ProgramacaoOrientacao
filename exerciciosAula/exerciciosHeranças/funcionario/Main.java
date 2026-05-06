public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente();
        Funcionario v = new Vendedor();

        System.out.println(g.calcularSalario());
        System.out.println(v.calcularSalario());
    }
}