public class Main {
    public static void main(String[] args) {

        Termometro t = new Termometro();

        t.setFahrenheit(86);

        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}