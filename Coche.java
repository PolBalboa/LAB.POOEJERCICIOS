package Vehiculo;

class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    // Constructor
    public Coche(String marca, int anioFabricacion, double capacidadMotor, int numeroPuertas) {
        super(marca, anioFabricacion, capacidadMotor);
        this.numeroPuertas = numeroPuertas;
    }

    // Método para mostrar información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
