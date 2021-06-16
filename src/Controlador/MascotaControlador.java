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
        this.Listar(frmasc.TablaM);
        this.CargarCombo();
        this.frmasc.btnGuardar.addActionListener(this);
        this.frmasc.btnActualizar.addActionListener(this);
        this.frmasc.btnEliminar.addActionListener(this);
        this.frmasc.btnCancelar.addActionListener(this);
        this.frmasc.btnEditar.addActionListener(this);
        frmasc.btnActualizar.setVisible(false);

    }

    public void Limpiar() {
        modelo.setRowCount(0);
        frmasc.cmbTipoMascota.setSelectedIndex(0);
        frmasc.cmbNombreCliente.setSelectedIndex(0);
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
    public void CargarCombo() {

        this.MascotasDAO.cargarCleintes(frmasc.cmbNombreCliente);

    }

    /*-----------*/
    public void insertar() {

        //int idCliente = Integer.parseInt(frmasc.txtDocumento.getSelectedItem().toString());  
        //String NombreCliente = frmasc.cmbNombreCliente.getItemAt(frmasc.cmbNombreCliente.getSelectedIndex()).getNombre();
        String NombreCliente = frmasc.cmbNombreCliente.getSelectedItem().toString();
        String TipoMascota = frmasc.cmbTipoMascota.getSelectedItem().toString();
        String Raza = frmasc.txtRaza.getText();
        String Nombre = frmasc.txtNombre.getText();
        String Edad = frmasc.txtEdad.getText();
        String Observacion = frmasc.txtObservacion.getText();
        mas = new Mascota(NombreCliente, TipoMascota, Raza, Nombre, Edad, Observacion);
        int fila = MascotasDAO.Insertar(mas);
        if (fila == 1) {
            JOptionPane.showMessageDialog(frmasc, "REGISTRO CORRECTAMENTE");
            this.Limpiar();
            this.Listar(frmasc.TablaM);
        } else {
            JOptionPane.showMessageDialog(frmasc, "NO ES POSIBLE INSERTAR");
        }

    }

    /*-----------*/
    //EDITAR
    public void editar() {
        String TipoMascota = frmasc.cmbTipoMascota.getSelectedItem().toString();
        String Raza = frmasc.txtRaza.getText();
        String Nombre = frmasc.txtNombre.getText();
        String Edad = frmasc.txtEdad.getText();
        String Observacion = frmasc.txtObservacion.getText();
        int idCliente=frmasc.cmbNombreCliente.getItemAt(frmasc.cmbNombreCliente.getSelectedIndex()).getNombreCliente();
        mas = new Mascota(TipoMascota, Raza,Nombre ,Edad ,Observacion ,idCliente);
        //id_Cliente=?,Raza=?,Nombre=?,Edad=?,Observacion=? WHERE Tipo_mascota=?
        int fila = MascotasDAO.editar(mas);
        if (fila == 1) {
            JOptionPane.showMessageDialog(frmasc, "REGISTRO ACTULIZADO");
            this.Limpiar();
            this.Listar(frmasc.TablaM);
        } else {
            JOptionPane.showMessageDialog(frmasc, "NO ES POSIBLE ACTUALIZAR INFORMACIÓN");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frmasc.btnGuardar)) {
            this.insertar();
            this.Limpiar();
            this.Listar(frmasc.TablaM);

        }
        if (e.getSource().equals(frmasc.btnEditar)) {
            frmasc.btnEditar.setVisible(false);
            frmasc.btnActualizar.setVisible(true);
            int fila = frmasc.TablaM.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(frmasc, "DEBES SELECCIONAR UN REGISTRO");
            } else {
                frmasc.cmbNombreCliente.setSelectedItem((String) frmasc.TablaM.getValueAt(fila, 0));
                frmasc.cmbTipoMascota.setSelectedItem((String) frmasc.TablaM.getValueAt(fila, 1));
                frmasc.txtRaza.setText(frmasc.TablaM.getValueAt(fila, 2).toString());
                frmasc.txtNombre.setText(frmasc.TablaM.getValueAt(fila, 3).toString());
                frmasc.txtEdad.setText(frmasc.TablaM.getValueAt(fila, 4).toString());
                frmasc.txtObservacion.setText((String) frmasc.TablaM.getValueAt(fila, 5));

            }
        }
        
        if(e.getSource().equals(frmasc.btnActualizar)){
            editar();
             this.Limpiar();
             this.Listar(frmasc.TablaM);
             frmasc.btnActualizar.setVisible(false);
             frmasc.btnEditar.setVisible(true);
        }
        
        if(e.getSource().equals(frmasc.btnEliminar)){
            int fila=frmasc.TablaM.getSelectedRow();
            if(fila==-1){
                 JOptionPane.showMessageDialog(frmasc, "DEBES SELECCIONAR UN REGISTRO");
            }else{
                int opc= JOptionPane.showConfirmDialog(frmasc, "¿DESEAS ELIMINAR EL REGISTRO ACTUAL?");
                if(opc==0){
                    int cod =Integer.parseInt((String) frmasc.TablaM.getValueAt(fila, 0));
                    mas=new Mascota();
                    mas.setIdCliente(cod);
                    int fi=MascotasDAO.eliminar(mas);
                    if(fi==1){
                        JOptionPane.showMessageDialog(frmasc, "REGISTRO ELIMINADO");
                         this.Limpiar();
                    }else{
                        JOptionPane.showMessageDialog(frmasc, "NO ES POSIBLE ELIMINAR REGISTRO");
                    }
                }
            }
        }
    }

}
