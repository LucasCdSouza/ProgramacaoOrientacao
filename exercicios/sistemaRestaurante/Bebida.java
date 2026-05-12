/**
 * Classe que representa uma bebida.
 */
public class Bebida extends ItemCardapio {

    private boolean isAlcoolica;

    /**
     * Construtor da classe.
     *
     * @param nome Nome da bebida.
     * @param precoBase Preço base.
     * @param isAlcoolica Indica se é alcoólica.
     */
    public Bebida(String nome, double precoBase, boolean isAlcoolica) {

        super(nome, precoBase);

        this.isAlcoolica = isAlcoolica;
    }

    /**
     * Calcula o preço final da bebida.
     *
     * @return Preço final.
     */
    @Override
    public double calcularPrecoFinal() {

        if (isAlcoolica) {
            return precoBase + (precoBase * 0.10);
        }

        return precoBase;
    }
}