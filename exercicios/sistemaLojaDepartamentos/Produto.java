/**
 * Classe abstrata para produtos.
 */
public abstract class Produto {

    protected String descricao;
    protected double valorOriginal;

    /**
     * Construtor da classe.
     *
     * @param descricao Descrição do produto.
     * @param valorOriginal Valor original.
     */
    public Produto(String descricao, double valorOriginal) {

        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
    }

    /**
     * Aplica desconto no produto.
     *
     * @param porcentagem Porcentagem do desconto.
     */
    public abstract void aplicarDesconto(double porcentagem);

    /**
     * Retorna o valor do produto.
     *
     * @return Valor do produto.
     */
    public double getValorOriginal() {
        return valorOriginal;
    }

    /**
     * Retorna a descrição do produto.
     *
     * @return Descrição.
     */
    public String getDescricao() {
        return descricao;
    }
}