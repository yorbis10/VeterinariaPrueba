package Vista;

import Controlador.UsuariosControlador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BarraDeProgreso = new RSMaterialComponent.RSProgressMaterial();
        lblSalir = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        txtUsuario = new RSMaterialComponent.RSTextFieldMaterialIcon();
        lblUsuarioVacio = new javax.swing.JLabel();
        txtClave = new RSMaterialComponent.RSPasswordMaterialIcon();
        lblClaveVacia = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        btnIngresar = new newscomponents.RSButtonGradientIcon_new();
        btnSalir = new newscomponents.RSButtonGradientIcon_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Login/pet.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mascota Soft");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        BarraDeProgreso.setForeground(new java.awt.Color(58, 159, 171));
        BarraDeProgreso.setToolTipText("");
        BarraDeProgreso.setRequestFocusEnabled(false);
        BarraDeProgreso.setTimeProgress(2500);
        BarraDeProgreso.setWidthProgress(5);

        lblSalir.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 0, 0));
        lblSalir.setText("X");
        lblSalir.setToolTipText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        lblIniciarSesion.setBackground(new java.awt.Color(58, 159, 171));
        lblIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(58, 159, 171));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesion");
        lblIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setColorIcon(new java.awt.Color(58, 159, 171));
        txtUsuario.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        txtUsuario.setPhColor(new java.awt.Color(0, 0, 0));
        txtUsuario.setPlaceholder("Usuario");
        txtUsuario.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtUsuario.setThemeTooltip(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblUsuarioVacio.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblUsuarioVacio.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuarioVacio.setText("s");

        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setColorIcon(new java.awt.Color(58, 159, 171));
        txtClave.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtClave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtClave.setPhColor(new java.awt.Color(0, 0, 0));
        txtClave.setPlaceholder("Contraseña");
        txtClave.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtClave.setThemeTooltip(null);

        lblClaveVacia.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblClaveVacia.setForeground(new java.awt.Color(255, 0, 0));
        lblClaveVacia.setText(" ");

        lblError.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnIngresar.setBackground(new java.awt.Color(255, 102, 102));
        btnIngresar.setText("Login");
        btnIngresar.setColorPrimario(new java.awt.Color(58, 159, 171));
        btnIngresar.setColorPrimarioHover(new java.awt.Color(64, 177, 190));
        btnIngresar.setColorSecundario(new java.awt.Color(64, 177, 190));
        btnIngresar.setColorSecundarioHover(new java.awt.Color(58, 159, 171));
        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngresar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.setColorPrimario(new java.awt.Color(64, 177, 190));
        btnSalir.setColorPrimarioHover(new java.awt.Color(58, 159, 171));
        btnSalir.setColorSecundario(new java.awt.Color(58, 159, 171));
        btnSalir.setColorSecundarioHover(new java.awt.Color(64, 177, 190));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(BarraDeProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClaveVacia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblUsuarioVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BarraDeProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblUsuarioVacio)
                .addGap(3, 3, 3)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblClaveVacia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        lblClaveVacia.getAccessibleContext().setAccessibleName("tte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtClave.requestFocus();
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        frmLogin flogin = new frmLogin();
        UsuariosControlador cLogin = new UsuariosControlador(flogin);
        flogin.setVisible(true);
        // poner foco en boton login
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSProgressMaterial BarraDeProgreso;
    public newscomponents.RSButtonGradientIcon_new btnIngresar;
    private newscomponents.RSButtonGradientIcon_new btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lblClaveVacia;
    public javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblSalir;
    public javax.swing.JLabel lblUsuarioVacio;
    public RSMaterialComponent.RSPasswordMaterialIcon txtClave;
    public RSMaterialComponent.RSTextFieldMaterialIcon txtUsuario;
    // End of variables declaration//GEN-END:variables
}
