package Ejercicio1;

public class Certificado implements Imprimible{
    private String estudiante;

    public Certificado(String estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo certificado de: " + estudiante);
    }
}
