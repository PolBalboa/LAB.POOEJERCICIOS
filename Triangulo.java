package ClaseAbstracta;

// Clase concreta Triangulo
class Triangulo extends Forma {
    private double base;
    private double altura;

    // Constructor para inicializar la base y la altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea() para un triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
