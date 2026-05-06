/**
 * Exceção personalizada para indicar operações com valores de combustível inválidos.
 * <p>Esta exceção é lançada quando o combustível atual tenta ser definido com um valor
 * negativo ou que ultrapasse a capacidade máxima do tanque da nave.</p>
 */
public class CombustivelInvalidoException extends IllegalArgumentException {

    /**
     * Construtor da exceção com uma mensagem detalhada.
     * 
     * @param mensagem Texto descrevendo o erro ocorrido (ex: "Valor acima do máximo").
     */
    public CombustivelInvalidoException(String mensagem) {
        super(mensagem);
    }
}