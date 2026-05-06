public class PrensaHidraulica extends MaquinaIndustrial {

    private double temperaturaAtual;

    /**
     * Construtor para a prensa hidráulica.
     * Inicia o equipamento em temperatura ambiente (25.0°C).
     * 
     * @param numeroSerie Identificador único de série do equipamento.
     */
    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
        this.temperaturaAtual = 25.0;
    }

    /**
     * Ativa o sistema de resfriamento da prensa, retornando a 
     * temperatura ao nível operacional estável (25.0°C).
     */
    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    /**
     * Executa o processo de prensagem de um lote de peças.
     * <p>A cada peça produzida, a temperatura sobe 1.5°C e são consumidas 
     * 2.0 unidades de energia. Se a temperatura atingir ou ultrapassar 90.0°C, 
     * a produção é interrompida por segurança.</p>
     * 
     * @param quantidade O número de peças a serem prensadas.
     * @throws MaquinaDesligadaException Se o equipamento não estiver ligado.
     * @throws SuperaquecimentoException Se a temperatura atual for igual ou superior a 90.0°C.
     * @throws Exception Para falhas mecânicas imprevistas.
     */
    @Override
    public void produzirLote(int quantidade) throws Exception {

        if (!isLigada()) throw new MaquinaDesligadaException();

        if (temperaturaAtual >= 90.0) {
            throw new SuperaquecimentoException();
        }

        // Consumo energético elevado devido à pressão hidráulica
        double energia = quantidade * 2.0;

        // Incremento térmico baseado no esforço de produção
        temperaturaAtual += quantidade * 1.5;

        registrarProducao(quantidade, energia);

        System.out.println("Prensa produziu " + quantidade + " peças.");
    }
}