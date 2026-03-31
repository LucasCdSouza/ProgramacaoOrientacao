public class Estudante {

    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota > 0 && nota < 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida.");
        }
    }
}