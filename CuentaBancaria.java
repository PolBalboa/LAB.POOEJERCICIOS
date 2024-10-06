package LimiteSobreGiro;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Declarar que este método puede lanzar excepciones
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}

