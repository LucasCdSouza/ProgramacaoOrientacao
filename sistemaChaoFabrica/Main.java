import java.util.ArrayList;

public class Main {

    /**
     * Ponto de entrada do simulador de Chão de Fábrica.
     * <p>O programa executa três fases de simulação:
     * 1. Tentativa de produção com máquinas em estado 'desligado'.
     * 2. Ativação de todos os equipamentos da linha de produção.
     * 3. Loop de produção intensiva para testar os limites de matéria-prima, 
     *    calibração e temperatura (disparo de exceções específicas).</p>
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {

        // Lista polimórfica para gerenciar diferentes tipos de maquinário industrial
        ArrayList<MaquinaIndustrial> lista = new ArrayList<>();

        // Inicialização dos equipamentos com seus respectivos números de série
        InjetoraPlastico injetora = new InjetoraPlastico("INJ-01");
        BracoRoboticoMontagem robo = new BracoRoboticoMontagem("ROB-01");
        PrensaHidraulica prensa = new PrensaHidraulica("PRE-01");

        lista.add(injetora);
        lista.add(robo);
        lista.add(prensa);

        // Abastecimento inicial necessário para o funcionamento da injetora
        injetora.abastecerPlastico(10);

        /**
         * FASE 1: Teste de Segurança
         * Tenta produzir com máquinas desligadas para validar a MaquinaDesligadaException.
         */
        for (MaquinaIndustrial m : lista) {
            try {
                m.produzirLote(60);
            } catch (MaquinaDesligadaException e) {
                System.out.println("Máquina desligada!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // FASE 2: Startup da Linha de Produção
        for (MaquinaIndustrial m : lista) {
            m.ligar();
        }

        /**
         * FASE 3: Simulação de Stress e Operação
         * Loop que força a produção até que ocorram falhas previstas (exceções).
         */
        for (int i = 0; i < 3; i++) {
            for (MaquinaIndustrial m : lista) {
                try {
                    m.produzirLote(40);
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: Falta matéria prima!");
                } catch (EquipamentoDescalibradoException e) {
                    System.out.println("ALARME ROBÔ: Equipamento descalibrado!");
                } catch (SuperaquecimentoException e) {
                    System.out.println("ALARME PRENSA: Superaquecimento!");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }

        /**
         * RELATÓRIO FINAL
         * Exibe os contadores de produção e consumo de energia acumulados por cada máquina.
         */
        for (MaquinaIndustrial m : lista) {
            System.out.println("\nMáquina: " + m.getNumeroSerie());
            System.out.println("Peças produzidas: " + m.getPecasProduzidasTotais());
            System.out.println("Energia consumida: " + m.getEnergiaConsumidaKWh());
        }
    }
}