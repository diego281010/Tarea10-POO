package Ejercicio2;

public class Transferencia implements Pagable{
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con transferencia: " + monto);
        } else {
            System.out.println("Monto inválido");
        }
    }
}
