import java.util.ArrayList;
import java.util.Scanner;

public class Triagem {
    /**
     * Exibe o menu principal do sistema de triagem hospitalar
     * @param lista - Lista de pacientes a ser gerenciada no sistema
     */
    public static void menu(ArrayList<Paciente> lista) {

        String opcao = "";
        Scanner teclado = new Scanner(System.in);

        do {
            System.err.println("-----------------------");
            System.out.println("        M E N U        ");
            System.out.println("-----------------------");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    Metodo.cadastrarPaciente(lista, teclado);
                    break;

                case "2":
                    Metodo.listarPacientes(lista);
                    break;

                case "3":
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }

        } while (!opcao.equals("3"));
    }
}