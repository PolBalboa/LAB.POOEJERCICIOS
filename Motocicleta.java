package Vehiculo;

class Motocicleta extends VehiculoMotorizado {
    private boolean tieneSidecar;

    // Constructor
    public Motocicleta(String marca, int anioFabricacion, double capacidadMotor, boolean tieneSidecar) {
        super(marca, anioFabricacion, capacidadMotor);
        this.tieneSidecar = tieneSidecar;
    }

    // Método para mostrar información de la motocicleta
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
