package Modelo;

import Configuracion.Conexion;
import Entidades.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {

    public static final String LISTAR = "select Documento,Tipo_Documento,Nombre,Apellidos,Telefono,Direccion,Ciudad,Corrreo,Observacion  from Cliente";
    public static final String INSERTAR = "insert into Cliente values (?,?,?,?)";
    public static final String EDITAR = "update Cliente set Documento=?,Tipo_Documento=? ,Nombre=?, Apellidos=?, Telefono=?, Direccion=?, Ciudad=?, Corrreo=?, Observacion=? where Documento =?";
    public static final String ELIMINAR = " delete Cliente where Documento =?";
    
    //guarda la conexion a la bd
    Connection con = null;
    //preparar la consulta a la BD
    PreparedStatement ps = null;
    //Guarda el resultado de la consulta
    ResultSet rs = null;

    Clientes clien;

    // metodo para listar los registros en la tabla clientes
    public List<Clientes> Listar() {

        List<Clientes> lCliente = new ArrayList<>();

        try {
            //conectar a la BD
            con = Conexion.getConexion();

            //preparamos la consulta
            ps = con.prepareStatement(LISTAR);

            // ejecutamos la consulta
            rs = ps.executeQuery();

            while (rs.next()) {

                int Documento = rs.getInt("Documento");
                String Tipo_Documento = rs.getString("Tipo_Documento");
                String Nombre = rs.getString("Nombre");
                String Aprellidos = rs.getString("Apellidos");
                int Telefono = rs.getInt("Telefono");
                String Direccion = rs.getString("Direccion");
                String Ciudad = rs.getString("Ciudad");
                String Correo = rs.getString("Corrreo");
                String Observacion = rs.getString("Observacion");

                clien = new Clientes(Documento, Tipo_Documento, Nombre, Aprellidos, Telefono, Direccion, Ciudad, Correo, Observacion);

                // agregarlo a la lista
                lCliente.add(clien);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.cerrar(con);
        }
        return lCliente;

    }
    
    // metodo para insertar un  nuevo cliente
    public int Insertar(Clientes tv) {
        int fila = 0;
        try {
            //conectar a la BD
            con = Conexion.getConexion();
            //preparamos la consulta
            ps = con.prepareStatement(INSERTAR);

            //parametros para pasar en los (?) de la consulta
//            ps.setString(1, tv.getTipoDocumento());
//            ps.setString(2, tv.getMarca());
//            ps.setInt(3, tv.getPulgadas());
//            ps.setInt(4, tv.getCodcategoria());

            // ejecutamos la consulta
            fila = ps.executeUpdate();//cada que modifique una consulta, elimina, inserte o actualice

        } catch (Exception e) {
        } finally {
            Conexion.cerrar(con);
        }
        return fila;
    }

}
