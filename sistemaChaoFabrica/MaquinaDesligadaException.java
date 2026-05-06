/**
 * Exceção lançada quando uma tentativa de operação (como produzir um lote) 
 * é realizada enquanto a máquina industrial está no estado desligada.
 * <p>Por estender {@link Exception}, exige tratamento obrigatório para assegurar 
 * que o fluxo de controle da fábrica verifique o estado do hardware antes da execução.</p>
 */
public class MaquinaDesligadaException extends Exception {
}