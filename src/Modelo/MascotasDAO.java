package Modelo;

import Configuracion.Conexion;
import Entidades.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MascotasDAO {

    public static final String LISTAR = "SELECT m.id_Mascota,c.Nombre as Cliente,m.Tipo_mascota as [Tipo Mascota],m.Raza,m.Nombre as [Nombre Mascota],m.Edad,m.Observacion "
            + "FROM Mascota m,Cliente c WHERE c.Id_Cliente=m.Id_Cliente";

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Mascota masc;

    public  List<Mascota> Listar() {

        List<Mascota> mascota = new ArrayList();

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(LISTAR);
            rs = ps.executeQuery();
            while (rs.next()) {

                int idMascota = rs.getInt("idMascota");
                String NombreCliente = rs.getString("Cliente");
                String TipoMascota = rs.getString("Tipo Mascota");
                String Raza = rs.getString("Raza");
                String NombreMascota = rs.getString("Nombre Mascota");
                String Edad = rs.getString("Edad");
                String Observacion = rs.getString("Observacion");
                //int idMascota,String NombreCliente,String TipoMascota,String Raza,String NombreMascota,String Edad,String Observacion
                masc = new Mascota(idMascota, NombreCliente, TipoMascota, Raza, NombreMascota, Edad, Observacion);
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
