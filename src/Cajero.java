public class Cajero extends Empleado implements Autenticable, Gestionable{

    public Cajero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return getUsuario().equals(usuario) && getClave().equals(clave);
    }

    @Override
    public void gestionarDatos() {
        System.out.println(getNombre() + " está gestionando pagos y clientes.");
    }

}
