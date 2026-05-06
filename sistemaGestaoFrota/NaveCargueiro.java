public class NaveCargueiro extends NaveEspacial {

    private double pesoCargaAtual;
    private double capacidadeMaximaCarga;

    /**
     * Construtor para criar uma nave de carga.
     * 
     * @param id Identificador único da nave.
     * @param combustivelMax Capacidade total do tanque de combustível.
     * @param velocidade Velocidade base de deslocamento.
     * @param capacidadeMaximaCarga Limite máximo de peso que a nave pode transportar.
     */
    public NaveCargueiro(String id, double combustivelMax, double velocidade,
                         double capacidadeMaximaCarga) {
        super(id, combustivelMax, velocidade);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    // GETTERS

    /** @return O peso da carga transportada atualmente. */
    public double getPesoCargaAtual() {
        return pesoCargaAtual;
    }

    /** @return O limite de carga suportado pela nave. */
    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    // SETTERS

    /**
     * Atualiza o peso da carga atual após validar a capacidade.
     * 
     * @param pesoCargaAtual Novo peso a ser carregado.
     * @throws IllegalArgumentException Se o peso informado for maior que a capacidade máxima.
     */
    public void setPesoCargaAtual(double pesoCargaAtual) {
        if (pesoCargaAtual > capacidadeMaximaCarga) {
            throw new IllegalArgumentException("Carga excede capacidade máxima!");
        }
        this.pesoCargaAtual = pesoCargaAtual;
    }

    /** @param capacidadeMaximaCarga Define um novo limite máximo para a carga. */
    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    /**
     * Calcula o consumo de combustível baseado na distância e no peso da carga.
     * <p>O cálculo utiliza uma taxa de 0.5 unidades por ano-luz somada a um 
     * custo logístico de 0.2 unidades para cada quilo/tonelada de carga atual.</p>
     * 
     * @param distancia A distância em anos-luz a ser percorrida.
     * @return O total de combustível necessário para a operação.
     */
    @Override
    public double calcularConsumo(double distancia) {
        return (distancia * 0.5) + (pesoCargaAtual * 0.2);
    }
}