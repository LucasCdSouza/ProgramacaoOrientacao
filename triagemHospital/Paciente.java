public class Paciente {

    private String nome;
    private double peso;
    /**
     * Construtor da classe Paciente. Lança NullPointerException se o nome for vazio ou nulo.
     * @param nome - Nome do paciente, não pode ser vazio ou nulo.
     * @param peso - Peso do paciente, deve ser um valor numérico válido.
     */
    public Paciente(String nome, double peso) {
        if (nome == null || nome.isEmpty()) {
            throw new NullPointerException("Nome nao pode ser vazio.");
        }
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Retorna uma representação em string do paciente.
     * @return String contendo o nome e o peso do paciente.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + "\nPeso: " + peso + " kg";
    }
}