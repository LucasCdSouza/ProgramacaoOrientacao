public class Medico extends FuncionarioHospital {

    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    /**
     * Construtor para profissionais médicos.
     * 
     * @param nome Nome completo do médico.
     * @param matricula Registro funcional único.
     * @param salarioBase Remuneração base (mínimo de 1412.0).
     * @param especialidade Área de atuação médica (ex: Cardiologia, Pediatria).
     * @param valorPorPlantao Valor pago por cada plantão realizado.
     * @param quantidadePlantoes Total de plantões realizados no mês.
     */
    public Medico(String nome, String matricula, double salarioBase,
                  String especialidade, double valorPorPlantao, int quantidadePlantoes) {
        super(nome, matricula, salarioBase);
        this.especialidade = especialidade;
        this.valorPorPlantao = valorPorPlantao;
        this.setQuantidadePlantoes(quantidadePlantoes); // Valida a quantidade via setter
    }

    // GETTERS
    
    /** @return A especialidade do médico. */
    public String getEspecialidade() { return especialidade; }
    
    /** @return O valor individual de cada plantão. */
    public double getValorPorPlantao() { return valorPorPlantao; }
    
    /** @return O total de plantões cumpridos no mês. */
    public int getQuantidadePlantoes() { return quantidadePlantoes; }

    // SETTERS
    
    /** @param especialidade Define a nova especialidade. */
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    
    /** @param valorPorPlantao Atualiza o valor pago por plantão. */
    public void setValorPorPlantao(double valorPorPlantao) { this.valorPorPlantao = valorPorPlantao; }

    /**
     * Define a quantidade de plantões realizados com validação.
     * 
     * @param quantidadePlantoes Número de plantões (não pode ser negativo).
     * @throws ValorInvalidoException Se a quantidade for menor que zero.
     */
    public void setQuantidadePlantoes(int quantidadePlantoes) {
        if (quantidadePlantoes < 0) {
            throw new ValorInvalidoException("Quantidade de plantões inválida.");
        }
        this.quantidadePlantoes = quantidadePlantoes;
    }

    /**
     * Calcula o salário final do médico.
     * <p>O cálculo soma o salário base ao produto do valor por plantão 
     * pela quantidade de plantões realizados no período.</p>
     * 
     * @return O valor total bruto da folha de pagamento.
     */
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
    }
}