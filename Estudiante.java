package ClaseDerivada;

// Clase derivada Estudiante
class Estudiante extends Persona {
    private String nombre;

    // Constructor para inicializar el nombre del estudiante
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribir el método saludar() para incluir el nombre
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", un estudiante.");
    }

    // Sobrecargar el método saludar() para saludar a otra persona
    public void saludar(String otraPersona) {
        System.out.println("Hola " + otraPersona + ", soy " + nombre + ".");
    }
}
