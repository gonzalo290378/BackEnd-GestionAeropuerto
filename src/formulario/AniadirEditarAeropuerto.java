package formulario;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.AeropuertoPublico;
import clases.Direccion;
import java.io.IOException;
import javax.swing.JOptionPane;
import utilidades.MetodosSueltos;

public class AniadirEditarAeropuerto extends javax.swing.JDialog {

    private Aeropuerto aeropuertoEditar;

    
    public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        agruparPrivadoPublico.add(rdbPrivado);
        agruparPrivadoPublico.add(rdbPublico);
        setLocationRelativeTo(null);
    }

    public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal, Aeropuerto aeropuertoEditar) {
        super(parent, modal);
        initComponents();
        agruparPrivadoPublico.add(rdbPrivado);
        agruparPrivadoPublico.add(rdbPublico);
        setLocationRelativeTo(null);
        this.aeropuertoEditar = aeropuertoEditar;
        cargarDatos();
    }

    private void cargarDatos() {
        txtNombre.setText(aeropuertoEditar.getNombre());
        txtPais.setText(aeropuertoEditar.getDireccion().getPais());
        txtCalle.setText(aeropuertoEditar.getDireccion().getCalle());
        txtCiudad.setText(aeropuertoEditar.getDireccion().getCiudad());
        txtNumero.setText(aeropuertoEditar.getDireccion().getNumero() + "");
        txtAnioInauguracion.setText((aeropuertoEditar.getAnioInauguracion()) + "");
        txtCapacidad.setText(aeropuertoEditar.getCapacidad() + "");

        if (aeropuertoEditar instanceof AeropuertoPrivado) {
            AeropuertoPrivado aux = (AeropuertoPrivado) aeropuertoEditar;

            txtNumSocios.setText(aux.getNumSocios() + "");
            rdbPrivado.setSelected(true);

            txtFinanciacion.setEnabled(false);
            txtDiscapacitados.setEnabled(false);
            txtNumSocios.setEnabled(true);

        } else {
            AeropuertoPublico aux = (AeropuertoPublico) aeropuertoEditar;

            txtFinanciacion.setText(aux.getFinanciacion() + "");
            txtDiscapacitados.setText(aux.getNumTrabajadoresDiscapacitados() + "");
            rdbPublico.setSelected(true);

            txtFinanciacion.setEnabled(true);
            txtDiscapacitados.setEnabled(true);
            txtNumSocios.setEnabled(false);
        }

        rdbPrivado.setEnabled(false);
        rdbPublico.setEnabled(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agruparPrivadoPublico = new javax.swing.ButtonGroup();
        nuevoAeropuertoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        paisLabel = new javax.swing.JLabel();
        numeroCalleLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        calleLabel = new javax.swing.JLabel();
        anioInauguracionLabel = new javax.swing.JLabel();
        capacidadLabel = new javax.swing.JLabel();
        financiacionLabel = new javax.swing.JLabel();
        discapacitadosLabel = new javax.swing.JLabel();
        numeroSociosLabel = new javax.swing.JLabel();
        rdbPublico = new javax.swing.JRadioButton();
        rdbPrivado = new javax.swing.JRadioButton();
        txtNumSocios = new java.awt.TextField();
        txtNombre = new java.awt.TextField();
        txtPais = new java.awt.TextField();
        txtCalle = new java.awt.TextField();
        txtNumero = new java.awt.TextField();
        txtCiudad = new java.awt.TextField();
        txtAnioInauguracion = new java.awt.TextField();
        txtCapacidad = new java.awt.TextField();
        txtFinanciacion = new java.awt.TextField();
        txtDiscapacitados = new java.awt.TextField();
        btnCancelar = new java.awt.Button();
        btnGuardar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        nuevoAeropuertoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nuevoAeropuertoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoAeropuertoLabel.setText("INGRESE UN NUEVO AEROPUERTO");

        nombreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreLabel.setText("Nombre");

        paisLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paisLabel.setText("Pais");

        numeroCalleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroCalleLabel.setText("Numero de Calle");

        ciudadLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ciudadLabel.setText("Ciudad");

        calleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calleLabel.setText("Calle");

        anioInauguracionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anioInauguracionLabel.setText("Año de Inauguracion");

        capacidadLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        capacidadLabel.setText("Capacidad");

        financiacionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        financiacionLabel.setText("Financiacion");

        discapacitadosLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        discapacitadosLabel.setText("Discapacitados");

        numeroSociosLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroSociosLabel.setText("Numero de Socios");

        agruparPrivadoPublico.add(rdbPublico);
        rdbPublico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbPublico.setSelected(true);
        rdbPublico.setText("Publico");
        rdbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPublicoActionPerformed(evt);
            }
        });

        agruparPrivadoPublico.add(rdbPrivado);
        rdbPrivado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbPrivado.setText("Privado");
        rdbPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPrivadoActionPerformed(evt);
            }
        });

        txtNumSocios.setBackground(new java.awt.Color(255, 255, 153));

        txtNombre.setBackground(new java.awt.Color(255, 255, 153));
       
        txtPais.setBackground(new java.awt.Color(255, 255, 153));

        txtCalle.setBackground(new java.awt.Color(255, 255, 153));

        txtNumero.setBackground(new java.awt.Color(255, 255, 153));

        txtCiudad.setBackground(new java.awt.Color(255, 255, 153));

        txtAnioInauguracion.setBackground(new java.awt.Color(255, 255, 153));

        txtCapacidad.setBackground(new java.awt.Color(255, 255, 153));

        txtFinanciacion.setBackground(new java.awt.Color(255, 255, 153));

        txtDiscapacitados.setBackground(new java.awt.Color(255, 255, 153));

        btnCancelar.setActionCommand("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancelar.setLabel("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setActionCommand("Guardar");
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGuardar.setLabel("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbPrivado)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(numeroSociosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nuevoAeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(financiacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discapacitadosLabel)))
                    .addComponent(rdbPublico))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 169, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(calleLabel)
                            .addGap(216, 216, 216)
                            .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(numeroCalleLabel)
                            .addGap(111, 111, 111)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(ciudadLabel)
                            .addGap(198, 198, 198)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(anioInauguracionLabel)
                            .addGap(69, 69, 69)
                            .addComponent(txtAnioInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(capacidadLabel)
                            .addGap(167, 167, 167)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(paisLabel)
                                    .addGap(223, 223, 223))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nombreLabel)
                                    .addGap(188, 188, 188)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addComponent(txtFinanciacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiscapacitados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoAeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(rdbPublico)
                .addGap(29, 29, 29)
                .addComponent(financiacionLabel)
                .addGap(32, 32, 32)
                .addComponent(discapacitadosLabel)
                .addGap(40, 40, 40)
                .addComponent(rdbPrivado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroSociosLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumSocios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 140, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreLabel)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paisLabel)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(calleLabel)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numeroCalleLabel)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ciudadLabel)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(anioInauguracionLabel)
                        .addComponent(txtAnioInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(capacidadLabel)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(80, 80, 80)
                    .addComponent(txtFinanciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(txtDiscapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 232, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPublicoActionPerformed
        txtFinanciacion.setEnabled(true);
        txtDiscapacitados.setEnabled(true);
        txtNumSocios.setEnabled(false);
    }//GEN-LAST:event_rdbPublicoActionPerformed

    private void rdbPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPrivadoActionPerformed
        txtFinanciacion.setEnabled(false);
        txtDiscapacitados.setEnabled(false);
        txtNumSocios.setEnabled(true);
    }//GEN-LAST:event_rdbPrivadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String errores = "";

        String nombre = this.txtNombre.getText();
        String pais = this.txtPais.getText();
        String calle = this.txtCalle.getText();
        String numero = this.txtNumero.getText();
        String ciudad = this.txtCiudad.getText();
        String anioInauguracion = this.txtAnioInauguracion.getText();
        String capacidad = this.txtCapacidad.getText();

        String financiacion = "", discapacitados = "", numSocios = "";

        if (nombre.isEmpty()) {
            errores += " - El nombre no puede estar vacio \n";
        }

        if (pais.isEmpty()) {
            errores += " - El pais no puede estar vacio \n";
        }

        if (calle.isEmpty()) {
            errores += " - La calle no puede estar vacia \n";
        }

        if (numero.isEmpty()) {
            errores += " - El numero de calle no puede estar vacia \n";
        } else {
            if (!MetodosSueltos.validaNumeroEntero(numero)) {
                errores += " - El numero no tiene el formato correcto \n";
            }
        }

        if (ciudad.isEmpty()) {
            errores += " - La ciudad no puede estar vacia \n";
        }

        if (anioInauguracion.isEmpty()) {
            errores += " - El año de inauguracion puede estar vacia \n";
        } else {
            if (!MetodosSueltos.validaNumeroEntero(anioInauguracion)) {
                errores += " - El año de inauguracion no tiene el formato correcto \n";
            }
        }

        if (capacidad.isEmpty()) {
            errores += " - La capacidad no puede estar vacia \n";
        } else {
            if (!MetodosSueltos.validaNumeroEntero(capacidad)) {
                errores += " - La capacidad no tiene el formato correcto \n";
            }
        }

        if (rdbPublico.isSelected()) {

            financiacion = txtFinanciacion.getText();
            discapacitados = txtDiscapacitados.getText();

            if (financiacion.isEmpty()) {
                errores += " - La financiacion no puede estar vacia \n";
            } else {
                if (!MetodosSueltos.validaNumeroReal(financiacion)) {
                    errores += " - La financiacion no tiene el formato correcto \n";
                }
            }

            if (discapacitados.isEmpty()) {
                errores += " - El numero de discapacitados no puede estar vacio \n";
            } else {
                if (!MetodosSueltos.validaNumeroEntero(discapacitados)) {
                    errores += " - El numero de discapacitados no tiene el formato correcto \n";
                }
            }
        } else {

            numSocios = txtNumSocios.getText();

            if (numSocios.isEmpty()) {
                errores += " - El numero de socios no puede estar vacio \n";
            } else {
                if (!MetodosSueltos.validaNumeroEntero(numSocios)) {
                    errores += " - El numero de socios no tiene el formato correcto \n";
                }
            }
        }

        if (errores.isEmpty()) {

            int numeroAeropuerto = Integer.parseInt(numero);
            int anioInauguracioAeropuerto = Integer.parseInt(anioInauguracion);
            int capacidadAeropuerto = Integer.parseInt(capacidad);

            Direccion dir = new Direccion(pais, calle, numeroAeropuerto, ciudad);

            if (aeropuertoEditar != null) { //Si es distinto a null es que estoy editando

                aeropuertoEditar.setNombre(nombre);
                aeropuertoEditar.setDireccion(dir);
                aeropuertoEditar.setCapacidad(capacidadAeropuerto);
                aeropuertoEditar.setAnioInauguracion(anioInauguracioAeropuerto);

                if (rdbPublico.isSelected()) {
                    double financiacionAeropuerto = Double.parseDouble(financiacion);
                    int discapacitadosAeropuerto = Integer.parseInt(discapacitados);

                    AeropuertoPublico aPublico = (AeropuertoPublico) aeropuertoEditar;
                    aPublico.setFinanciacion(financiacionAeropuerto);
                    aPublico.setNumTrabajadoresDiscapacitados(discapacitadosAeropuerto);

                    aeropuertoEditar = aPublico;

                } else {
                    int numSociosAeropuerto = Integer.parseInt(numSocios);
                    AeropuertoPrivado aPrivado = (AeropuertoPrivado) aeropuertoEditar;
                    aPrivado.setNumSocios(numSociosAeropuerto);

                    aeropuertoEditar = aPrivado;

                }

                try {
                    MetodosSueltos.actualizarFichero();

                    JOptionPane.showMessageDialog(this,
                            "Aeropuerto creado correctamente",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {// Estoy creando{
                Aeropuerto aux;

                if (rdbPublico.isSelected()) {
                    double financiacionAeropuerto = Double.parseDouble(financiacion);
                    int discapacitadosAeropuerto = Integer.parseInt(discapacitados);

                    aux = new AeropuertoPublico(financiacionAeropuerto,
                            discapacitadosAeropuerto,
                            nombre,
                            dir,
                            anioInauguracioAeropuerto,
                            capacidadAeropuerto);

                } else {
                    int numSociosAeropuerto = Integer.parseInt(numSocios);
                    aux = new AeropuertoPrivado(numSociosAeropuerto,
                            nombre,
                            dir,
                            anioInauguracioAeropuerto,
                            capacidadAeropuerto);
                }

                try {
                    MetodosSueltos.escribirAeropuerto(aux, true);

                    JOptionPane.showMessageDialog(this,
                            "Aeropuerto creado correctamente",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

        } else {
            JOptionPane.showMessageDialog(this,
                    errores,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup agruparPrivadoPublico;
    private javax.swing.JLabel anioInauguracionLabel;
    private java.awt.Button btnCancelar;
    private java.awt.Button btnGuardar;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JLabel capacidadLabel;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel discapacitadosLabel;
    private javax.swing.JLabel financiacionLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nuevoAeropuertoLabel;
    private javax.swing.JLabel numeroCalleLabel;
    private javax.swing.JLabel numeroSociosLabel;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JRadioButton rdbPrivado;
    private javax.swing.JRadioButton rdbPublico;
    private java.awt.TextField txtAnioInauguracion;
    private java.awt.TextField txtCalle;
    private java.awt.TextField txtCapacidad;
    private java.awt.TextField txtCiudad;
    private java.awt.TextField txtDiscapacitados;
    private java.awt.TextField txtFinanciacion;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtNumSocios;
    private java.awt.TextField txtNumero;
    private java.awt.TextField txtPais;
    // End of variables declaration//GEN-END:variables
}
