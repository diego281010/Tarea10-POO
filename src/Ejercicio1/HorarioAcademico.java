package Ejercicio1;

public class HorarioAcademico implements Imprimible{
    private String horario;

    public HorarioAcademico(String horario) {
        this.horario = horario;
    }


    @Override
    public void imprimir() {
        System.out.println("El horario academico es: " + horario);
    }
}
