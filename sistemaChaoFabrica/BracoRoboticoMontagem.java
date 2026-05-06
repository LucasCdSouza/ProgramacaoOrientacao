public class BracoRoboticoMontagem extends MaquinaIndustrial {

    private double percentualCalibracao;

    /**
     * Construtor para o braço robótico.
     * Inicia a máquina com 100% de calibração por padrão.
     * 
     * @param numeroSerie Identificador único do equipamento.
     */
    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
        this.percentualCalibracao = 100.0;
    }

    /**
     * Restaura a precisão do robô para o nível máximo (100%).
     */
    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    /**
     * Realiza a montagem de um lote de peças.
     * <p>A cada peça produzida, a calibração do braço é reduzida em 0.5%. 
     * O processo exige que a máquina esteja ligada e com calibração acima de 20%.</p>
     * 
     * @param quantidade Número de peças a serem montadas.
     * @throws MaquinaDesligadaException Se tentar produzir com a máquina em estado 'false'.
     * @throws EquipamentoDescalibradoException Se o nível de calibração for inferior a 20%.
     * @throws Exception Para outros erros genéricos de processamento.
     */
    @Override
    public void produzirLote(int quantidade) throws Exception {

        if (!isLigada()) throw new MaquinaDesligadaException();

        if (percentualCalibracao < 20.0) {
            throw new EquipamentoDescalibradoException();
        }

        // Custo fixo de energia por operação de montagem
        double energia = 15.0;

        // Desgaste progressivo baseado na quantidade produzida
        percentualCalibracao -= quantidade * 0.5;

        // Garante que o percentual não fique negativo
        if (percentualCalibracao < 0) percentualCalibracao = 0;

        registrarProducao(quantidade, energia);

        System.out.println("Robô produziu " + quantidade + " peças.");
    }
}