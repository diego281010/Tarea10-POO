package Ejercicio2;

public class PagoEfectivo implements Pagable{
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con efectivo: " + monto);
        } else {
            System.out.println("Monto inválido");
        }
    }
}
