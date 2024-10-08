/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.Menu_Principal;

/**
 *
 * @author TOR
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        TextPrompt lc = new TextPrompt("Ingresa su Correo", txt_correo);
        TextPrompt lu = new TextPrompt("Ingresa su Contraseña", txt_contraseña);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_correo = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boton_accder = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);

        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyPressed(evt);
            }
        });

        boton_accder.setText("Acceder");
        boton_accder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_accder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accderActionPerformed(evt);
            }
        });

        boton_crear.setText("Crear Usuario");
        boton_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_accder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_crear))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_crear)
                    .addComponent(boton_accder))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_accderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accderActionPerformed
        String email = txt_correo.getText();
        String password = txt_contraseña.getText();

        Ctrl_Usuario userService = new Ctrl_Usuario();
        Usuario user = userService.ingresoUsuario(email, password);

        if (user != null) {
            this.dispose();
            JOptionPane.showMessageDialog(this, "Inicio de Sesion Exitoso");
            Menu_Principal mn = new Menu_Principal();
            mn.setVisible(true);
            mn.setLocationRelativeTo(null);

        } else {
            JOptionPane.showMessageDialog(this, "Correo o Contraseña Incorrecto.");
        }
    }//GEN-LAST:event_boton_accderActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
        this.dispose();
        Registar_Usuario registar_Usuario = new Registar_Usuario();
        registar_Usuario.setVisible(true);
        registar_Usuario.setLocationRelativeTo(null);
        registar_Usuario.setResizable(false);
    }//GEN-LAST:event_boton_crearActionPerformed

    //cuando se esta en el txt contraseña se puee dar enter y se hace la validacion->
    private void txt_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            boton_accder.doClick();
        }

    }//GEN-LAST:event_txt_contraseñaKeyPressed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_accder;
    private javax.swing.JButton boton_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    // End of variables declaration//GEN-END:variables

}
