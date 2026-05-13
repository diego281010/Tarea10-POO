public class Supervisor extends Empleado implements Autenticable, Reportable{

    public Supervisor(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return this.getUsuario().equals(usuario) && this.getClave().equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("El supervisor " + getNombre() + " generó un reporte de supervisión.");
    }
}
