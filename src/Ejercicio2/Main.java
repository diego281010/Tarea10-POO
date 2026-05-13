package Ejercicio2;

public class Main {
    void main() {

        PagoEfectivo pe = new PagoEfectivo();
        PagoTarjeta pt = new PagoTarjeta();
        Transferencia t = new Transferencia();

        pe.procesarPago(100);
        pt.procesarPago(250);
        t.procesarPago(-5);
    }
}