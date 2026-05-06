public class Enfermeiro extends FuncionarioHospital {

    private String setor;
    private double percentualInsalubridade;

    /**
     * Construtor para profissionais de enfermagem.
     * 
     * @param nome Nome completo do enfermeiro.
     * @param matricula Registro funcional único.
     * @param salarioBase Remuneração base (mínimo de 1412.0).
     * @param setor Área de atuação no hospital (ex: UTI, Pediatria).
     * @param percentualInsalubridade Grau de risco (deve ser 0.10, 0.20 ou 0.40).
     */
    public Enfermeiro(String nome, String matricula, double salarioBase,
                      String setor, double percentualInsalubridade) {
        super(nome, matricula, salarioBase);
        this.setor = setor;
        this.setPercentualInsalubridade(percentualInsalubridade); // Valida o percentual via setter
    }

    // GETTERS
    
    /** @return O setor de atuação do enfermeiro. */
    public String getSetor() { return setor; }
    
    /** @return O percentual de insalubridade aplicado. */
    public double getPercentualInsalubridade() { return percentualInsalubridade; }

    // SETTERS
    
    /** @param setor Define o novo setor de atuação. */
    public void setSetor(String setor) { this.setor = setor; }

    /**
     * Define o percentual de insalubridade com base em normas sindicais/legais.
     * 
     * @param percentual Valor decimal representando 10%, 20% ou 40%.
     * @throws ValorInvalidoException Se o percentual não for um dos três valores permitidos.
     */
    public void setPercentualInsalubridade(double percentual) {
        if (percentual != 0.10 && percentual != 0.20 && percentual != 0.40) {
            throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
        }
        this.percentualInsalubridade = percentual;
    }

    /**
     * Calcula o salário final do enfermeiro incluindo adicionais.
     * <p>O cálculo soma:
     * 1. Salário Base.
     * 2. Adicional de Insalubridade (Salário Base * Percentual).
     * 3. Horas Extras (R$ 50.0 por hora para cada hora que exceder as 160h mensais).</p>
     * 
     * @return O valor total bruto da folha de pagamento.
     */
    @Override
    public double calcularSalarioFinal() {
        double bonus = getSalarioBase() * percentualInsalubridade;

        int horas = getHorasTrabalhadasMensais();
        double extra = 0;

        if (horas > 160) {
            extra = (horas - 160) * 50.0;
        }

        return getSalarioBase() + bonus + extra;
    }
}