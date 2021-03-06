//principal [58,159,171], secundario [64,177,190]
package Vista;

import Controlador.ClientesControlador;
import Controlador.LoginControlador;
import Controlador.MascotaControlador;
import java.awt.*;
import javax.swing.*;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {

        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/icon.png")).getImage());
        // this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        // lblUsuario.setText("Usuario: "+UsuariosControlador.usuarioGlobal);
        lblUsuario.setText(LoginControlador.usuarioGlobal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btnClientes = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnMascotas = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnConsulta = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnMedicamentos = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnUsuario = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jpUser = new javax.swing.JPanel();
        btnCerrarSesion = new RSMaterialComponent.RSButtonMaterialIconTwo();
        lblUsuario = new RSMaterialComponent.RSLabelTextIcon();
        int ale = (int) (Math.random()*8+1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/Principal/fondo"+ale+".jpg"));
        Image image = icon.getImage();
        jpPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sorftware Veterinaria");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(58, 159, 171));

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171)));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Principal/logo300.png"))); // NOI18N

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLogoLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
            .addGroup(PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLogoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Principal/content.png"))); // NOI18N
        lblMenu.setText("MENU");

        btnClientes.setBackground(new java.awt.Color(58, 159, 171));
        btnClientes.setText("Clientes");
        btnClientes.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnMascotas.setBackground(new java.awt.Color(58, 159, 171));
        btnMascotas.setText("Mascotas");
        btnMascotas.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnMascotas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMascotas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PETS);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnConsulta.setBackground(new java.awt.Color(58, 159, 171));
        btnConsulta.setText("Consulta");
        btnConsulta.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnConsulta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnConsulta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_BOX);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnMedicamentos.setBackground(new java.awt.Color(58, 159, 171));
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnMedicamentos.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMedicamentos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GRAIN);
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(58, 159, 171));
        btnUsuario.setText("Usuario");
        btnUsuario.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnUsuario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE_OUTLINE);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(58, 159, 171));
        btnSalir.setText("Salir");
        btnSalir.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedicamentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMascotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 700));

        jpUser.setBackground(new java.awt.Color(58, 159, 171));

        btnCerrarSesion.setBackground(new java.awt.Color(58, 159, 171));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBackgroundHover(new java.awt.Color(64, 177, 190));
        btnCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarSesion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario: ");
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);

        javax.swing.GroupLayout jpUserLayout = new javax.swing.GroupLayout(jpUser);
        jpUser.setLayout(jpUserLayout);
        jpUserLayout.setHorizontalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpUserLayout.setVerticalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpUserLayout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1000, 50));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171)));
        jpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpPrincipal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 1000, 650));

        setSize(new java.awt.Dimension(1326, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    frmClientes fCliente = new frmClientes();
    frmMedicamentos fMedicamentos = new frmMedicamentos();
    frmMascotas fMascotas = new frmMascotas();
    frmConsulta fConsulta = new frmConsulta();
    frmUsuario fUsuarios = new frmUsuario();

    public void ocultar() {
        fCliente.dispose();
        fMascotas.dispose();
        fConsulta.dispose();
        fMedicamentos.dispose();
        fUsuarios.dispose();
    }

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        frmClientes fCliente = new frmClientes();
        jpPrincipal.add(fCliente);
        ClientesControlador Cliencont = new ClientesControlador(fCliente);
        ocultar();
        fCliente.setLocation((jpPrincipal.getWidth() - fCliente.getWidth()) / 2, (jpPrincipal.getHeight() - fCliente.getHeight()) / 2);
        fCliente.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        frmMedicamentos fMedicamentos = new frmMedicamentos();
        ocultar();
        jpPrincipal.add(fMedicamentos);
        fMedicamentos.setLocation((jpPrincipal.getWidth() - fMedicamentos.getWidth()) / 2, (jpPrincipal.getHeight() - fMedicamentos.getHeight()) / 2);
        fMedicamentos.setVisible(true);
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        frmMascotas fMascotas = new frmMascotas();
        jpPrincipal.add(fMascotas);
        MascotaControlador mascota = new MascotaControlador(fMascotas);
        ocultar();      
        fMascotas.setLocation((jpPrincipal.getWidth() - fMascotas.getWidth()) / 2, (jpPrincipal.getHeight() - fMascotas.getHeight()) / 2);
        fMascotas.setVisible(true);
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        frmConsulta fConsulta = new frmConsulta();
        ocultar();
        jpPrincipal.add(fConsulta);
        fConsulta.setLocation((jpPrincipal.getWidth() - fConsulta.getWidth()) / 2, (jpPrincipal.getHeight() - fConsulta.getHeight()) / 2);
        fConsulta.setVisible(true);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        frmUsuario fUsuarios = new frmUsuario();
        ocultar();
        jpPrincipal.add(fUsuarios);
        fUsuarios.setLocation((jpPrincipal.getWidth() - fUsuarios.getWidth()) / 2, (jpPrincipal.getHeight() - fUsuarios.getHeight()) / 2);
        fUsuarios.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogo;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnCerrarSesion;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnClientes;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnConsulta;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnMascotas;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnMedicamentos;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnSalir;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jpPrincipal;
    private javax.swing.JPanel jpUser;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private RSMaterialComponent.RSLabelTextIcon lblUsuario;
    // End of variables declaration//GEN-END:variables
}
