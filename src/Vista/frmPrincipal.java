package Vista;

import java.awt.*;
import javax.swing.*;

public class frmPrincipal extends javax.swing.JFrame {

    
    public frmPrincipal() {
      
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btnClientes = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnMascotas = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnConsulta = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnMedicamentos = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnUsuarios = new RSMaterialComponent.RSButtonMaterialIconTwo();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jpPrincipal = new javax.swing.JPanel();
        jpUser = new javax.swing.JPanel();
        btnCerrarSesion = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Principal/logo300.png"))); // NOI18N

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Principal/content.png"))); // NOI18N
        lblMenu.setText("MENU");

        btnClientes.setBackground(new java.awt.Color(255, 102, 0));
        btnClientes.setText("Clientes");
        btnClientes.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnMascotas.setBackground(new java.awt.Color(255, 102, 0));
        btnMascotas.setText("Mascotas");
        btnMascotas.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnMascotas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMascotas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PETS);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnConsulta.setBackground(new java.awt.Color(255, 102, 0));
        btnConsulta.setText("Consulta");
        btnConsulta.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnConsulta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnConsulta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_BOX);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnMedicamentos.setBackground(new java.awt.Color(255, 102, 0));
        btnMedicamentos.setText("Medicamentos");
        btnMedicamentos.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnMedicamentos.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnMedicamentos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GRAIN);
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(255, 102, 0));
        btnUsuarios.setText("Usuario");
        btnUsuarios.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnUsuarios.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnUsuarios.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE_OUTLINE);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 102, 0));
        btnSalir.setText("Salir");
        btnSalir.setBackgroundHover(new java.awt.Color(255, 153, 0));
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
                .addGap(0, 123, Short.MAX_VALUE))
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 298, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 700));

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 990, 650));

        jpUser.setBackground(new java.awt.Color(255, 102, 0));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCerrarSesion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        rSLabelTextIcon1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon1.setText("Usuario: ");
        rSLabelTextIcon1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);

        javax.swing.GroupLayout jpUserLayout = new javax.swing.GroupLayout(jpUser);
        jpUser.setLayout(jpUserLayout);
        jpUserLayout.setHorizontalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 614, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jpUserLayout.setVerticalGroup(
            jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUserLayout.createSequentialGroup()
                .addGroup(jpUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        getContentPane().add(jpUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        setSize(new java.awt.Dimension(1300, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    frmClientes fCliente = new frmClientes();
    frmMedicamentos fMedicamentos = new frmMedicamentos();
    frmMascotas fMascotas = new frmMascotas();
    frmConsulta fConsulta = new frmConsulta();
    frmUsuarios fUsuarios = new frmUsuarios();


    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // frmClientes fCliente = new frmClientes();
        jpPrincipal.add(fCliente);
        fCliente.setVisible(true);
        fMascotas.setVisible(false);
        fConsulta.setVisible(false);
        fMedicamentos.setVisible(false);
        fUsuarios.setVisible(false);
        fCliente.setLocation((jpPrincipal.getWidth() - fCliente.getWidth()) / 2, (jpPrincipal.getHeight() - fCliente.getHeight()) / 2);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        //frmMedicamentos fMedicamentos = new frmMedicamentos();
        jpPrincipal.add(fMedicamentos);
        fMedicamentos.setVisible(true);
        fCliente.setVisible(false);
        fMascotas.setVisible(false);
        fConsulta.setVisible(false);
        fUsuarios.setVisible(false);
        fMedicamentos.setLocation((jpPrincipal.getWidth() - fMedicamentos.getWidth()) / 2, (jpPrincipal.getHeight() - fMedicamentos.getHeight()) / 2);
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        //frmMascotas fMascotas = new frmMascotas();
        jpPrincipal.add(fMascotas);
        fMascotas.setVisible(true);
        fCliente.setVisible(false);
        fConsulta.setVisible(false);
        fMedicamentos.setVisible(false);
        fUsuarios.setVisible(false);
        fMascotas.setLocation((jpPrincipal.getWidth() - fMascotas.getWidth()) / 2, (jpPrincipal.getHeight() - fMascotas.getHeight()) / 2);
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        //frmConsulta fConsulta = new frmConsulta();
        jpPrincipal.add(fConsulta);
        fConsulta.setVisible(true);
        fCliente.setVisible(false);
        fMascotas.setVisible(false);        
        fMedicamentos.setVisible(false);
        fUsuarios.setVisible(false);
        fConsulta.setLocation((jpPrincipal.getWidth() - fConsulta.getWidth()) / 2, (jpPrincipal.getHeight() - fConsulta.getHeight()) / 2);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //frmUsuarios fUsuarios = new frmUsuarios();
        jpPrincipal.add(fUsuarios);
        fUsuarios.setVisible(true);
        fCliente.setVisible(false);
        fMascotas.setVisible(false);
        fConsulta.setVisible(false);
        fMedicamentos.setVisible(false);
        
        fUsuarios.setLocation((jpPrincipal.getWidth() - fUsuarios.getWidth()) / 2, (jpPrincipal.getHeight() - fUsuarios.getHeight()) / 2);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

//     public class fondo extends JPanel {
//
//        private Image imagen;
//
//        public void paint(Graphics g) {
//            imagen = new ImageIcon(getClass().getResource("/Img/fondo3.jpg")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            super.paint(g);
//
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconTwo btnCerrarSesion;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnClientes;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnConsulta;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnMascotas;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnMedicamentos;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnSalir;
    private RSMaterialComponent.RSButtonMaterialIconTwo btnUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpUser;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    // End of variables declaration//GEN-END:variables
}
