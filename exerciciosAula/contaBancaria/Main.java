import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(2000, 1000);

        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Limite: " + conta.getLimite());

        conta.sacar(2500);

        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}