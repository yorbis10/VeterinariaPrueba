package Configuracion;

import java.sql.*;

public class Conexion {

    public static Connection getConexion() {
        Connection con = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "database=Veterinaria;user=admin;password=admin");
        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;

    }


    public static void main(String[] args) {
        System.out.println(Conexion.getConexion());
        System.out.println("Conexion exitosa");
        System.out.println("Conexion git");
    }
}
