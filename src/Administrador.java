public class Administrador extends Empleado implements Autenticable, Reportable, Gestionable{

    public Administrador(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return this.getUsuario().equals(usuario) && this.getClave().equals(clave);
    }

    @Override
    public void generarReporte() {
        System.out.println("El administrador " + getNombre() + " está generando un reporte.");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El administrador " + getNombre() + " está gestionando toda la información.");

    }
}
