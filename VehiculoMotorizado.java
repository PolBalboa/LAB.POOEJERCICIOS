package Vehiculo;

class VehiculoMotorizado extends Vehiculo {
    protected double capacidadMotor;

    // Constructor
    public VehiculoMotorizado(String marca, int anioFabricacion, double capacidadMotor) {
        super(marca, anioFabricacion);
        this.capacidadMotor = capacidadMotor;
    }

    // Método para mostrar información del vehículo motorizado
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad del motor: " + capacidadMotor + " litros");
    }
}
