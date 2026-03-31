import java.util.Scanner;
public class ContaBancaria {
    private double limite = 10000;
    private double saldo = 4700;

    public ContaBancaria(double saldoInicial, double limiteInicial ){
        this.saldo = saldoInicial;
        setLimite(limiteInicial);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite > 0) {
            this.limite = limite;
        }else{
            System.out.println("Limite nao pode ser negativo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean sacar(double valor){
        if(valor > 0 && valor < (this.limite + this.saldo)){
            this.saldo -= valor;
            System.out.println("Saque no valor de: " + valor + "realizado com sucesso");
            return true;
        }else{
            System.out.println("Saque no valor de  " + valor + " negado, limite insuficiente.");
            return false;
        }
    }
}