package Controlador;

import Entidades.Usuarios;
import Modelo.UsuarioDAO;
import Vista.frmLogin;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class UsuariosControlador implements ActionListener, KeyListener {

    UsuarioDAO lDao = new UsuarioDAO();
    Usuarios usu;
    frmLogin fLogin = new frmLogin();
    public static String usuarioGlobal = "";

    //metodo constructor
    public UsuariosControlador(frmLogin login) {
        this.fLogin = login;
        this.fLogin.btnIngresar.addActionListener(this);
        this.fLogin.txtClave.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(fLogin.btnIngresar)) {
            ingresar();

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            ingresar();
        }
    }

    // metodo para ingresar
    public void ingresar() {
        String usuario = fLogin.txtUsuario.getText();
        String clave = new String(fLogin.txtClave.getPassword());
        usu = new Usuarios(usuario, clave);
        usuarioGlobal = lDao.login(usu);

        if (!usuarioGlobal.equals("")) {
            frmPrincipal fPrincipal = new frmPrincipal();
            fPrincipal.setVisible(true);
            fLogin.dispose();
        } else if (fLogin.txtUsuario.getText().equals("")) {
            fLogin.lblUsuarioVacio.setText("¡Usuario Vacio!");
            fLogin.txtUsuario.requestFocus();
            ocultarlblerror();
        } else if (fLogin.txtClave.getPassword().length==0) { //fLogin.txtClave.getText().equals("") OBSOLETO YA NO SE USA
            fLogin.lblClaveVacia.setText("¡Clave Vacia!");
            fLogin.txtClave.requestFocus();
            ocultarlblerror();
        } else {
            fLogin.lblError.setText("¡Usuario o clave incorrectos!");
            fLogin.txtUsuario.setText("");
            fLogin.txtClave.setText("");
            fLogin.txtUsuario.requestFocus();
            ocultarlblerror();
        }
    }

    // metodo para ocutar lbl del error login
    public void ocultarlblerror() {
        int delay = 5000; //milisegundos 100mm= 1seg
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                fLogin.lblUsuarioVacio.setText(" ");
                fLogin.lblClaveVacia.setText(" ");
                fLogin.lblError.setText(" ");

            }
        };
        new Timer(delay, taskPerformer).start();

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
