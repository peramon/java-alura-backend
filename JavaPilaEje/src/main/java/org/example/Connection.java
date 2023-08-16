package org.example;

public class Connection implements AutoCloseable{

    public Connection() {
        System.out.println("Abriendo conexion");
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando conexion");
    }

    @Override
    public void close() throws Exception {
        cerrar();
    }
}
