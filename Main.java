package Interfaz;

public class Main {
    public static void main(String[] args) {
        // Crear un coche y un avión
        Movible coche = new Coche();
        Movible avion = new Avion();

        // Mostrar cómo se mueven
        coche.moverse();
        avion.moverse();
    }
}