/**
 * Classe que representa um voo comercial.
 */
public class Voo {

    private String numeroDoVoo;
    private String destino;
    private boolean[] assentos;

    /**
     * Construtor da classe.
     *
     * @param numeroDoVoo Número do voo.
     * @param destino Destino do voo.
     */
    public Voo(String numeroDoVoo, String destino) {

        this.numeroDoVoo = numeroDoVoo;
        this.destino = destino;

        assentos = new boolean[100];

        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = false;
        }
    }

    /**
     * Retorna o número do voo.
     *
     * @return Número do voo.
     */
    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    /**
     * Retorna o destino do voo.
     *
     * @return Destino do voo.
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Realiza a reserva de um assento.
     *
     * @param numeroAssento Número do assento.
     * @throws AssentoOcupadoException Caso o assento já esteja ocupado.
     */
    public void reservarAssento(int numeroAssento) throws AssentoOcupadoException {

        if (numeroAssento < 1 || numeroAssento > 100) {
            throw new IllegalArgumentException("Número de assento inválido.");
        }

        if (assentos[numeroAssento - 1]) {
            throw new AssentoOcupadoException("Assento já está ocupado.");
        }

        assentos[numeroAssento - 1] = true;

        System.out.println("Assento " + numeroAssento + " reservado com sucesso.");
    }
    
/**
 * Mostra todos os assentos do voo.
 */
public void mostrarAssentos() {

    System.out.println("\n===== MAPA DE ASSENTOS =====");

    for (int i = 0; i < assentos.length; i++) {

        if (assentos[i]) {

            System.out.println("Assento " + (i + 1) + " -> OCUPADO");

        } else {

            System.out.println("Assento " + (i + 1) + " -> LIVRE");
        }
    }
}
}