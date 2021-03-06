
package Entidades;


public class Mascota {
    
    private int idMascota,documento;
    private String TipoMascota,Raza,Nombre,Edad,Observacion,NombreCliente;
    private int idCliente;

    public Mascota() {
    }
    
    

    public Mascota(int idMascota, String NombreCliente, String TipoMascota, String Raza, String Nombre, String Edad, String Observacion) {
        this.idMascota = idMascota;
        this.NombreCliente=NombreCliente;
        //this.idCliente = idCliente;
        this.TipoMascota = TipoMascota;
        this.Raza = Raza;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Observacion = Observacion;
    }
    //listar
    public Mascota(int documento,String Nombre, String TipoMascota,String Raza,  String Edad, String Observacion) {
        this.documento = documento;
        this.Nombre = Nombre;
        this.TipoMascota = TipoMascota;
        this.Raza = Raza;
        this.Edad = Edad;
        this.Observacion = Observacion;
    }
    //insert

    public Mascota(String NombreCliente, String TipoMascota, String Raza, String Nombre, String Edad, String Observacion) {
        this.NombreCliente=NombreCliente;
        //this.idCliente = idCliente;
        this.TipoMascota = TipoMascota;
        this.Raza = Raza;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Observacion = Observacion;
    }
// editar
    public Mascota(String TipoMascota, String Raza, String Nombre, String Edad, String Observacion, int idCliente) {
       this.TipoMascota = TipoMascota;
        this.Raza = Raza;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Observacion = Observacion;
        this.idCliente = idCliente;
    }
   

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTipoMascota() {
        return TipoMascota;
    }

    public void setTipoMascota(String TipoMascota) {
        this.TipoMascota = TipoMascota;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }
    
   
}
