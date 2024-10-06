package Interfaz;

// Clase Coche que implementa la interfaz Movible
public class Coche implements Movible {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve por la carretera.");
    }
}