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

    //public static final String INSERTAR = "INSERT INTO Mascota VALUES(?,?,?,?,?,?)";
      
    public static final String INSERTAR="INSERT INTO Mascota([id_Cliente],[Tipo_mascota],[Raza],[Nombre],[Edad],[Observacion])\n" +
                "VALUES((SELECT Id_Cliente FROM Cliente WHERE Nombre=?),?,?,?,?,?)";
    
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

    
    public int Insertar(Mascota mascot) {

        int fila = 0;

        try {

            con = Conexion.getConexion();
            ps = con.prepareStatement(INSERTAR);
            ps.setString(1, mascot.getNombreCliente());
            ps.setString(2, mascot.getTipoMascota());
            ps.setString(3, mascot.getRaza());
            ps.setString(4, mascot.getNombre());
            ps.setString(5, mascot.getEdad());
            ps.setString(6, mascot.getObservacion());

            fila = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            Conexion.cerrar(con);

        }

        return fila;

    }
    
    
    //NUEVO COD
//    public void insertar_mascota(Mascota masco) throws Exception{
//        try {
//            con=Conexion.getConexion();
//            ps=con.prepareStatement(INSERTAR);
//            ps.setString(1, masco.getNombreCliente());
//            ps.setString(2, masco.getTipoMascota());
//            ps.setString(3, masco.getRaza());
//            ps.setString(4, masco.getNombre());
//            ps.setString(5, masco.getEdad());
//            ps.setString(6, masco.getObservacion());
//            ps.executeUpdate();
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//            Conexion.cerrar(con);
//        }
//    }

    //COMBO
    public void cargarCleintes(JComboBox<Clientes> lClientes) {

        try {

            con = Conexion.getConexion();
            ps = con.prepareStatement(COMBOCLIENTES);
            rs = ps.executeQuery();

            while (rs.next()) {

                lClientes.addItem(
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
