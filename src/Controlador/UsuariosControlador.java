package Controlador;

import Entidades.Usuarios;
import Modelo.UsuarioDAO;
import Vista.frmLogin;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class UsuariosControlador implements ActionListener {

    UsuarioDAO lDao = new UsuarioDAO();
    Usuarios usu;
    frmLogin fLogin = new frmLogin();
    public static String usuarioGlobal = "";

    //metodo constructor
    public UsuariosControlador(frmLogin login) {
        this.fLogin = login;
        this.fLogin.btnIngresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(fLogin.btnIngresar)) {
            String usuario = fLogin.txtUsuario.getText();
            String clave = new String(fLogin.txtClave.getPassword());
            usu = new Usuarios(usuario, clave);
            usuarioGlobal = lDao.login(usu);
            if (!usuarioGlobal.equals("")) {
                frmPrincipal fPrincipal = new frmPrincipal();
                fPrincipal.setVisible(true);
                fLogin.dispose();
            } else {
                //JOptionPane.showMessageDialog(null, "Usuario y clave Incorrecto");
                fLogin.lblError.setText("Usuario y clave Incorrecto");
                fLogin.txtUsuario.setText("");
                fLogin.txtClave.setText("");
                fLogin.txtUsuario.requestFocus();
                ocultarlblerror();
            }
        }

    }

    // metodo para ocutar lbl del error login
    public void ocultarlblerror() {
        int delay = 5000; //millisegundos
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                fLogin.lblError.setText("");;
            }
        };
        new Timer(delay, taskPerformer).start();

    }
}
