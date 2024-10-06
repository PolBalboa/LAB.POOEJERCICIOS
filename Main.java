package Empleado;

// Método main para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear un empleado
        Empleado empleado = new Empleado("Pol Pérez", 3000.0);
        empleado.mostrarInformacion();

        // Crear un gerente
        Gerente gerente = new Gerente("Anita Tenorio", 5000.0);
        gerente.mostrarInformacion();
    }
}
