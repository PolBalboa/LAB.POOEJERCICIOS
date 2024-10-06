package ClaseDerivada2;

// Clase derivada Coche
class Coche extends Vehiculo {
    private int numeroPuertas;

    // Constructor que inicializa la marca y el número de puertas
    public Coche(String marca, int numeroPuertas) {
        super(marca); // Llamada al constructor de la clase base
        this.numeroPuertas = numeroPuertas;
    }

    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

