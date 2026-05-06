/**
 * Exceção disparada quando uma nave tenta realizar uma viagem sem ter
 * combustível suficiente em seu tanque atual.
 * <p>Por estender {@link Exception}, esta é uma exceção verificada (checked exception),
 * exigindo tratamento obrigatório via blocos try-catch ou declaração throws.</p>
 */
public class CombustivelInsuficienteException extends Exception {

    /**
     * Construtor da exceção com uma mensagem personalizada.
     * 
     * @param mensagem Texto detalhando a falta de combustível para a distância solicitada.
     */
    public CombustivelInsuficienteException(String mensagem) {
        super(mensagem);
    }
}