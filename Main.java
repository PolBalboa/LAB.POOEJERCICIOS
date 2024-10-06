package LimiteSobreGiro;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear una cuenta corriente con un saldo inicial y un límite de sobregiro
            CuentaCorriente cuenta = new CuentaCorriente(1000, 500);

            // Intentar retirar una cantidad dentro del saldo y el límite de sobregiro
            cuenta.retirar(1200); // Esto debería ser exitoso
            cuenta.retirar(400); // Esto debería lanzar una excepción de sobregiro
        } catch (LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
