package Ejercicio3;

import java.util.Scanner;
public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);
        Cajero cajero = new Cajero("Carlos", "cajero", "111");
        Administrador admin = new Administrador("Ana", "admin", "222");
        Supervisor supervisor = new Supervisor("Luis", "Supervisor", "333");

        System.out.println("SISTEMA EMPRESARIAL");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");

        System.out.print("Seleccione un rol: ");
        int opcion = sc.nextInt();

        sc.nextLine();

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        switch (opcion) {
            case 1:
                if (cajero.iniciarSesion(usuario, clave)) {
                    System.out.println(
                            "Inicio de sesión exitoso."
                    );
                    cajero.gestionarDatos();
                } else {
                    System.out.println(
                            "Credenciales incorrectas."
                    );
                }
                break;
            case 2:
                if (admin.iniciarSesion(usuario, clave)) {
                    System.out.println(
                            "Inicio de sesión exitoso."
                    );
                    admin.generarReporte();
                    admin.gestionarDatos();
                } else {
                    System.out.println(
                            "Credenciales incorrectas."
                    );
                }
                break;
            case 3:
                if (supervisor.iniciarSesion(usuario, clave)) {
                    System.out.println(
                            "Inicio de sesión exitoso."
                    );
                    supervisor.generarReporte();
                } else {
                    System.out.println(
                            "Credenciales incorrectas."
                    );
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
