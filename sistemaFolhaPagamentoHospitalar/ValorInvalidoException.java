/**
 * Exceção personalizada utilizada para validar dados financeiros e operacionais
 * no sistema hospitalar.
 * <p>Por estender {@link RuntimeException}, esta é uma exceção não verificada (unchecked),
 * sendo ideal para capturar erros de lógica ou violações de regras de negócio em tempo 
 * de execução, como salários abaixo do mínimo ou cargas horárias excedidas.</p>
 */
public class ValorInvalidoException extends RuntimeException {

    /**
     * Construtor da exceção com mensagem personalizada.
     * 
     * @param mensagem Texto explicativo sobre o valor inválido detectado.
     */
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}