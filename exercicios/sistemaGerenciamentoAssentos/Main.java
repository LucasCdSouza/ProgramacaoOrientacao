import java.util.Scanner;

/**
 * Classe principal do sistema.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Voo voo = new Voo("LA123", "São Paulo");

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE RESERVA =====");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Mostrar assentos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o número do assento (1 a 100): ");
                    int numeroAssento = scanner.nextInt();

                    try {

                        voo.reservarAssento(numeroAssento);

                    } catch (AssentoOcupadoException e) {

                        System.out.println("Erro: " + e.getMessage());

                    } catch (IllegalArgumentException e) {

                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 2:

                    voo.mostrarAssentos();

                    break;

                case 3:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}