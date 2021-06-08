package Vista;

import javax.swing.JOptionPane;

public class frmClientes extends javax.swing.JInternalFrame {

    public frmClientes() {
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
        txtApellido = new RSMaterialComponent.RSTextFieldMaterial();
        txtCorreo = new RSMaterialComponent.RSTextFieldMaterial();
        txtDireccion = new RSMaterialComponent.RSTextFieldMaterial();
        txtCiudad = new RSMaterialComponent.RSTextFieldMaterial();
        txtTelefono = new RSMaterialComponent.RSTextFieldMaterial();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        PanelBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new RSMaterialComponent.RSTableMetroCustom();
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
        setTitle("Formulario Clientes");
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

        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setToolTipText("");
        txtApellido.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtApellido.setEnabled(false);
        txtApellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtApellido.setPhColor(new java.awt.Color(0, 0, 0));
        txtApellido.setPlaceholder("Apellidos");
        txtApellido.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtApellido.setThemeTooltip(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setToolTipText("");
        txtCorreo.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtCorreo.setEnabled(false);
        txtCorreo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCorreo.setPhColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setPlaceholder("Correo");
        txtCorreo.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtCorreo.setThemeTooltip(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setToolTipText("");
        txtDireccion.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtDireccion.setEnabled(false);
        txtDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDireccion.setPhColor(new java.awt.Color(0, 0, 0));
        txtDireccion.setPlaceholder("Dirección");
        txtDireccion.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtDireccion.setThemeTooltip(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.setToolTipText("");
        txtCiudad.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtCiudad.setEnabled(false);
        txtCiudad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCiudad.setPhColor(new java.awt.Color(0, 0, 0));
        txtCiudad.setPlaceholder("Ciudad");
        txtCiudad.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtCiudad.setThemeTooltip(null);
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setToolTipText("");
        txtTelefono.setColorMaterial(new java.awt.Color(58, 159, 171));
        txtTelefono.setEnabled(false);
        txtTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTelefono.setPhColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setPlaceholder("Telefono");
        txtTelefono.setSelectionColor(new java.awt.Color(58, 159, 171));
        txtTelefono.setThemeTooltip(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtObservacion.setRows(5);
        txtObservacion.setToolTipText("");
        txtObservacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10), new java.awt.Color(58, 159, 171))); // NOI18N
        txtObservacion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtObservacion.setEnabled(false);
        txtObservacion.setSelectionColor(new java.awt.Color(58, 159, 171));
        jScrollPane2.setViewportView(txtObservacion);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosLayout.createSequentialGroup()
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosLayout.createSequentialGroup()
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosLayout.createSequentialGroup()
                            .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Tpo", "Nombres", "Apellidos", "Telefono", "Direccion", "Ciudad", "Correo", "Observacion"
            }
        ));
        TablaUsuario.setBackgoundHead(new java.awt.Color(58, 159, 171));
        TablaUsuario.setBackgoundHover(new java.awt.Color(58, 159, 171));
        TablaUsuario.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        TablaUsuario.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        TablaUsuario.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        TablaUsuario.setFontHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TablaUsuario.setFontRowHover(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        TablaUsuario.setFontRowSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        TablaUsuario.setSelectionBackground(new java.awt.Color(58, 159, 171));
        jScrollPane1.setViewportView(TablaUsuario);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jmenuacerca.setText("Acerca");
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

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

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
        JOptionPane.showMessageDialog(null, "Cliente Agregado Correctamente");
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
        txtApellido.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtCiudad.setText("");
        txtTelefono.setText("");
        txtObservacion.setText("");
    }

    public void limpiar() {
        setiar();
        //-----------
        cmbTipoDocumento.setEnabled(false);
        txtDocumento.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCiudad.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtObservacion.setEnabled(false);

        txtBuscar.requestFocus();
    }

    public void habilitar() {
        setiar();
        //-----------
        txtBuscar.setEnabled(false);
        cmbTipoDocumento.setEnabled(true);
        txtDocumento.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCiudad.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtObservacion.setEnabled(true);
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
        txtApellido.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCiudad.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtObservacion.setEnabled(false);
        //--------
        txtBuscar.requestFocus();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelFondo;
    public RSMaterialComponent.RSTableMetroCustom TablaUsuario;
    public javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    public RSMaterialComponent.RSComboBoxMaterial cmbTipoDocumento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuscar;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmenuacerca;
    public RSMaterialComponent.RSTextFieldMaterial txtApellido;
    public RSMaterialComponent.RSTextFieldMaterialIcon txtBuscar;
    public RSMaterialComponent.RSTextFieldMaterial txtCiudad;
    public RSMaterialComponent.RSTextFieldMaterial txtCorreo;
    public RSMaterialComponent.RSTextFieldMaterial txtDireccion;
    public RSMaterialComponent.RSTextFieldMaterial txtDocumento;
    public RSMaterialComponent.RSTextFieldMaterial txtNombre;
    public javax.swing.JTextArea txtObservacion;
    public RSMaterialComponent.RSTextFieldMaterial txtTelefono;
    // End of variables declaration//GEN-END:variables
}
