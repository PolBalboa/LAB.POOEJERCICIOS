package Empleado;

public class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor para inicializar el nombre y salario
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para calcular el bono del 10% del salario
    public double calcularBono() {
        return salario * 0.10;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Bono: " + calcularBono());
    }
}

