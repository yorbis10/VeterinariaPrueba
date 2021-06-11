package Modelo;

import Configuracion.Conexion;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MascotasDAO {

    public static final String LISTAR = "SELECT c.Documento,m.Nombre,m.Tipo_mascota ,m.Raza,m.Edad,m.Observacion "
            + "FROM Mascota m,Cliente c WHERE m.Id_Cliente=c.Id_Cliente";

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Mascota masc;

    public List<Mascota> Listar() {

        List<Mascota> mascota = new ArrayList();

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {

                int Documento = rs.getInt("Documento");
                String NombreMascota = rs.getString("Nombre");
                String TipoMascota = rs.getString("Tipo_mascota");
                String Raza = rs.getString("Raza"); 
                String Edad = rs.getString("Edad");
                String Observacion = rs.getString("Observacion");
                masc = new Mascota(Documento, NombreMascota, TipoMascota, Raza, Edad, Observacion);
                //int documento,,String Nombre, String TipoMascota,String Raza,  String Edad, String Observacion
                mascota.add(masc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrar(con);
        }
        return mascota;
    }

}
