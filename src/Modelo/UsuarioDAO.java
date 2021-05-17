package Modelo;

import Configuracion.Conexion;
import Entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public static final String LOGIN = "select * from tblUsuario where usuario =? and clave=?";

    public String login(Usuarios usu) {
        //guarda la conexion a la bd
        Connection con = null;

        //preparar la consulta a la BD
        PreparedStatement ps = null;

        //Guarda el resultado de la consulta
        ResultSet rs = null;

        String resultado = "";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(LOGIN);
            ps.setString(1, usu.getUsuario());
            ps.setString(2, usu.getClave());
            rs = ps.executeQuery();
            if (rs.next()) {
                resultado = usu.getUsuario();
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(con);
        }
        return resultado;
    }
}
