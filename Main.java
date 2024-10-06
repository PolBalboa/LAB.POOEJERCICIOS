package Vehiculo;

// Método main para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear un coche
        Coche coche = new Coche("Toyota", 2020, 2.0, 4);
        coche.mostrarInformacion();

        System.out.println();

        // Crear una motocicleta
        Motocicleta moto = new Motocicleta("Harley-Davidson", 2019, 1.2, true);
        moto.mostrarInformacion();
    }
}
