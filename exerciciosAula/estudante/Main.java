public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.setNota(8.5);
        System.out.println("Nota: " + estudante.getNota());

        estudante.setNota(12); // inválida
        System.out.println("Nota após tentativa inválida: " + estudante.getNota());
    }
}