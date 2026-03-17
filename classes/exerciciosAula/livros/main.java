package pkg;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Livro li = new Livro();
        System.out.println("\n--- Dados pessoais: ---");
        System.out.println("Nome do livro: "+li.titulo);
        System.out.println("Ano de publicação: " +li.anopublicacao);
        System.out.println("Autor do livro: " +li.autor);
    }
}