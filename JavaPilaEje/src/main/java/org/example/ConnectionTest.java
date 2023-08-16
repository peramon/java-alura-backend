package org.example;

public class ConnectionTest {

    public static void main(String[] args) throws Exception {
        /*Conexion conexion = null;
        try{
            conexion = new Conexion();
            conexion.leerDatos();
        }catch (IllegalStateException e){
            System.out.println("Received the exception");
            e.printStackTrace();
        }finally {
            System.out.println("Execute finally");
            if(conexion != null){
                conexion.cerrar();
            }

        }*/

        // Try with resources
        try(Connection con = new Connection()){
            con.leerDatos();
        }catch (IllegalStateException ex){
            System.out.println("Received the exception");
            ex.printStackTrace();
        }

    }
}
