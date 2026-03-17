package pkg.computadores;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Computador c = new Computador();
        System.out.println("Digite a marca do computador: ");
        c.marca = teclado.nextLine();
        System.out.println("Digite o modelo do computador: ");
        c.modelo = teclado.nextLine();
        System.out.println("Digite o tipo do computador: ");
        c.tipo = teclado.nextLine();
        System.out.println("Digite o preço desse computador: ");
        c.preco = teclado.nextInt();
        
    
        Computador c2 = new Computador();
        teclado.nextLine();
        System.out.println("Marca: "+c2.marca);
        System.out.println("Marca: "+c2.marca);
        System.out.println("Modelo: "+c2.modelo);
        System.out.println("Tipo: "+c2.tipo);
        System.out.println("Preço: "+c2.preco);

        System.out.println("\n--- Computador 1 ---");
        System.out.println("Marca: " + c.marca);
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Tipo: " + c.tipo);
        System.out.println("Preço: R$ " + c.preco);

        System.out.println("\n--- Computador 2 ---");
        System.out.println("Marca: " + c2.marca);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Tipo: " + c2.tipo);
        System.out.println("Preço: R$ " + c2.preco);
    }
}