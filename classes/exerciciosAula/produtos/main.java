package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = teclado.nextLine();

        System.out.print("Digite o preço do produto: ");
        produto.preco = teclado.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        produto.quantidadeEmEstoque = teclado.nextInt();

        double valorTotal = produto.preco * produto.quantidadeEmEstoque;

        System.out.println("\n--- Informações do Produto ---");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade em estoque: " + produto.quantidadeEmEstoque);
        System.out.println("Valor total em estoque: R$ " + valorTotal);

        teclado.close();
    }
}