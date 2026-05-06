import java.util.ArrayList;

public class Main {

    /**
     * Ponto de entrada do Sistema de Folha de Pagamento Hospitalar.
     * <p>O método demonstra a aplicação prática de conceitos de POO como:
     * 1. Instanciação de objetos especializados (Médico, Enfermeiro, Administrativo).
     * 2. Tratamento de exceções em tempo de execução (RuntimeExceptions) para validação de dados.
     * 3. Polimorfismo através de uma lista genérica de funcionários.</p>
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {

        // Lista polimórfica que armazena qualquer tipo de funcionário do hospital
        ArrayList<FuncionarioHospital> lista = new ArrayList<>();

        // INSTÂNCIAS: Criação dos objetos com suas regras específicas de negócio
        Medico medico = new Medico("Lucas", "M001", 5000,
                "Cirurgião", 1000, 5);

        Enfermeiro enfermeiro = new Enfermeiro("Enio", "E001", 3000,
                "UTI", 0.40);
        enfermeiro.setHorasTrabalhadasMensais(180);

        Administrativo adm = new Administrativo("Fabiana", "A001", 2500,
                "RH", true);

        // Adição dos funcionários à lista genérica
        lista.add(medico);
        lista.add(enfermeiro);
        lista.add(adm);

        /**
         * TESTES DE ENCAPSULAMENTO E VALIDAÇÃO
         * Demonstra a robustez do sistema ao tentar inserir valores que violam as regras de negócio.
         */
        
        // Teste 1: Salário abaixo do mínimo legal (1412.0)
        try {
            adm.setSalarioBase(900);
        } catch (Exception e) {
            System.out.println("Erro Salário: " + e.getMessage());
        }

        // Teste 2: Percentual de insalubridade fora dos padrões sindicais (10%, 20%, 40%)
        try {
            enfermeiro.setPercentualInsalubridade(0.99);
        } catch (Exception e) {
            System.out.println("Erro Insalubridade: " + e.getMessage());
        }

        // Teste 3: Carga horária excedendo o limite humano (300 horas)
        try {
            medico.setHorasTrabalhadasMensais(400);
        } catch (Exception e) {
            System.out.println("Erro Carga Horária: " + e.getMessage());
        }

        /**
         * TESTE DE POLIMORFISMO
         * Percorre a lista chamando o método exibirResumoMensal().
         * Mesmo sendo tratado como FuncionarioHospital, cada objeto utiliza sua 
         * própria implementação de calcularSalarioFinal() durante a execução.
         */
        System.out.println("\n--- RELATÓRIO MENSAL DE PAGAMENTOS ---\n");
        for (FuncionarioHospital f : lista) {
            f.exibirResumoMensal();
        }
    }
}