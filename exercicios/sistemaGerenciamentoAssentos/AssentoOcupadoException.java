/**
 * Exceção personalizada para assentos já ocupados.
 */
public class AssentoOcupadoException extends Exception {

    /**
     * Construtor da exceção.
     *
     * @param mensagem Mensagem de erro.
     */
    public AssentoOcupadoException(String mensagem) {
        super(mensagem);
    }
}