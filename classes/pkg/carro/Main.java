package pkg.carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro c = new Carro();
        System.out.println("Digite a marca do carro 1: ");
        c.marca = teclado.nextLine();
        System.out.println("Digite o modelo do carro 1: ");
        c.modelo = teclado.nextLine();
        System.out.println("Digite o ano de lançamento do carro 1: ");
        c.anolancamento = teclado.nextInt();

        
        Carro c2 = new Carro();
        teclado.nextLine();
        System.out.println("Digite a marca do carro 2: ");
        c2.marca = teclado.nextLine();
        System.out.println("Digite o modelo do carro 2: ");
        c2.modelo = teclado.nextLine();
        System.out.println("Digite o ano de lançamento do carro 2: ");
        c2.anolancamento = teclado.nextInt();
        teclado.close();
    }
}
