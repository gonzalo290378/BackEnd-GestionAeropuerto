package formulario;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import clases.AeropuertoPublico;
import clases.Direccion;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import utilidades.MetodosSueltos;
import utilidades.VariablesGlobales;

public class Principal extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    private final int PRIVADO = 1;
    private final int PUBLICO = 2;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodosSueltos.leerAeropuertos(); // Relleno los aeropuertos del fichero en la lista
        cargarDatos(PRIVADO, "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new MenuBar();
        agruparPrivadoPublico = new ButtonGroup();
        jScrollPane1 = new JScrollPane();
        tblAeropuertos = new JTable();
        rdbPrivado = new JRadioButton();
        rdbPublico = new JRadioButton();
        txtFiltroNombre = new JTextField();
        escribeNombreLabel = new JLabel();
        aeropuetosMenu = new JMenuBar();
        aeropuertoMenu = new JMenu();
        aniadirAeropuertoMenu = new JMenuItem();
        editarMenu = new JMenuItem();
        borrarAeropuertoMenu = new JMenuItem();
        ganaciasMenu = new JMenuItem();
        mostrarInformacionMenu = new JMenuItem();
        avionesMenu = new JMenu();
        aniadirAvionMenu = new JMenuItem();
        activarDesactivarMenu = new JMenuItem();
        borrarAvionMenu = new JMenuItem();
        salirMenu = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblAeropuertos.setModel(new DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAeropuertos);

        agruparPrivadoPublico.add(rdbPrivado);
        rdbPrivado.setSelected(true);
        rdbPrivado.setText("Aeropuertos Privados");
        rdbPrivado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rdbPrivadoActionPerformed(evt);
            }
        });

        agruparPrivadoPublico.add(rdbPublico);
        rdbPublico.setText("Aeropuertos Publicos");
        rdbPublico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rdbPublicoActionPerformed(evt);
            }
        });

        txtFiltroNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtFiltroNombreActionPerformed(evt);
            }
        });
        txtFiltroNombre.addKeyListener(new KeyAdapter() {
           
            public void keyReleased(KeyEvent evt) {
                txtFiltroNombreKeyReleased(evt);
            }
        });

        escribeNombreLabel.setText("Escribe un nombre:");

        aeropuertoMenu.setText("Aeropuertos");

        aniadirAeropuertoMenu.setText("Añadir...");
        aniadirAeropuertoMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aniadirAeropuertoMenuActionPerformed(evt);
            }
        });
        aeropuertoMenu.add(aniadirAeropuertoMenu);

        editarMenu.setText("Editar...");
        editarMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editarMenuActionPerformed(evt);
            }
        });
        aeropuertoMenu.add(editarMenu);

        borrarAeropuertoMenu.setText("Borrar");
        borrarAeropuertoMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrarAeropuertoMenuActionPerformed(evt);
            }
        });
        aeropuertoMenu.add(borrarAeropuertoMenu);

        ganaciasMenu.setText("Ganancias");
        ganaciasMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ganaciasMenuActionPerformed(evt);
            }
        });
        aeropuertoMenu.add(ganaciasMenu);

        mostrarInformacionMenu.setText("Mostrar Informacion");
        mostrarInformacionMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mostrarInformacionMenuActionPerformed(evt);
            }
        });
        aeropuertoMenu.add(mostrarInformacionMenu);

        aeropuetosMenu.add(aeropuertoMenu);

        avionesMenu.setText("Aviones");

        aniadirAvionMenu.setText("Añadir...");
        aniadirAvionMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aniadirAvionMenuActionPerformed(evt);
            }
        });
        avionesMenu.add(aniadirAvionMenu);

        activarDesactivarMenu.setText("Activar/Desactivar");
        activarDesactivarMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                activarDesactivarMenuActionPerformed(evt);
            }
        });
        avionesMenu.add(activarDesactivarMenu);

        borrarAvionMenu.setText("Borrar...");
        borrarAvionMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrarAvionMenuActionPerformed(evt);
            }
        });
        avionesMenu.add(borrarAvionMenu);

        aeropuetosMenu.add(avionesMenu);

        salirMenu.setText("Salir");
        aeropuetosMenu.add(salirMenu);

        setJMenuBar(aeropuetosMenu);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbPrivado)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbPublico)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(escribeNombreLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltroNombre, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPrivado)
                    .addComponent(rdbPublico)
                    .addComponent(txtFiltroNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(escribeNombreLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos(int tipo, String coincidenciaNombre) {

        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblAeropuertos.setModel(modeloTabla);

        int numColumnas = 0;
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Pais");
        modeloTabla.addColumn("Numero");
        modeloTabla.addColumn("Calle");
        modeloTabla.addColumn("Ciudad");
        modeloTabla.addColumn("Año");
        modeloTabla.addColumn("Capacidad");

        if (tipo == PRIVADO) {
            modeloTabla.addColumn("Socios");
            numColumnas = 9;

        } else {
            modeloTabla.addColumn("Financiacion");
            modeloTabla.addColumn("Discapacitados");
            numColumnas = 10;

        }

        tblAeropuertos.getColumnModel().getColumn(0).setPreferredWidth(20); //CON ESTA LINEA ADAPTAMOS EL ANCHO DE LA COLUMNA

        Object[] fila;

        for (Aeropuerto aux : VariablesGlobales.aeropuertos) {
            if (aux.getNombre().toLowerCase().contains(coincidenciaNombre.toLowerCase())) {

                fila = new Object[numColumnas];
                Direccion direccion = aux.getDireccion();
                fila[0] = aux.getId();
                fila[1] = aux.getNombre();
                fila[2] = direccion.getPais();
                fila[3] = direccion.getNumero();
                fila[4] = direccion.getCalle();
                fila[5] = direccion.getCiudad();
                fila[6] = aux.getAnioInauguracion();
                fila[7] = aux.getCapacidad();

                if (tipo == PRIVADO && aux instanceof AeropuertoPrivado) {
                    AeropuertoPrivado aeropuertoPrivado = (AeropuertoPrivado) aux;
                    fila[8] = aeropuertoPrivado.getNumSocios();
                    modeloTabla.addRow(fila);

                } else if (tipo == PUBLICO && aux instanceof AeropuertoPublico) {
                    AeropuertoPublico aPublico = (AeropuertoPublico) aux;
                    fila[8] = aPublico.getFinanciacion();
                    fila[9] = aPublico.getNumTrabajadoresDiscapacitados();
                    modeloTabla.addRow(fila);

                }

            }

        }

    }
    private void borrarAeropuertoMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_borrarAeropuertoMenuActionPerformed
        // TODO add your handling code here:
        if (tblAeropuertos.getSelectedRow() != -1) {

            int eleccion = JOptionPane.showConfirmDialog(this, "Quieres borrar el aeropuerto?", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (eleccion == JOptionPane.YES_OPTION) {
                int fila = tblAeropuertos.getSelectedRow(); //GUARDA QUE FILA FUE SELECCIONADA

                int id = (int) tblAeropuertos.getValueAt(fila, 0); //EVALUA LA FILA Y LA COLUMNA, Y COMO LA FILA ME LA DA LA LINEA ANTERIOR, Y LA COLUMNA ES 0, YA QUE ESTAMOS EVALUANDO EL ID
                Aeropuerto aeropuerto = buscarAeropuerto(id);

                VariablesGlobales.aeropuertos.remove(aeropuerto);

                try {
                    MetodosSueltos.actualizarFichero();

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (rdbPrivado.isSelected()) {
                    cargarDatos(PRIVADO, txtFiltroNombre.getText());

                } else {
                    cargarDatos(PUBLICO, txtFiltroNombre.getText());
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_borrarAeropuertoMenuActionPerformed

    private void ganaciasMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ganaciasMenuActionPerformed
        // TODO add your handling code here:
        if (tblAeropuertos.getSelectedRow() != -1) {//TE DICE SI HAY UNA FILA SELECCIONADA. SI DEVUELVE -1 ES PORQUE NO HAY NADA SELECCIONADO

            int fila = tblAeropuertos.getSelectedRow(); //GUARDA QUE FILA FUE SELECCIONADA

            int id = (int) tblAeropuertos.getValueAt(fila, 0); //EVALUA LA FILA Y LA COLUMNA, Y COMO LA FILA ME LA DA LA LINEA ANTERIOR, Y LA COLUMNA ES 0, YA QUE ESTAMOS EVALUANDO EL ID
            Aeropuerto aeropuerto = buscarAeropuerto(id);

            String gananciasText = JOptionPane.showInputDialog(this, "Introduce las ganancias", "Introducir", JOptionPane.INFORMATION_MESSAGE);

            if (MetodosSueltos.validaNumeroReal(gananciasText)) {
                double ganancias = Double.parseDouble(gananciasText);
                JOptionPane.showMessageDialog(this, aeropuerto.gananciasTotales(ganancias), "Ganancia", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "La ganancia introducida no tiene el formato correcto", "Error", JOptionPane.INFORMATION_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ganaciasMenuActionPerformed

    private void mostrarInformacionMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_mostrarInformacionMenuActionPerformed

        if (tblAeropuertos.getSelectedRow() != -1) {//TE DICE SI HAY UNA FILA SELECCIONADA. SI DEVUELVE -1 ES PORQUE NO HAY NADA SELECCIONADO

            int fila = tblAeropuertos.getSelectedRow(); //GUARDA QUE FILA FUE SELECCIONADA

            int id = (int) tblAeropuertos.getValueAt(fila, 0); //EVALUA LA FILA Y LA COLUMNA, Y COMO LA FILA ME LA DA LA LINEA ANTERIOR, Y LA COLUMNA ES 0, YA QUE ESTAMOS EVALUANDO EL ID
            Aeropuerto aeropuerto = buscarAeropuerto(id);

            JOptionPane.showMessageDialog(this, aeropuerto.toString(), "Informacion", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_mostrarInformacionMenuActionPerformed

    private void aniadirAeropuertoMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aniadirAeropuertoMenuActionPerformed

        AniadirEditarAeropuerto ventana = new AniadirEditarAeropuerto(this, true);
        ventana.setVisible(true);
        if (rdbPrivado.isSelected()) {
            cargarDatos(PRIVADO, txtFiltroNombre.getText());

        } else {
            cargarDatos(PUBLICO, txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_aniadirAeropuertoMenuActionPerformed

    private void aniadirAvionMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aniadirAvionMenuActionPerformed
        if (VariablesGlobales.aeropuertos.size() > 0) {
            AniadirAvion ventana = new AniadirAvion(this, true);
            ventana.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay aeropuertos a los que añadir aviones", "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_aniadirAvionMenuActionPerformed

    private void editarMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editarMenuActionPerformed
        if (tblAeropuertos.getSelectedRow() != -1) {//TE DICE SI HAY UNA FILA SELECCIONADA. SI DEVUELVE -1 ES PORQUE NO HAY NADA SELECCIONADO

            int fila = tblAeropuertos.getSelectedRow(); //GUARDA QUE FILA FUE SELECCIONADA

            int id = (int) tblAeropuertos.getValueAt(fila, 0); //EVALUA LA FILA Y LA COLUMNA, Y COMO LA FILA ME LA DA LA LINEA ANTERIOR, Y LA COLUMNA ES 0, YA QUE ESTAMOS EVALUANDO EL ID
            Aeropuerto aeropuertoEditar = buscarAeropuerto(id);

            AniadirEditarAeropuerto ventana = new AniadirEditarAeropuerto(this, true, aeropuertoEditar);
            ventana.setVisible(true);
            if (rdbPrivado.isSelected()) {
                cargarDatos(PRIVADO, txtFiltroNombre.getText());

            } else {
                cargarDatos(PUBLICO, txtFiltroNombre.getText());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarMenuActionPerformed

    private void rdbPrivadoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rdbPrivadoActionPerformed
        cargarDatos(PRIVADO, txtFiltroNombre.getText());
    }//GEN-LAST:event_rdbPrivadoActionPerformed

    private void rdbPublicoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rdbPublicoActionPerformed
        if (rdbPrivado.isSelected()) {
            cargarDatos(PRIVADO, txtFiltroNombre.getText());

        } else {
            cargarDatos(PUBLICO, txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_rdbPublicoActionPerformed


    private void txtFiltroNombreActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtFiltroNombreActionPerformed
        cargarDatos(PUBLICO, txtFiltroNombre.getText());

    }//GEN-LAST:event_txtFiltroNombreActionPerformed

    private void txtFiltroNombreKeyReleased(KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyReleased
        if (rdbPrivado.isSelected()) {
            cargarDatos(PRIVADO, txtFiltroNombre.getText());

        } else {
            cargarDatos(PUBLICO, txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_txtFiltroNombreKeyReleased

    private void activarDesactivarMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_activarDesactivarMenuActionPerformed
        // TODO add your handling code here:
        if (VariablesGlobales.aeropuertos.size() > 0) {
            GestionarAviones ventana = new GestionarAviones(this, true, true);
            ventana.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay aeropuertos", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_activarDesactivarMenuActionPerformed

    private void borrarAvionMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_borrarAvionMenuActionPerformed
        if (VariablesGlobales.aeropuertos.size() > 0) {
            GestionarAviones ventana = new GestionarAviones(this, true, false);
            ventana.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay aeropuertos", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_borrarAvionMenuActionPerformed

    public Aeropuerto buscarAeropuerto(int id) {
        Aeropuerto aeropuerto = null;
        for (Aeropuerto e : VariablesGlobales.aeropuertos) {
            if (e.getId() == id) {
                aeropuerto = e;
            }
        }

        return aeropuerto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem activarDesactivarMenu;
    private JMenu aeropuertoMenu;
    private JMenuBar aeropuetosMenu;
    private ButtonGroup agruparPrivadoPublico;
    private JMenuItem aniadirAeropuertoMenu;
    private JMenuItem aniadirAvionMenu;
    private JMenu avionesMenu;
    private JMenuItem borrarAeropuertoMenu;
    private JMenuItem borrarAvionMenu;
    private JMenuItem editarMenu;
    private JLabel escribeNombreLabel;
    private JMenuItem ganaciasMenu;
    private JScrollPane jScrollPane1;
    private MenuBar menuBar;
    private JMenuItem mostrarInformacionMenu;
    private JRadioButton rdbPrivado;
    private JRadioButton rdbPublico;
    private JMenu salirMenu;
    private JTable tblAeropuertos;
    private JTextField txtFiltroNombre;
    // End of variables declaration//GEN-END:variables
}
