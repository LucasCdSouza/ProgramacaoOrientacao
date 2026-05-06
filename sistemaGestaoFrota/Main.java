import java.util.ArrayList;

public class Main {

    /**
     * Ponto de entrada do sistema de Gestão de Frota.
     * <p>O método realiza a instanciação de diferentes tipos de naves, demonstra
     * o uso de encapsulamento com tratamento de exceções e executa o polimorfismo
     * através de uma lista genérica de naves espaciais.</p>
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {

        // Armazena diferentes tipos de naves em uma lista polimórfica
        ArrayList<NaveEspacial> lista = new ArrayList<>();

        // Instanciação dos objetos com configurações específicas
        NaveCargueiro cargueiro = new NaveCargueiro("CARG-01", 5000, 300, 1000);
        cargueiro.setPesoCargaAtual(500);

        NaveCombate combate = new NaveCombate("COMB-01", 4000, 800, 10, true);

        NaveExploracao exploracao = new NaveExploracao("EXP-01", 3000, 600, true);

        // Adicionando as subclasses na lista da superclasse
        lista.add(cargueiro);
        lista.add(combate);
        lista.add(exploracao);

        /**
         * TESTE DE ENCAPSULAMENTO E VALIDAÇÃO
         * Tenta atribuir um valor de combustível superior ao limite máximo da nave.
         */
        try {
            cargueiro.setCombustivelAtual(6000); // maior que o máximo (5000)
        } catch (Exception e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        /**
         * TESTE DE POLIMORFISMO
         * Percorre a lista e executa o método viajar(distancia).
         * Cada objeto executa sua própria regra de consumo definida no @Override de calcularConsumo.
         */
        for (NaveEspacial nave : lista) {
            try {
                System.out.println("Tipo: " + nave.getClass().getSimpleName() +
                        " | ID: " + nave.getIdentificador());

                // Simula uma viagem de 1000 anos-luz
                nave.viajar(1000);

            } catch (Exception e) {
                System.out.println("Erro durante o voo: " + e.getMessage());
            }
        }
    }
}