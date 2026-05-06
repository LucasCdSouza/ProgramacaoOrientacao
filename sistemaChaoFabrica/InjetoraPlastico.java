public class InjetoraPlastico extends MaquinaIndustrial {

    private double kgMateriaPrima;

    /**
     * Construtor para a máquina injetora de plástico.
     * 
     * @param numeroSerie Identificador único de série do equipamento.
     */
    public InjetoraPlastico(String numeroSerie) {
        super(numeroSerie);
    }

    /**
     * Adiciona matéria-prima ao reservatório da máquina.
     * 
     * @param kg Quantidade de plástico em quilogramas a ser adicionada.
     * @throws IllegalArgumentException Se o valor informado for negativo.
     */
    public void abastecerPlastico(double kg) {
        if (kg < 0) throw new IllegalArgumentException("Valor inválido.");
        kgMateriaPrima += kg;
    }

    /**
     * Executa a produção de um lote de peças plásticas.
     * <p>Cada peça consome 0.2 kg de matéria-prima e 0.5 unidades de energia.
     * O processo exige que a máquina esteja ligada e que haja plástico suficiente no reservatório.</p>
     * 
     * @param quantidade O número de peças a serem injetadas.
     * @throws MaquinaDesligadaException Se o equipamento estiver desligado.
     * @throws FaltaMateriaPrimaException Se o estoque de plástico for insuficiente para o lote.
     * @throws Exception Para outras falhas genéricas de hardware.
     */
    @Override
    public void produzirLote(int quantidade) throws Exception {

        if (!isLigada()) throw new MaquinaDesligadaException();

        // Cálculo da necessidade de material (0.2kg por peça)
        double necessario = quantidade * 0.2;

        if (kgMateriaPrima < necessario) {
            throw new FaltaMateriaPrimaException();
        }

        kgMateriaPrima -= necessario;

        // Cálculo do consumo energético (0.5 por peça)
        double energia = quantidade * 0.5;

        registrarProducao(quantidade, energia);

        System.out.println("Injetora produziu " + quantidade + " peças.");
    }
}