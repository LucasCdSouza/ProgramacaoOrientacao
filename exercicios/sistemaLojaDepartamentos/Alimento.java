/**
 * Classe para alimentos.
 */
public class Alimento extends Produto {

    /**
     * Construtor da classe.
     *
     * @param descricao Descrição.
     * @param valorOriginal Valor original.
     */
    public Alimento(String descricao, double valorOriginal) {

        super(descricao, valorOriginal);
    }

    /**
     * Aplica desconto no produto.
     *
     * @param porcentagem Porcentagem do desconto.
     */
    @Override
    public void aplicarDesconto(double porcentagem) {

        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido.");
        }

        valorOriginal -= valorOriginal * (porcentagem / 100);
    }
}