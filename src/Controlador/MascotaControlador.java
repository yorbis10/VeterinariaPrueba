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

    MascotasDAO mascotadao = new MascotasDAO();
        frmMascotas frmasc = new frmMascotas();
        Mascota mas = new Mascota();
        DefaultTableModel modelo = new DefaultTableModel();
        
        public MascotaControlador(frmMascotas fm){
            this.frmasc=fm;
            this.Listar(frmasc.TablaMascota);
        }
        
        public void Listar(JTable tabla){
            modelo = (DefaultTableModel) tabla.getModel();
            
            
            
            
           
            
            
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
