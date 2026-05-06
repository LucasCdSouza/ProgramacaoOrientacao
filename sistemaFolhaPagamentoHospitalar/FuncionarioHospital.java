public abstract class FuncionarioHospital {

    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    /**
     * Construtor para inicializar os dados básicos de um funcionário do hospital.
     * Ao ser criado, a carga horária mensal é iniciada em 0.
     * 
     * @param nome Nome completo do funcionário.
     * @param matricula Registro identificador único.
     * @param salarioBase Valor inicial da remuneração (passa por validação).
     */
    public FuncionarioHospital(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.setSalarioBase(salarioBase); 
        this.horasTrabalhadasMensais = 0;
    }

    // GETTERS
    
    /** @return O nome do funcionário. */
    public String getNome() { return nome; }
    
    /** @return A matrícula funcional. */
    public String getMatricula() { return matricula; }
    
    /** @return O valor do salário base. */
    public double getSalarioBase() { return salarioBase; }
    
    /** @return O total de horas trabalhadas no mês. */
    public int getHorasTrabalhadasMensais() { return horasTrabalhadasMensais; }

    // SETTERS
    
    public void setNome(String nome) { this.nome = nome; }
    
    public void setMatricula(String matricula) { this.matricula = matricula; }

    /**
     * Define o salário base garantindo que respeite o mínimo legal.
     * 
     * @param salarioBase Novo valor para o salário.
     * @throws ValorInvalidoException Se o valor for menor que 1412.0.
     */
    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412.0) {
            throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.");
        }
        this.salarioBase = salarioBase;
    }

    /**
     * Atualiza as horas trabalhadas com validação de segurança.
     * 
     * @param horas Quantidade de horas no mês.
     * @throws ValorInvalidoException Se as horas forem negativas ou excederem 300.
     */
    public void setHorasTrabalhadasMensais(int horas) {
        if (horas < 0 || horas > 300) {
            throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.");
        }
        this.horasTrabalhadasMensais = horas;
    }

    /**
     * Método abstrato para cálculo da folha de pagamento, a ser 
     * implementado conforme as regras de cada cargo.
     * 
     * @return O valor total a ser pago ao funcionário.
     */
    public abstract double calcularSalarioFinal();

    /**
     * Imprime no console um relatório detalhado com os dados do 
     * funcionário e o resultado do cálculo salarial.
     */
    public void exibirResumoMensal() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas: " + horasTrabalhadasMensais);
        System.out.println("Salário final: " + calcularSalarioFinal());
        System.out.println("-------------------------");
    }
}