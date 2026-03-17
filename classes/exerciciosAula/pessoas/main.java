package pkg;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("\n--- Dados pessoais: ---");
        System.out.println("Nome: "+p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Gênero: " + p.genero);
    }
}