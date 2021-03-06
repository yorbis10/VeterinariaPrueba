package Vista;

import javax.swing.JOptionPane;

public class frmConsulta extends javax.swing.JInternalFrame {

    public frmConsulta() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterialIcon();
        PanelDatos = new javax.swing.JPanel();
        cmbTipoDocumento = new RSMaterialComponent.RSComboBoxMaterial();
        txtDocumento = new RSMaterialComponent.RSTextFieldMaterial();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        PanelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetroCustom1 = new RSMaterialComponent.RSTableMetroCustom();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuBuscar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmenuacerca = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setTitle("Formulario Consulta");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setToolTipText("Documento, Nombre, Apellido, Correo");
        txtBuscar.setColorIcon(new java.awt.Color(58, 159, 171));
        txtBuscar.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscar.setPhColor(new java.awt.Color(0, 0, 0));
        txtBuscar.setPlaceholder("Buscar");
        txtBuscar.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtBuscar.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);

        PanelDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo De Documento", "Cedula De Ciudadania", "Tarjeta De Identidad", "Cedula De Extranjeria", "Pasaporte", "Nit" }));
        cmbTipoDocumento.setToolTipText("");
        cmbTipoDocumento.setColorMaterial(new java.awt.Color(58, 159, 171));
        cmbTipoDocumento.setDoubleBuffered(true);
        cmbTipoDocumento.setEnabled(false);
        cmbTipoDocumento.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        cmbTipoDocumento.setThemeTooltip(null);

        txtDocumento.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumento.setToolTipText("");
        txtDocumento.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtDocumento.setEnabled(false);
        txtDocumento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDocumento.setPhColor(new java.awt.Color(0, 0, 0));
        txtDocumento.setPlaceholder("Documento");
        txtDocumento.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtDocumento.setThemeTooltip(null);
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("");
        txtNombre.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtNombre.setEnabled(false);
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombre.setPhColor(new java.awt.Color(0, 0, 0));
        txtNombre.setPlaceholder("Nombres");
        txtNombre.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtNombre.setThemeTooltip(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtSintomas.setColumns(20);
        txtSintomas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSintomas.setRows(5);
        txtSintomas.setToolTipText("");
        txtSintomas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "S??NTOMAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(58, 159, 171))); // NOI18N
        txtSintomas.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSintomas.setEnabled(false);
        txtSintomas.setSelectionColor(new java.awt.Color(58, 159, 171));
        jScrollPane2.setViewportView(txtSintomas);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDiagnostico.setRows(5);
        txtDiagnostico.setToolTipText("");
        txtDiagnostico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGN??STICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(58, 159, 171))); // NOI18N
        txtDiagnostico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDiagnostico.setEnabled(false);
        txtDiagnostico.setSelectionColor(new java.awt.Color(58, 159, 171));
        jScrollPane4.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        PanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setIconTextGap(6);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        PanelBotones.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 247, 70));

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setIconTextGap(6);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        PanelBotones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 247, 70));

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setEnabled(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setIconTextGap(6);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        PanelBotones.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 165, -1, 70));

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setIconTextGap(6);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelBotones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, 247, 70));

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(6);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PanelBotones.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 317, 247, 70));

        rSTableMetroCustom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetroCustom1.setBackgoundHead(new java.awt.Color(58, 159, 171));
        rSTableMetroCustom1.setBackgoundHover(new java.awt.Color(58, 159, 171));
        rSTableMetroCustom1.setColorPrimaryText(new java.awt.Color(58, 159, 171));
        rSTableMetroCustom1.setColorSecundaryText(new java.awt.Color(58, 159, 171));
        rSTableMetroCustom1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rSTableMetroCustom1.setFontHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rSTableMetroCustom1.setFontRowHover(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rSTableMetroCustom1.setFontRowSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rSTableMetroCustom1.setSelectionBackground(new java.awt.Color(58, 159, 171));
        jScrollPane1.setViewportView(rSTableMetroCustom1);

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 600));

        jMenu1.setText("Menu");

        jMenuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes/clientes.png"))); // NOI18N
        jMenuNuevo.setText("Nuevo");
        jMenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNuevo);
        jMenu1.add(jSeparator1);

        jMenuBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        jMenuBuscar.setText("Buscar");
        jMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBuscar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenu3.add(jSeparator2);

        jmenuacerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        jmenuacerca.setText("Manual");
        jmenuacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuacercaActionPerformed(evt);
            }
        });
        jMenu3.add(jmenuacerca);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoActionPerformed

    }//GEN-LAST:event_jMenuNuevoActionPerformed

    private void jMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarActionPerformed

    }//GEN-LAST:event_jMenuBuscarActionPerformed

    private void jmenuacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuacercaActionPerformed
        frmAcerca abrir = new frmAcerca();
        abrir.setVisible(true);
    }//GEN-LAST:event_jmenuacercaActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtBuscar.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(true);

        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        limpiar();
        JOptionPane.showMessageDialog(null, "Consulta Agregada Correctamente");
        inhabilitar();
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void setiar() {
        txtBuscar.setText("");
        cmbTipoDocumento.setSelectedIndex(0);
        txtDocumento.setText("");
        txtNombre.setText("");
        txtSintomas.setText("");
        txtDiagnostico.setText("");
    }

    public void limpiar() {
        setiar();
        //-----------
        cmbTipoDocumento.setEnabled(false);
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtSintomas.setEnabled(false);
        txtDiagnostico.setEnabled(false);
        txtBuscar.requestFocus();
    }

    public void habilitar() {
        setiar();
        //-----------
        txtBuscar.setEnabled(false);
        cmbTipoDocumento.setEnabled(true);
        txtDocumento.setEnabled(true);
        txtNombre.setEnabled(true);
        txtSintomas.setEnabled(true);
        txtDiagnostico.setEnabled(true);
        //--------

        cmbTipoDocumento.requestFocus();

    }

    public void inhabilitar() {
        setiar();
        //-----------
        txtBuscar.setEnabled(true);
        cmbTipoDocumento.setEnabled(false);
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtSintomas.setEnabled(false);
        txtDiagnostico.setEnabled(false);
        //--------
        txtBuscar.requestFocus();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private RSMaterialComponent.RSComboBoxMaterial cmbTipoDocumento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuscar;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmenuacerca;
    private RSMaterialComponent.RSTableMetroCustom rSTableMetroCustom1;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscar;
    private javax.swing.JTextArea txtDiagnostico;
    private RSMaterialComponent.RSTextFieldMaterial txtDocumento;
    private RSMaterialComponent.RSTextFieldMaterial txtNombre;
    private javax.swing.JTextArea txtSintomas;
    // End of variables declaration//GEN-END:variables
}
