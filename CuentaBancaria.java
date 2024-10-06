public class CuentaBancaria {
    String titular;
    int numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {
        System.out.printf("El cliente %s con número de cuenta %d tiene un saldo de: %f \n", titular, numeroCuenta,
                saldo);
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo = saldo + deposito;
            System.out.println("Depósito exitoso, Nuevo Saldo: " + saldo);
        } else {
            System.out.println("El deposito debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficiente, Retiro no permitido.");
        } else if (monto > 0) {
            saldo -= monto;
            System.out.println("Retiro exitoso, Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de:" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cliente1 = new CuentaBancaria("Deywi", 3065, 54.0);

        cliente1.mostrarInformacion();
        cliente1.depositar(70.20);
        cliente1.retirar(20);
        cliente1.consultarSaldo();
    }
}