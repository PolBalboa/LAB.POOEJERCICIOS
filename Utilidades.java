public class Utilidades {
    // Método estático para convertir Celsius a Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método main para probar el método convertirCelsiusAFahrenheit
    public static void main(String[] args) {
        // Convertir 25 grados Celsius a Fahrenheit
        double celsius = 25.0;
        double fahrenheit = Utilidades.convertirCelsiusAFahrenheit(celsius);

        // Mostrar la conversión
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}

