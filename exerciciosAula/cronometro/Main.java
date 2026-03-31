public class Main {
    public static void main(String[] args) {

        Cronometro c = new Cronometro();

        c.passarTempo();
        c.passarTempo();
        c.passarTempo();

        System.out.println("Segundos: " + c.getSegundos());
    }
}