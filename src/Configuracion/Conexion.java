package Configuracion;

import java.sql.*;

public class Conexion {

    //metodo para conectar a BD
    public static Connection getConexion() {
        Connection con = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "database=Veterinaria;user=admin;password=admi"
                    + "n");
        } catch (Exception e) {

            e.printStackTrace();
        }
        
        return con;

    }

    //mostrar si esta bien la conexion
//    public static void main(String[] args) {
//    System.out.println(Conexion.getConexion());
//     }
    
    //metodo para cerra la conecion a BD
    public static void cerrar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
