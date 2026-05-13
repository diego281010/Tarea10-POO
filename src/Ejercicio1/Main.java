package Ejercicio1;

public class Main {
    void main() {
        Certificado c = new Certificado("Diego");
        ActaNotas a = new ActaNotas("POO");
        HorarioAcademico h = new HorarioAcademico("2026-A");

        c.imprimir();
        a.imprimir();
        h.imprimir();
    }
}