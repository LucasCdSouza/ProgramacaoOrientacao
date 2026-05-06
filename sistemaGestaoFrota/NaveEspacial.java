public abstract class NaveEspacial {

    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    /**
     * Construtor para inicializar uma nova nave espacial.
     * Ao ser criada, a nave começa com o tanque cheio (combustivelAtual = combustivelMaximo).
     * 
     * @param identificador Nome ou registro único da nave.
     * @param combustivelMaximo Capacidade total do tanque de combustível.
     * @param velocidadeBase Velocidade de cruzeiro padrão da nave.
     */
    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo;
        this.velocidadeBase = velocidadeBase;
    }

    // GETTERS

    /** @return O identificador da nave. */
    public String getIdentificador() {
        return identificador;
    }

    /** @return A capacidade máxima de combustível. */
    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    /** @return A quantidade de combustível disponível no momento. */
    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    /** @return A velocidade base da nave. */
    public double getVelocidadeBase() {
        return velocidadeBase;
    }

    // SETTERS

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }

    public void setVelocidadeBase(double velocidadeBase) {
        this.velocidadeBase = velocidadeBase;
    }

    /**
     * Define a quantidade atual de combustível após validação.
     * 
     * @param combustivelAtual Nova quantidade de combustível.
     * @throws CombustivelInvalidoException Se o valor for negativo ou exceder a capacidade máxima.
     */
    public void setCombustivelAtual(double combustivelAtual) {
        if (combustivelAtual < 0 || combustivelAtual > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustível inválido!");
        }
        this.combustivelAtual = combustivelAtual;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para definir
     * a lógica específica de gasto de combustível por distância.
     * 
     * @param distanciaEmAnosLuz A distância que a nave pretende percorrer.
     * @return O total de combustível necessário para a viagem.
     */
    public abstract double calcularConsumo(double distanciaEmAnosLuz);

    /**
     * Realiza uma viagem espacial se houver combustível suficiente.
     * O consumo é calculado dinamicamente com base no tipo da nave.
     * 
     * @param distancia A distância em anos-luz a ser percorrida.
     */
    public void viajar(double distancia) {
        double consumo = calcularConsumo(distancia);

        if (consumo > combustivelAtual) {
            System.out.println("A nave " + identificador + " não possui combustível suficiente!");
            return;
        }

        combustivelAtual -= consumo;

        System.out.println("A nave " + identificador + " viajou " + distancia +
                " anos-luz. Combustível restante: " + combustivelAtual);
    }
}