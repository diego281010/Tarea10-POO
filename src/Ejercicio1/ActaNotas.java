package Ejercicio1;

public class ActaNotas implements Imprimible {
    private String materia;

    public ActaNotas(String materia) {
        this.materia = materia;
    }


    @Override
    public void imprimir() {
        System.out.println("Notas de la materia de: " + materia);
    }
}
