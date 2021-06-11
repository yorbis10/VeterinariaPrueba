package Modelo;

import Configuracion.Conexion;
import Entidades.Clientes;

import Entidades.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class MascotasDAO {

    public static final String LISTAR = "SELECT c.Documento,m.Nombre,m.Tipo_mascota ,m.Raza,m.Edad,m.Observacion "
          + "FROM Mascota m,Cliente c WHERE m.Id_Cliente=c.Id_Cliente";

    public static final String INSERTAR = "INSERT INTO Mascota VALUES(?,?,?,?,?,?)";

    public static final String EDITAR = "UPDATE Mascota "
          + "SET id_Cliente=?,Tipo_mascota=?,Raza=?,Nombre=?,Edad=?,Observacion=? WHERE id_Mascota=?";

    public static final String ELIMINAR = "DELETE FROM Mascota WHERE id_Mascota=?";

    public static final String COMBOCLIENTES = "SELECT * FROM Cliente";

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

    /*---*/
    //INSERT
    public int Insertar(Mascota masc) {

        int fila = 0;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(INSERTAR);
            ps.setInt(1, masc.getIdCliente());
            ps.setString(2, masc.getTipoMascota());
            ps.setString(3, masc.getRaza());
            ps.setString(4, masc.getNombre());
            ps.setString(5, masc.getEdad());
            ps.setString(6, masc.getObservacion());
            fila = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrar(con);
        }
        return fila;
    }

    /*----*/
    //COMBO
    public void cargar_clientes(JComboBox<Clientes> lclientes) {
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(COMBOCLIENTES);
            rs = ps.executeQuery();
            while (rs.next()) {
                lclientes.addItem(
                      new Clientes(
                            rs.getInt("Id_Cliente"),
                            rs.getString("Nombre")
                      )
                );

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrar(con);
        }
    }
    
    //

}
