package ClaseDerivada;

// Método main para comprobar
public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Juan");

        // Llamar al método saludar sin parámetros
        estudiante.saludar();

        // Llamar al método saludar con el nombre de otra persona
        estudiante.saludar("Carlos");
    }
}