/**
 * Exceção disparada quando um equipamento (especialmente a Prensa Hidráulica)
 * excede o limite térmico de segurança operacional.
 * <p>Por ser uma exceção verificada, obriga a implementação de protocolos de 
 * resfriamento ou paradas de emergência no fluxo principal da fábrica.</p>
 */
public class SuperaquecimentoException extends Exception {
}