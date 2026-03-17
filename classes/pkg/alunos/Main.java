package pkg.alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        a.nome = teclado.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        a.matricula = teclado.nextLine();

        System.out.print("Digite a nota 1: ");
        a.nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        a.nota2 = teclado.nextDouble();

        System.out.print("Digite a nota 3: ");
        a.nota3 = teclado.nextDouble();

        // Calculando a média das duas primeiras notas
        double media = (a.nota1 + a.nota2) / 2;

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + a.nome);
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Nota 1: " + a.nota1);
        System.out.println("Nota 2: " + a.nota2);
        System.out.println("Nota 3: " + a.nota3);
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}