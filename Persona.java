public class Persona {
    // Atributos privados para proteger los datos
    private String nombre;
    private int edad;
    private String correoElectronico;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor o igual a 0.");
        }
    }

    // Métodos getter y setter para el atributo correoElectronico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Correo electrónico no válido.");
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos Sánchez", 30, "carlos@mail.com");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Correo Electrónico: " + persona1.getCorreoElectronico());

        persona1.setEdad(35);
        System.out.println("Edad actualizada: " + persona1.getEdad());
    }
}
