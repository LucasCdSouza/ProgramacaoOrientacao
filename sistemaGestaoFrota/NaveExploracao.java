public class NaveExploracao extends NaveEspacial {

    private boolean possuiSensoresAvancados;

    /**
     * Construtor para criar uma nave de exploração.
     * 
     * @param id Identificador único da nave.
     * @param combustivelMax Capacidade total do tanque.
     * @param velocidade Velocidade base de deslocamento.
     * @param sensores Define se a nave está equipada com sensores de última geração.
     */
    public NaveExploracao(String id, double combustivelMax, double velocidade,
                          boolean sensores) {
        super(id, combustivelMax, velocidade);
        this.possuiSensoresAvancados = sensores;
    }

    /**
     * Verifica a presença de sensores avançados.
     * @return true se a nave possuir sensores avançados, false caso contrário.
     */
    public boolean isPossuiSensoresAvancados() {
        return possuiSensoresAvancados;
    }

    /**
     * Ativa ou desativa os sensores avançados da nave.
     * @param possuiSensoresAvancados Estado dos sensores.
     */
    public void setPossuiSensoresAvancados(boolean possuiSensoresAvancados) {
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    /**
     * Calcula o consumo de combustível específico para naves de exploração.
     * <p>O cálculo baseia-se em 0.3 unidades por ano-luz, com um adicional fixo 
     * de 50.0 unidades caso os sensores avançados estejam ativos.</p>
     * 
     * @param distancia A distância em anos-luz a ser percorrida.
     * @return O total de combustível que será consumido.
     */
    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.3;

        if (possuiSensoresAvancados) {
            consumo += 50.0;
        }

        return consumo;
    }
}