package Controlador;

import Entidades.Clientes;
import Modelo.ClientesDAO;
import Vista.frmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientesControlador implements ActionListener {

    ClientesDAO ClientesDAO = new ClientesDAO();
    frmClientes FClientes = new frmClientes();
    Clientes clie; //Clientes clie = new Clientes();
    DefaultTableModel modelo = new DefaultTableModel();

    public ClientesControlador(frmClientes fClie) {
        this.FClientes = fClie;
        this.Listar(FClientes.TablaClientes);
        this.FClientes.btnGuardar.addActionListener(this);
        this.FClientes.btnEditar.addActionListener(this);
        this.FClientes.btnActualizar.addActionListener(this);
        this.FClientes.btnEliminar.addActionListener(this);
        FClientes.btnActualizar.setVisible(false);
    }

    public void Limpiar() {
        modelo.setRowCount(0);
        FClientes.txtDocumento.setText("");
        FClientes.cmbTipoDocumento.setSelectedIndex(0);
        FClientes.txtNombre.setText("");
        FClientes.txtApellido.setText("");
        FClientes.txtTelefono.setText("");
        FClientes.txtDireccion.setText("");
        FClientes.txtCiudad.setText("");
        FClientes.txtCorreo.setText("");
        FClientes.txtObservacion.setText("");
        FClientes.txtBuscar.requestFocus();
    }

    // metodo para mostrar los registro dela BD en la tabla de frm cliente
    public void Listar(JTable tabla) {

        modelo = (DefaultTableModel) tabla.getModel();
        List<Clientes> lclientes = ClientesDAO.Listar();

        for (int i = 0; i < lclientes.size(); i++) {
            Object[] obj = {
                lclientes.get(i).getDocumento(),
                lclientes.get(i).getTipoDocumento(),
                lclientes.get(i).getNombre(),
                lclientes.get(i).getApellidos(),
                lclientes.get(i).getTelefono(),
                lclientes.get(i).getDireccion(),
                lclientes.get(i).getCiudad(),
                lclientes.get(i).getCorreo(),
                lclientes.get(i).getObservacion()
            };
            modelo.addRow(obj);
        }

    }

    public void Insertar() {

        int Documento = Integer.parseInt(FClientes.txtDocumento.getText());
        String TipoDocumento = FClientes.cmbTipoDocumento.getSelectedItem().toString();
        String Nombre = FClientes.txtNombre.getText();
        String Apellidos = FClientes.txtApellido.getText();
        int Telefono = Integer.parseInt(FClientes.txtTelefono.getText());
        String Direccion = FClientes.txtDireccion.getText();
        String Ciudad = FClientes.txtCiudad.getText();
        String Correo = FClientes.txtCorreo.getText();
        String Observacion = FClientes.txtObservacion.getText();

        clie = new Clientes(Documento, TipoDocumento, Nombre, Apellidos, Telefono, Direccion, Ciudad, Correo, Observacion);

        int fila = ClientesDAO.Insertar(clie);
        if (fila == 1) {
            JOptionPane.showMessageDialog(FClientes, "Cliente registrado");
        } else {
            JOptionPane.showMessageDialog(FClientes, "el Clientes no se pudo registrar");
        }
    }

    // metodo para editar
    public void Editar() {
        // recuprar la informacion que el usuario digite en los controles
        int Documento = Integer.parseInt(FClientes.txtDocumento.getText());
        String TipoDocumento = FClientes.cmbTipoDocumento.getSelectedItem().toString();
        String Nombre = FClientes.txtNombre.getText();
        String Apellidos = FClientes.txtApellido.getText();
        int Telefono = Integer.parseInt(FClientes.txtTelefono.getText());
        String Direccion = FClientes.txtDireccion.getText();
        String Ciudad = FClientes.txtCiudad.getText();
        String Correo = FClientes.txtCorreo.getText();
        String Observacion = FClientes.txtObservacion.getText();

        clie = new Clientes(Documento, TipoDocumento, Nombre, Apellidos, Telefono, Direccion, Ciudad, Correo, Observacion);

        int fila = ClientesDAO.editar(clie);
        if (fila == 1) {
            JOptionPane.showMessageDialog(FClientes, "Cliente Actulizado");
            Limpiar();
            Listar(FClientes.TablaClientes);
        } else {
            JOptionPane.showMessageDialog(FClientes, "El cliente no se pudo actulizar");
            FClientes.btnEditar.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(FClientes.btnGuardar)) {
            this.Insertar();
            this.Limpiar();
            this.Listar(FClientes.TablaClientes);

        }

        if (e.getSource().equals(FClientes.btnCancelar)) {
            this.Limpiar();
            this.Listar(FClientes.TablaClientes);

        }

        if (e.getSource().equals(FClientes.btnEditar)) {
            FClientes.btnEditar.setVisible(false);
            FClientes.btnActualizar.setVisible(true);
            int fila = FClientes.TablaClientes.getSelectedRow();

            if (fila == -1) {
                JOptionPane.showMessageDialog(FClientes, "Debes seleccionar un registro en la tabla");
                FClientes.btnEditar.setVisible(true);
            } else {
                FClientes.txtDocumento.setText(String.valueOf((int) FClientes.TablaClientes.getValueAt(fila, 0)));
                FClientes.cmbTipoDocumento.setSelectedItem((String) FClientes.TablaClientes.getValueAt(fila, 1));
                FClientes.txtNombre.setText((String) FClientes.TablaClientes.getValueAt(fila, 2));
                FClientes.txtApellido.setText((String) FClientes.TablaClientes.getValueAt(fila, 3));
                FClientes.txtTelefono.setText(String.valueOf((int) FClientes.TablaClientes.getValueAt(fila, 4)));
                FClientes.txtDireccion.setText((String) FClientes.TablaClientes.getValueAt(fila, 5));
                FClientes.txtCiudad.setText((String) FClientes.TablaClientes.getValueAt(fila, 6));
                FClientes.txtCorreo.setText((String) FClientes.TablaClientes.getValueAt(fila, 7));
                FClientes.txtObservacion.setText((String) FClientes.TablaClientes.getValueAt(fila, 8));

                // habilito caja de texto
                FClientes.txtBuscar.setEnabled(false);
                FClientes.txtDocumento.setEnabled(true);
                FClientes.cmbTipoDocumento.setEnabled(true);
                FClientes.txtNombre.setEnabled(true);
                FClientes.txtApellido.setEnabled(true);
                FClientes.txtCorreo.setEnabled(true);
                FClientes.txtDireccion.setEnabled(true);
                FClientes.txtCiudad.setEnabled(true);
                FClientes.txtTelefono.setEnabled(true);
                FClientes.txtObservacion.setEnabled(true);
                FClientes.btnNuevo.setEnabled(false);
                FClientes.btnActualizar.setEnabled(true);
                FClientes.btnCancelar.setEnabled(true);
                FClientes.cmbTipoDocumento.requestFocus();
            }

        }

        if (e.getSource().equals(FClientes.btnActualizar)) {
            Editar();
            Limpiar();
            Listar(FClientes.TablaClientes);
            FClientes.btnActualizar.setVisible(false);
            FClientes.btnEditar.setVisible(true);
            FClientes.btnNuevo.setEnabled(true);
            FClientes.btnCancelar.setEnabled(false);
        }

        if (e.getSource().equals(FClientes.btnEliminar)) {

            int fila = FClientes.TablaClientes.getSelectedRow();

            if (fila == -1) {
                JOptionPane.showMessageDialog(FClientes, "debes seleccionar un registro de la tabla");
            } else {

                int opc = JOptionPane.showConfirmDialog(FClientes, "Deseas eliminar el registro");

                if (opc == 0) {
                    String cod = (String) FClientes.TablaClientes.getValueAt(opc, 0);
                    //clie.setCodigo(cod);
                    int f = ClientesDAO.eliminar(clie);
                    if (f == 1) {
                        JOptionPane.showMessageDialog(FClientes, "registro eliminado");
                        Listar(FClientes.TablaClientes);
                    } else {
                        JOptionPane.showMessageDialog(FClientes, "no se pudo eliminar el registro");
                    }
                }

            }
            Editar();
            Limpiar();
            Listar(FClientes.TablaClientes);
            FClientes.btnActualizar.setVisible(false);
            FClientes.btnEditar.setVisible(true);
        }
    }

}
