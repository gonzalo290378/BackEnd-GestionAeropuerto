
package formulario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        setLocationRelativeTo(null);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        credencialLabel = new JLabel();
        usuarioLabel = new JLabel();
        contraseniaLabel = new JLabel();
        txtNombre = new JTextField();
        btnSalir = new JButton();
        btnLogin = new JButton();
        txtPass = new JPasswordField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gestion Aeropuertos");
        setBackground(new Color(255, 255, 255));
        setResizable(false);
        setSize(new Dimension(800, 600));

        credencialLabel.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        credencialLabel.setText("- Escriba las Credenciales - ");

        usuarioLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        usuarioLabel.setText("Usuario");

        contraseniaLabel.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        contraseniaLabel.setText("Contraseña");

        txtNombre.setBackground(new Color(255, 255, 204));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPass.setBackground(new Color(255, 255, 204));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(credencialLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(usuarioLabel)
                .addGap(61, 61, 61)
                .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(contraseniaLabel)
                .addGap(32, 32, 32)
                .addComponent(txtPass, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnLogin)
                .addGap(17, 17, 17)
                .addComponent(btnSalir))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(credencialLabel)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioLabel)
                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(contraseniaLabel)
                    .addComponent(txtPass, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(btnSalir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLoginActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String nombre = txtNombre.getText();
        String pass = txtPass.getText();

        if (nombre.equals("admin") && pass.equals("admin")) {
            Principal ventana = new Principal();
            ventana.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Credenciales erroneas",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

   
       public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnLogin;
    private JButton btnSalir;
    private JLabel contraseniaLabel;
    private JLabel credencialLabel;
    private JTextField txtNombre;
    private JPasswordField txtPass;
    private JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}