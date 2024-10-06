package ClaseAbstracta;

// Método main para comprobar
public class Main {
    public static void main(String[] args) {
        // Crear un triángulo y un cuadrado
        Forma triangulo = new Triangulo(5, 3);
        Forma cuadrado = new Cuadrado(4);

        // Calcular y mostrar el área de cada forma
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}

