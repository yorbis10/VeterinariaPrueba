//
package Controlador;

import Entidades.Mascota;
import Modelo.MascotasDAO;

import Vista.frmMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MascotaControlador implements ActionListener {

    MascotasDAO MascotasDAO = new MascotasDAO();
    frmMascotas frmasc = new frmMascotas();
    Mascota mas = new Mascota();
    DefaultTableModel modelo = new DefaultTableModel();

    public MascotaControlador(frmMascotas fm) {
        this.frmasc = fm;
        this.Listar(frmasc.TablaM);
    }

    public void Listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();

        List<Mascota> lmascota = MascotasDAO.Listar();
        
        for(int i=0;i<lmascota.size();i++){
            Object[] obj={
                lmascota.get(i).getDocumento(),
                lmascota.get(i).getNombre(),
                lmascota.get(i).getTipoMascota(),
                lmascota.get(i).getRaza(),                
                lmascota.get(i).getEdad(),
                lmascota.get(i).getObservacion()
            };
            modelo.addRow(obj);
            //int idMascota,String NombreCliente,String TipoMascota,String Raza,String NombreMascota,String Edad,String Observacion
        }
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
