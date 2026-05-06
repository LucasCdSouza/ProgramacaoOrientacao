package exerciciosHeranças.funcionario;

public class Gerente {
    public class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        return 15000;
    }
}
}
