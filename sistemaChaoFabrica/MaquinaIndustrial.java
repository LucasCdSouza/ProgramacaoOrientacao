public abstract class MaquinaIndustrial {

    private final String numeroSerie;
    private boolean ligada;
    private int pecasProduzidasTotais;
    private double energiaConsumidaKWh;

    /**
     * Construtor para inicializar uma máquina industrial.
     * Por padrão, toda máquina inicia em estado desligado e com contadores zerados.
     * 
     * @param numeroSerie Identificador alfanumérico único do equipamento.
     */
    public MaquinaIndustrial(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.ligada = false;
        this.pecasProduzidasTotais = 0;
        this.energiaConsumidaKWh = 0;
    }

    // GETTERS

    /** @return O número de série da máquina. */
    public String getNumeroSerie() { return numeroSerie; }

    /** @return true se a máquina estiver ligada, false caso contrário. */
    public boolean isLigada() { return ligada; }

    /** @return O acumulado de peças produzidas desde a inicialização. */
    public int getPecasProduzidasTotais() { return pecasProduzidasTotais; }

    /** @return O total de energia consumida em quilowatts-hora (KWh). */
    public double getEnergiaConsumidaKWh() { return energiaConsumidaKWh; }

    /**
     * Ativa o funcionamento da máquina.
     * 
     * @throws IllegalStateException Se a máquina já estiver no estado ligada.
     */
    public void ligar() {
        if (ligada) throw new IllegalStateException("Máquina já está ligada.");
        ligada = true;
    }

    /**
     * Desativa o funcionamento da máquina.
     * 
     * @throws IllegalStateException Se a máquina já estiver no estado desligada.
     */
    public void desligar() {
        if (!ligada) throw new IllegalStateException("Máquina já está desligada.");
        ligada = false;
    }

    /**
     * Atualiza os contadores internos de produção e energia.
     * Este método é restrito às subclasses (acesso protegido).
     * 
     * @param pecas Quantidade de peças produzidas no lote atual.
     * @param energia Quantidade de energia gasta na operação.
     */
    protected void registrarProducao(int pecas, double energia) {
        this.pecasProduzidasTotais += pecas;
        this.energiaConsumidaKWh += energia;
    }

    /**
     * Método abstrato que define a execução da produção.
     * Cada tipo de máquina deve implementar sua própria lógica de consumo e limites.
     * 
     * @param quantidade Número de peças solicitadas para o lote.
     * @throws Exception Caso ocorra alguma falha específica da máquina ou estado inválido.
     */
    public abstract void produzirLote(int quantidade) throws Exception;
}