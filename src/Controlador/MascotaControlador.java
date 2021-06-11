//
package Controlador;

import Entidades.Mascota;
import Modelo.MascotasDAO;

import Vista.frmMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MascotaControlador implements ActionListener {

    MascotasDAO MascotasDAO = new MascotasDAO();
    frmMascotas frmasc = new frmMascotas();
    Mascota mas;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultComboBoxModel combo = new DefaultComboBoxModel();

    public MascotaControlador(frmMascotas fm) {
        this.frmasc = fm;
        this.cargarcombo();
        this.Listar(frmasc.TablaM);

    }

    public void Limpiar() {
        modelo.setRowCount(0);
        frmasc.cmbTipoMascota.setSelectedIndex(0);
        frmasc.txtDocumento.setSelectedIndex(0);
        frmasc.txtNombre.setText("");
        frmasc.txtRaza.setText("");
        frmasc.txtEdad.setText("");
        frmasc.txtObservacion.setText("");
        frmasc.cmbTipoMascota.requestFocus();
    }

    public void Listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();

        List<Mascota> lmascota = MascotasDAO.Listar();

        for (int i = 0; i < lmascota.size(); i++) {
            Object[] obj = {
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

    /*-----*/
    //CARGAR COMBO
    public void cargarcombo() {
        this.MascotasDAO.cargar_clientes(frmasc.txtDocumento);
    }

    /*-----------*/
    public void insertar() {

        String TipoMascota = frmasc.cmbTipoMascota.getSelectedItem().toString();
        //int idCliente = Integer.parseInt(frmasc.txtDocumento.getSelectedItem().toString());  
        int idCliente = frmasc.txtDocumento.getItemAt(frmasc.txtDocumento.getSelectedIndex()).getDocumento();
        String Nombre = frmasc.txtNombre.getText();
        String Raza = frmasc.txtRaza.getText();
        String Edad = frmasc.txtEdad.getText();
        String Observacion = frmasc.txtObservacion.getText();
        
        mas = new Mascota(idCliente, Nombre, TipoMascota, Raza, Edad, Observacion);

        int fila = MascotasDAO.Insertar(mas);
        if (fila == 1) {
            JOptionPane.showMessageDialog(frmasc, "REGISTRO CORRECTAMENTE");
        } else {
            JOptionPane.showMessageDialog(frmasc, "NO ES POSIBLE INSERTAR");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frmasc.btnGuardar)) {
            //this.insertar();
            this.Limpiar();
            this.Listar(frmasc.TablaM);

        }
    }

}
