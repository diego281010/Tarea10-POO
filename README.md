# Sistema de Roles Empresariales - Interfaces en Java

## Descripción

Proyecto realizado en Java utilizando interfaces, clases abstractas y programación orientada a objetos.

El sistema simula los diferentes roles de una empresa:
- Cajero
- Administrador
- Supervisor

Cada rol tiene diferentes permisos y acciones dentro del sistema.

---

## Objetivo

Practicar:
- Interfaces
- Herencia
- Clases abstractas
- Polimorfismo
- Encapsulamiento
- Validaciones simples

---

## Interfaces usadas

### Autenticable
Permite iniciar sesión con usuario y contraseña.

### Reportable
Permite generar reportes.

### Gestionable
Permite gestionar información del sistema.

---

## Clase abstracta

Se creó la clase abstracta `Empleado` para evitar repetir atributos como:
- nombre
- usuario
- clave

Las demás clases heredan de ella.

---

## Clases del sistema

### Cajero
Implementa:
- Autenticable
- Gestionable

### Administrador
Implementa:
- Autenticable
- Reportable
- Gestionable

### Supervisor
Implementa:
- Autenticable
- Reportable

---

## Ejecución

El programa tiene un menú donde se puede seleccionar el rol.

Después se pide:
- usuario
- contraseña

Si los datos son correctos, el sistema ejecuta las acciones correspondientes.

---
