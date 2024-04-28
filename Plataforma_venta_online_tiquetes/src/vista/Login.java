/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Usuario;

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
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boton_accder = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setText("Usuario");

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

        boton_crear.setText("Crear");
        boton_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(boton_accder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_crear)))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_accder)
                    .addComponent(boton_crear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_accderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accderActionPerformed
        //this.Login();

        Usuario usuario = new Usuario();
        usuario.setNombre(txt_usuario.getText());
        usuario.setContraseña(txt_contraseña.getText());

        boolean camposValidos = true; // Variable para seguir el estado de la validación
        StringBuilder mensajeError = new StringBuilder(); // StringBuilder para almacenar mensajes de error

        try {
            if (usuario.getNombre().trim().isEmpty()) {
                mensajeError.append("- El campo Usuario está vacío\n");
                camposValidos = false;
            }

            if (usuario.getContraseña().trim().isEmpty()) {
                mensajeError.append("- El campo Contraseña está vacío\n");
                camposValidos = false;
            }

            if (!camposValidos) {
                JOptionPane.showMessageDialog(this, "Por favor, corrija los siguientes campos:\n\n" + mensajeError.toString());
            } else {
                Ctrl_Usuario ctrl_Usuario= new  Ctrl_Usuario();
                boolean usuarioExistente = ctrl_Usuario.existeUsuario(usuario);
                if (usuarioExistente) {
                    // El usuario existe en la base de datos, ahora puedes intentar iniciar sesión
                    boolean inicioSesionExitoso = ctrl_Usuario.existeUsuario(usuario);
                    if (inicioSesionExitoso) {
                        this.dispose();
                        view_Menu viewMenu= new view_Menu();
                        viewMenu.setVisible(true);
                        // Inicio de sesión exitoso
                    } else {
                        // Contraseña incorrecta
                        JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
                    }
                } else {
                    // Usuario no encontrado en la base de datos
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_boton_accderActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
        this.dispose();
        Registar_Usuario registar_Usuario= new Registar_Usuario();
        registar_Usuario.setVisible(true);
        registar_Usuario.setLocationRelativeTo(null);
        registar_Usuario.setResizable(false);
    }//GEN-LAST:event_boton_crearActionPerformed

    //cuando se esta en el txt contraseña se puee dar enter y se hace la validacion->
    private void txt_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyPressed
        if(evt.getExtendedKeyCode()==KeyEvent.VK_ENTER){
            boton_accder.doClick();
        }

    }//GEN-LAST:event_txt_contraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_accder;
    private javax.swing.JButton boton_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    
}
