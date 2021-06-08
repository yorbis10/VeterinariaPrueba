
package Entidades;


public class Medicamentos {
    
    private int idMedicamento,idUsuario,idCliente,idMascota;
    private String Medicamentos;

    public Medicamentos() {
    }

    public Medicamentos(int idMedicamento, int idUsuario, int idCliente, int idMascota, String Medicamentos) {
        this.idMedicamento = idMedicamento;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.idMascota = idMascota;
        this.Medicamentos = Medicamentos;
    }

    
    
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
    }
    
    
}
