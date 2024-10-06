package ClaseAbstracta;

// Clase concreta Cuadrado
class Cuadrado extends Forma {
    private double lado;

    // Constructor para inicializar el lado del cuadrado
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método calcularArea() para un cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
