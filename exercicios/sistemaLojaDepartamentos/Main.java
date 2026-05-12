import java.util.ArrayList;

/**
 * Classe principal para testes.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Eletronico("Notebook", 3500));
        produtos.add(new Vestuario("Camiseta", 120));
        produtos.add(new Alimento("Arroz", 30));

        double totalImpostos = 0;

        for (Produto produto : produtos) {

            try {

                produto.aplicarDesconto(10);

            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
            }

            if (produto instanceof Tributavel) {

                Tributavel tributavel = (Tributavel) produto;

                totalImpostos += tributavel.calcularImposto();
            }
        }

        System.out.println("Total de impostos: R$ " + totalImpostos);
    }
}