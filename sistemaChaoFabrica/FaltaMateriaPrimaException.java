/**
 * Exceção lançada quando uma máquina industrial tenta iniciar ou continuar
 * um processo de produção, mas o estoque de matéria-prima é insuficiente.
 * <p>Por ser uma exceção verificada, deve ser tratada obrigatoriamente para
 * evitar paradas não planejadas no sistema de controle da fábrica.</p>
 */
public class FaltaMateriaPrimaException extends Exception {
}