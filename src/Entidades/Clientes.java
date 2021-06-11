package Entidades;

public class Clientes {

    private int idCliente, Documento, Telefono;
    private String TipoDocumento, Nombre, Apellidos, Direccion, Ciudad, Correo, Observacion;

    public Clientes() {
    }

    public Clientes(int Documento, String TipoDocumento, String Nombre, String Apellidos, int Telefono, String Direccion, String Ciudad, String Correo, String Observacion, int idCliente) {

        this.idCliente = idCliente;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.TipoDocumento = TipoDocumento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Correo = Correo;
        this.Observacion = Observacion;
    }

    public Clientes(int Documento, String TipoDocumento, String Nombre, String Apellidos, int Telefono, String Direccion, String Ciudad, String Correo, String Observacion) {
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.TipoDocumento = TipoDocumento;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Correo = Correo;
        this.Observacion = Observacion;
    }

    //AGREGADO POR JUAN
    public Clientes(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
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

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    //juan
    @Override
    public String toString() {
        return Nombre;
    }

}
