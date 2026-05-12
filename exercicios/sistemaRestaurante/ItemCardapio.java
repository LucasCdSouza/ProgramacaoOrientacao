/**
 * Classe abstrata para itens do cardápio.
 */
public abstract class ItemCardapio {

    protected String nome;
    protected double precoBase;

    /**
     * Construtor da classe.
     *
     * @param nome Nome do item.
     * @param precoBase Preço base do item.
     */
    public ItemCardapio(String nome, double precoBase) {

        this.nome = nome;
        this.precoBase = precoBase;
    }

    /**
     * Calcula o preço final do item.
     *
     * @return Preço final.
     */
    public abstract double calcularPrecoFinal();
}