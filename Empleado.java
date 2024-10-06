public class Empleado {
    // Atributos de la clase
    String nombre;
    private double salario; // Salario es privado, solo accesible dentro de la clase
    String departamento;

    // Constructor para inicializar los atributos
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el departamento del empleado
    public String getDepartamento() {
        return departamento;
    }

    // Método para obtener el salario del empleado (getter)
    public double getSalario() {
        return salario;
    }

    // Método para cambiar el salario del empleado (setter)
    public void setSalario(double nuevoSalario) {
        if (nuevoSalario > 0) {
            this.salario = nuevoSalario;
            System.out.println("Nuevo salario asignado: " + nuevoSalario);
        } else {
            System.out.println("El salario debe ser mayor a 0.");
        }
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }

    // Main para probar la clase Empleado
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 2500.0, "Recursos Humanos");

        // Mostrar la información del empleado
        empleado1.mostrarInformacion();

        // Intentar modificar el salario a través del método setter
        empleado1.setSalario(3000.0); // Salario modificado correctamente

        // Intentar establecer un salario no válido
        empleado1.setSalario(-500.0); // No se modifica por ser un valor no válido

        // Mostrar la información actualizada del empleado
        empleado1.mostrarInformacion();
    }
}