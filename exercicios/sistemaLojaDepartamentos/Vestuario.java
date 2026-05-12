/**
 * Classe para produtos de vestuário.
 */
public class Vestuario extends Produto implements Tributavel {

    /**
     * Construtor da classe.
     *
     * @param descricao Descrição.
     * @param valorOriginal Valor original.
     */
    public Vestuario(String descricao, double valorOriginal) {

        super(descricao, valorOriginal);
    }

    /**
     * Calcula imposto do vestuário.
     *
     * @return Valor do imposto.
     */
    @Override
    public double calcularImposto() {
        return valorOriginal * 0.05;
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