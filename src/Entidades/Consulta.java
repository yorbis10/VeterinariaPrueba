
package Entidades;

import java.sql.Date;

public class Consulta {
    
    private int idConsulta,idMastoca;
    private Date Fecha;
    private String Sintomas,Diagnostico;

    public Consulta() {
    }

    public Consulta(int idConsulta, int idMastoca, Date Fecha, String Sintomas, String Diagnostico) {
        this.idConsulta = idConsulta;
        this.idMastoca = idMastoca;
        this.Fecha = Fecha;
        this.Sintomas = Sintomas;
        this.Diagnostico = Diagnostico;
    }
    
    

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdMastoca() {
        return idMastoca;
    }

    public void setIdMastoca(int idMastoca) {
        this.idMastoca = idMastoca;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    
}
