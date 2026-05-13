package Ejercicio2;

public class PagoTarjeta implements Pagable{

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con tarjeta: " + monto);
        } else {
            System.out.println("Monto inválido");
        }
    }
}
