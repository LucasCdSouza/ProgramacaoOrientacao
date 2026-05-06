public class Administrativo extends FuncionarioHospital {

    private String departamento;
    private boolean cargoDeGestao;

    /**
     * Construtor para funcionários da área administrativa.
     * 
     * @param nome Nome completo do funcionário.
     * @param matricula Registro funcional (matrícula).
     * @param salarioBase Valor base da remuneração.
     * @param departamento Setor onde o funcionário atua.
     * @param cargoDeGestao Define se o funcionário possui gratificação por chefia.
     */
    public Administrativo(String nome, String matricula, double salarioBase,
                          String departamento, boolean cargoDeGestao) {
        super(nome, matricula, salarioBase);
        this.departamento = departamento;
        this.cargoDeGestao = cargoDeGestao;
    }

    // GETTERS
    
    /** @return O departamento de atuação. */
    public String getDepartamento() { return departamento; }
    
    /** @return true se for gestor, false caso contrário. */
    public boolean isCargoDeGestao() { return cargoDeGestao; }

    // SETTERS
    
    /** @param departamento Define o novo departamento. */
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    /** @param cargoDeGestao Define o novo status de gestão. */
    public void setCargoDeGestao(boolean cargoDeGestao) { this.cargoDeGestao = cargoDeGestao; }

    /**
     * Calcula o salário final para o setor administrativo.
     * <p>O cálculo consiste no salário base somado a uma gratificação fixa 
     * de 1500.0, caso o atributo cargoDeGestao seja verdadeiro.</p>
     * 
     * @return O valor total da folha de pagamento do funcionário.
     */
    @Override
    public double calcularSalarioFinal() {
        double salario = getSalarioBase();

        if (cargoDeGestao) {
            salario += 1500.0;
        }

        return salario;
    }
}