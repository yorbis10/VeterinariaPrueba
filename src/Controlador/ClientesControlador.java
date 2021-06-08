package Controlador;

import Entidades.Clientes;
import Modelo.ClientesDAO;
import Vista.frmClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClientesControlador implements ActionListener{

    
    ClientesDAO ClientesDAO = new ClientesDAO(); 
    frmClientes FClientes = new frmClientes();
    Clientes clie = new Clientes();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ClientesControlador(frmClientes fClie) {
        this.FClientes = fClie;
       this.Listar(FClientes.TablaUsuarios);
        //this.fClie.btnGuardar.addActionListener(this);
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
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
