/**
 * Exceção sinalizada quando um equipamento industrial atinge um nível de 
 * descalibração que impede a operação segura ou produtiva.
 * <p>Por estender {@link Exception}, esta é uma exceção verificada que exige 
 * tratamento obrigatório (try-catch) ou propagação (throws) pelo método chamador.</p>
 */
public class EquipamentoDescalibradoException extends Exception {
}