public class CuentaBancaria1 {
    // Atributos
    public String numeroCuenta; // Público
    protected String titular; // Protegido
    private double saldo; // Privado

    // Constructor para inicializar los atributos
    public CuentaBancaria1(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    // Método para retirar dinero (no permite saldo negativo)
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Retiro no permitido.");
        } else if (monto > 0) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a retirar debe ser mayor a 0.");
        }
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método main para probar la clase CuentaBancaria
    public static void main(String[] args) {
        // Crear una cuenta bancaria con saldo inicial
        CuentaBancaria1 cuenta1 = new CuentaBancaria1("123456789", "Carlos Sanchez", 1000.0);

        // Consultar el saldo inicial
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        // Realizar un depósito
        cuenta1.depositar(500.0);

        // Intentar retirar una cantidad mayor al saldo
        cuenta1.retirar(2000.0);

        // Realizar un retiro válido
        cuenta1.retirar(300.0);

        // Consultar el saldo final
        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}
