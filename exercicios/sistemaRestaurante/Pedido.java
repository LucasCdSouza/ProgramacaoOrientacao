import java.util.ArrayList;

/**
 * Classe que representa um pedido.
 */
public class Pedido {

    private ArrayList<ItemCardapio> itens;

    /**
     * Construtor da classe.
     */
    public Pedido() {
        itens = new ArrayList<>();
    }

    /**
     * Adiciona um item ao pedido.
     *
     * @param item Item do cardápio.
     */
    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    /**
     * Calcula o valor total da conta.
     *
     * @return Valor total.
     */
    public double fecharConta() {

        double total = 0;

        for (ItemCardapio item : itens) {
            total += item.calcularPrecoFinal();
        }

        return total;
    }
}