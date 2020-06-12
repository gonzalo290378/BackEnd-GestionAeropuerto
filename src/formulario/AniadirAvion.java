package formulario;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.Avion;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilidades.MetodosSueltos;
import utilidades.VariablesGlobales;

public class AniadirAvion extends javax.swing.JDialog {

    public AniadirAvion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    MetodosSueltos.cargarAeropuertos (cmbAeropuertos);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agruparActivadoDesactivado = new javax.swing.ButtonGroup();
        modeloLabel = new javax.swing.JLabel();
        asientosLabel = new javax.swing.JLabel();
        velocidadMaximaLabel = new javax.swing.JLabel();
        rdbActivado = new javax.swing.JRadioButton();
        rdbDesactivado = new javax.swing.JRadioButton();
        txtVelocidad = new java.awt.TextField();
        txtModelo = new java.awt.TextField();
        txtAsientos = new java.awt.TextField();
        aeropuertoLabel = new javax.swing.JLabel();
        nuevoAeropuertoLabel = new javax.swing.JLabel();
        cmbAeropuertos = new javax.swing.JComboBox<>();
        btnGuardar = new java.awt.Button();
        btnCancelar = new java.awt.Button();

        setName("Form"); // NOI18N

        modeloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modeloLabel.setText("Modelo");
        modeloLabel.setName("modeloLabel"); // NOI18N

        asientosLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        asientosLabel.setText("Asientos");
        asientosLabel.setName("asientosLabel"); // NOI18N

        velocidadMaximaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        velocidadMaximaLabel.setText("Velocidad Maxima");
        velocidadMaximaLabel.setName("velocidadMaximaLabel"); // NOI18N

        agruparActivadoDesactivado.add(rdbActivado);
        rdbActivado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbActivado.setSelected(true);
        rdbActivado.setText("Activado");
        rdbActivado.setName("rdbActivado"); // NOI18N

        agruparActivadoDesactivado.add(rdbDesactivado);
        rdbDesactivado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbDesactivado.setText("Desactivado");
        rdbDesactivado.setName("rdbDesactivado"); // NOI18N
        rdbDesactivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDesactivadoActionPerformed(evt);
            }
        });

        txtVelocidad.setBackground(new java.awt.Color(255, 255, 153));
        txtVelocidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtVelocidad.setName("txtVelocidad"); // NOI18N
        txtVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadActionPerformed(evt);
            }
        });

        txtModelo.setBackground(new java.awt.Color(255, 255, 153));
        txtModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModelo.setName("txtModelo"); // NOI18N
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtAsientos.setBackground(new java.awt.Color(255, 255, 153));
        txtAsientos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAsientos.setName("txtAsientos"); // NOI18N
        txtAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsientosActionPerformed(evt);
            }
        });

        aeropuertoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aeropuertoLabel.setText("Aeropuerto");
        aeropuertoLabel.setName("aeropuertoLabel"); // NOI18N

        nuevoAeropuertoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nuevoAeropuertoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoAeropuertoLabel.setText("INGRESE UN NUEVO AVION");
        nuevoAeropuertoLabel.setName("nuevoAeropuertoLabel"); // NOI18N

        cmbAeropuertos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbAeropuertos.setName("cmbAeropuertos"); // NOI18N
        cmbAeropuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAeropuertosActionPerformed(evt);
            }
        });

        btnGuardar.setActionCommand("Guardar");
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGuardar.setLabel("Guardar");
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setActionCommand("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancelar.setLabel("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoAeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(rdbActivado))
                            .addComponent(velocidadMaximaLabel)
                            .addComponent(modeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asientosLabel)
                            .addComponent(aeropuertoLabel))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdbDesactivado)
                            .addComponent(cmbAeropuertos, 0, 319, Short.MAX_VALUE)
                            .addComponent(txtVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoAeropuertoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asientosLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAsientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(velocidadMaximaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbActivado)
                    .addComponent(rdbDesactivado))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aeropuertoLabel)
                    .addComponent(cmbAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbDesactivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDesactivadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbDesactivadoActionPerformed

    private void txtVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsientosActionPerformed
        //
    }//GEN-LAST:event_txtAsientosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String errores = "";

        String modelo = txtModelo.getText();
        String asientos = txtAsientos.getText();
        String velocidadMaxima = txtVelocidad.getText();
        boolean activado = rdbActivado.isSelected();

        if (modelo.isEmpty()) {
            errores += "El Modelo debe estar completado";
        }

        if (asientos.isEmpty()) {
            errores += "Los asientos no pueden estar vacios";
            if (!MetodosSueltos.validaNumeroEntero(asientos)) {
                errores += "Los asientos no tienen el formato correcto";

            }
        }

        if (velocidadMaxima.isEmpty()) {
            errores += "La velocidad maxima no puede estar vacia";
            if (!MetodosSueltos.validaNumeroEntero(velocidadMaxima)) {
                errores += "La velocidad Maxima no tiene el formato correcto";

            }
        }

        if (errores.isEmpty()) {

            int numAsientos = Integer.parseInt(asientos);
            double velocidad = Double.parseDouble(velocidadMaxima);

            Avion a = new Avion(modelo, numAsientos, velocidad);
            //Ahora este avion, ya existe en nuestra base?
            a.setActivado(activado);

            boolean existe = false;

            Aeropuerto auxAero = VariablesGlobales.aeropuertos.get(this.cmbAeropuertos.getSelectedIndex());

            for (Avion e : auxAero.getAviones()) {
                if (e.equals(a)) {
                    existe = true;
                }
            }

            if (!existe) {

                try {
                    //agregamos el avion al aeropuerto
                    auxAero.aniadirAvion(a);
                    MetodosSueltos.actualizarFichero();
                    JOptionPane.showMessageDialog(this, "El avion se ha añadido a este aeropuerto", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                } catch (IOException ex) {
                    Logger.getLogger(AniadirAvion.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                //el avion ya existe
                JOptionPane.showMessageDialog(this, "El avion ya existe en este aeropuerto", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(this, errores, "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbAeropuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAeropuertosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAeropuertosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aeropuertoLabel;
    private javax.swing.ButtonGroup agruparActivadoDesactivado;
    private javax.swing.JLabel asientosLabel;
    private java.awt.Button btnCancelar;
    private java.awt.Button btnGuardar;
    private javax.swing.JComboBox<String> cmbAeropuertos;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JLabel nuevoAeropuertoLabel;
    private javax.swing.JRadioButton rdbActivado;
    private javax.swing.JRadioButton rdbDesactivado;
    private java.awt.TextField txtAsientos;
    private java.awt.TextField txtModelo;
    private java.awt.TextField txtVelocidad;
    private javax.swing.JLabel velocidadMaximaLabel;
    // End of variables declaration//GEN-END:variables
}
