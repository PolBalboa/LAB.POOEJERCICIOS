public class Circulo {
    // Atributo final (no puede ser modificado después de ser inicializado)
    private final double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Getter para obtener el valor del radio
    public double getRadio() {
        return radio;
    }

    // Método main para probar la clase Circulo
    public static void main(String[] args) {
        // Crear un objeto de la clase Circulo con un radio de 5.0
        Circulo circulo1 = new Circulo(5.0);

        // Mostrar el radio
        System.out.println("Radio: " + circulo1.getRadio());

        // Calcular y mostrar el área del círculo
        System.out.println("Área del círculo: " + circulo1.calcularArea());

        // Crear otro objeto de la clase Circulo con un radio de 10.0
        Circulo circulo2 = new Circulo(10.0);

        // Mostrar el radio y el área del nuevo círculo
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área del círculo: " + circulo2.calcularArea());
    }
}
