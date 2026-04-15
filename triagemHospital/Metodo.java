import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodo {
    /**
     * Cadastra um paciente na lista, solicitando nome e peso. Lança exceções para nome vazio ou peso inválido.
     * @param lista - Lista de pacientes onde o novo paciente será adicionado.
     * @param teclado - Scanner para leitura de entrada do usuário.
     */
    public static void cadastrarPaciente(ArrayList<Paciente> lista, Scanner teclado) {

        try {
            System.out.print("Digite o nome do paciente: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o peso do paciente: ");
            double peso = teclado.nextDouble();
            teclado.nextLine();

            Paciente p = new Paciente(nome, peso);
            lista.add(p);

            System.out.println("Paciente cadastrado com sucesso!");
        /** 
         * Lança NullPointerException se o nome for vazio 
         */
        } catch (NullPointerException e) {
            System.out.println("Erro: Nome inválido.");
        /**
         * Lança InputMismatchException se o peso for inválido
         */
        } catch (InputMismatchException e) {
            System.out.println("Erro: Peso inválido.");
            teclado.nextLine();
        /**
         * Lança outro erro inesperado
         */
        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }
    /**
     * Lista os pacientes cadastrados na lista. Se a lista estiver vazia, exibe mensagem informando que não há pacientes cadastrados.
     * @param lista - Lista de pacientes a ser exibida.
     */
    public static void listarPacientes(ArrayList<Paciente> lista) {

        if (lista.isEmpty()) {
            System.out.println("Não há pacientes cadastrados.");
            return;
        }

        System.out.println("\n--- LISTA DE PACIENTES CADASTRADOS ---");
        for (Paciente p : lista) {
            System.out.println(p);
        }
    }
}