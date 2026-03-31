public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public void setLados(double l1, double l2, double l3) {

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            this.lado1 = l1;
            this.lado2 = l2;
            this.lado3 = l3;
        } else {
            System.out.println("Valores não formam um triângulo.");
        }
    }
}