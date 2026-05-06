public class NaveCombate extends NaveEspacial {

    private int numeroArmas;
    private boolean escudoAtivado;

    /**
     * Construtor para criar uma nave de combate.
     * 
     * @param id Identificador único da nave.
     * @param combustivelMax Capacidade total do tanque.
     * @param velocidade Velocidade base de deslocamento.
     * @param numeroArmas Quantidade de armamentos instalados.
     * @param escudoAtivado Define se o escudo defletor inicia ligado.
     */
    public NaveCombate(String id, double combustivelMax, double velocidade,
                       int numeroArmas, boolean escudoAtivado) {
        super(id, combustivelMax, velocidade);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    // GETTERS
    
    /** @return A quantidade de armas da nave. */
    public int getNumeroArmas() {
        return numeroArmas;
    }

    /** @return true se o escudo estiver ativo, false caso contrário. */
    public boolean isEscudoAtivado() {
        return escudoAtivado;
    }

    // SETTERS
    
    /** @param numeroArmas Nova quantidade de armas. */
    public void setNumeroArmas(int numeroArmas) {
        this.numeroArmas = numeroArmas;
    }

    /** @param escudoAtivado Define o novo estado do escudo. */
    public void setEscudoAtivado(boolean escudoAtivado) {
        this.escudoAtivado = escudoAtivado;
    }

    /**
     * Calcula o consumo de combustível para missões de combate.
     * <p>O consumo base é de 0.8 unidades por ano-luz. Se o escudo estiver 
     * ativado, o consumo total da viagem sofre um acréscimo de 15% (multiplicador 1.15).</p>
     * 
     * @param distancia A distância em anos-luz a ser percorrida.
     * @return O total de combustível necessário para a viagem.
     */
    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.8;

        if (escudoAtivado) {
            consumo *= 1.15;
        }

        return consumo;
    }
}