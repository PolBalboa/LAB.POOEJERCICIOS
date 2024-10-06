public class Calculadora {

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    public static void main(String[] args) {

        Calculadora operacion = new Calculadora();
        double suma = operacion.sumar(-10, -25);
        double resta = operacion.restar(-85, 24);
        double multiplicacion = operacion.multiplicar(25, 3);
        double division = operacion.dividir(9, 63);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}
