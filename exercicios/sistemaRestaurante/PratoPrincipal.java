/**
 * Classe que representa um prato principal.
 */
public class PratoPrincipal extends ItemCardapio {

    private int tempoPreparo;

    /**
     * Construtor da classe.
     *
     * @param nome Nome do prato.
     * @param precoBase Preço base.
     * @param tempoPreparo Tempo de preparo.
     */
    public PratoPrincipal(String nome, double precoBase, int tempoPreparo) {

        super(nome, precoBase);

        this.tempoPreparo = tempoPreparo;
    }

    /**
     * Retorna o preço final do prato.
     *
     * @return Preço final.
     */
    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }
}