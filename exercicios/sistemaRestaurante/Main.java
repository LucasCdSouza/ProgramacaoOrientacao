import java.util.Scanner;

/**
 * Classe principal do sistema do restaurante.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pedido pedido = new Pedido();

        int opcao;

        do {

            System.out.println("\n===== RESTAURANTE =====");
            System.out.println("1 - Mostrar pratos");
            System.out.println("2 - Mostrar bebidas");
            System.out.println("3 - Fazer pedido");
            System.out.println("4 - Fechar conta");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    mostrarPratos();

                    break;

                case 2:

                    mostrarBebidas();

                    break;

                case 3:

                    fazerPedido(scanner, pedido);

                    break;

                case 4:

                    double total = pedido.fecharConta();

                    System.out.println("\n===== CONTA FINAL =====");
                    System.out.println("Valor total: R$ " + total);

                    break;

                case 5:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    /**
     * Mostra os pratos disponíveis.
     */
    public static void mostrarPratos() {

        System.out.println("\n===== PRATOS =====");
        System.out.println("1 - Lasanha -> R$ 45");
        System.out.println("2 - Hambúrguer -> R$ 35");
        System.out.println("3 - Pizza -> R$ 60");
    }

    /**
     * Mostra as bebidas disponíveis.
     */
    public static void mostrarBebidas() {

        System.out.println("\n===== BEBIDAS =====");
        System.out.println("4 - Refrigerante -> R$ 8");
        System.out.println("5 - Suco -> R$ 10");
        System.out.println("6 - Vinho (Alcoólica +10%) -> R$ 50");
        System.out.println("7 - Cerveja (Alcoólica +10%) -> R$ 15");
    }

    /**
     * Realiza o pedido do cliente.
     *
     * @param scanner Scanner.
     * @param pedido Pedido do cliente.
     */
    public static void fazerPedido(Scanner scanner, Pedido pedido) {

        int item;

        System.out.println("\n===== MENU =====");

        mostrarPratos();
        mostrarBebidas();

        System.out.print("\nDigite o número do item: ");
        item = scanner.nextInt();

        switch (item) {

            case 1:

                pedido.adicionarItem(
                        new PratoPrincipal(
                                "Lasanha",
                                45,
                                30
                        )
                );

                System.out.println("Lasanha adicionada ao pedido.");

                break;

            case 2:

                pedido.adicionarItem(
                        new PratoPrincipal(
                                "Hambúrguer",
                                35,
                                20
                        )
                );

                System.out.println("Hambúrguer adicionado ao pedido.");

                break;

            case 3:

                pedido.adicionarItem(
                        new PratoPrincipal(
                                "Pizza",
                                60,
                                40
                        )
                );

                System.out.println("Pizza adicionada ao pedido.");

                break;

            case 4:

                pedido.adicionarItem(
                        new Bebida(
                                "Refrigerante",
                                8,
                                false
                        )
                );

                System.out.println("Refrigerante adicionado ao pedido.");

                break;

            case 5:

                pedido.adicionarItem(
                        new Bebida(
                                "Suco",
                                10,
                                false
                        )
                );

                System.out.println("Suco adicionado ao pedido.");

                break;

            case 6:

                pedido.adicionarItem(
                        new Bebida(
                                "Vinho",
                                50,
                                true
                        )
                );

                System.out.println("Vinho adicionado ao pedido.");

                break;

            case 7:

                pedido.adicionarItem(
                        new Bebida(
                                "Cerveja",
                                15,
                                true
                        )
                );

                System.out.println("Cerveja adicionada ao pedido.");

                break;

            default:

                System.out.println("Item inválido.");
        }
    }
}