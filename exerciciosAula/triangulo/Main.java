public class Main {
    public static void main(String[] args) {

        Triangulo tri = new Triangulo();

        tri.setLados(3, 4, 5); // válido
        tri.setLados(1, 2, 10); // inválido
    }
}