package Entidades;

public class Persona {

    private int idPersona,Documento,Telefono;
    private String TipoDocumento, Nombre, Aplellidos, Direccion, Ciudad,Correo;

    public Persona() {
    }

    public Persona(int idPersona, int Documento, int Telefono, String TipoDocumento, String Nombre, String Aplellidos, String Direccion, String Ciudad, String Correo) {
        this.idPersona = idPersona;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.TipoDocumento = TipoDocumento;
        this.Nombre = Nombre;
        this.Aplellidos = Aplellidos;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Correo = Correo;
    }
    
    

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAplellidos() {
        return Aplellidos;
    }

    public void setAplellidos(String Aplellidos) {
        this.Aplellidos = Aplellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    

    

}
