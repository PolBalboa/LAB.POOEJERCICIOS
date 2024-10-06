package Vehiculo;

public class Vehiculo {
    protected String marca;
    protected int anioFabricacion;

    // Constructor
    public Vehiculo(String marca, int anioFabricacion) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Año de fabricación: " + anioFabricacion);
    }
}
