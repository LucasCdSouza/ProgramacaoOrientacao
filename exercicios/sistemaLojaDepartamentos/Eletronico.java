/**
 * Classe para produtos eletrônicos.
 */
public class Eletronico extends Produto implements Tributavel {

    /**
     * Construtor da classe.
     *
     * @param descricao Descrição.
     * @param valorOriginal Valor original.
     */
    public Eletronico(String descricao, double valorOriginal) {

        super(descricao, valorOriginal);
    }

    /**
     * Calcula imposto do eletrônico.
     *
     * @return Valor do imposto.
     */
    @Override
    public double calcularImposto() {
        return valorOriginal * 0.15;
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