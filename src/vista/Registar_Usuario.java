package vista;

import controlador.Ctrl_Usuario;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author TOR
 */
public class Registar_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Registar_USuario
     */
    public Registar_Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_aceptar = new javax.swing.JButton();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_contrasena = new javax.swing.JTextField();
        Npmbre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Npmbre1 = new javax.swing.JLabel();
        Apellido2 = new javax.swing.JLabel();
        txt_fechaNacimiento = new javax.swing.JTextField();
        Apellido3 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        txt_Documento = new javax.swing.JTextField();
        Apellido4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registar Usuario");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        txt_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrasenaActionPerformed(evt);
            }
        });

        Npmbre.setText("Nombre");

        jLabel2.setText("Teléfono");

        Email.setText("Email");

        Apellido.setText("Apellido");

        jLabel3.setText("Contraseña");

        Apellido2.setText("FechaNac");

        txt_fechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaNacimientoActionPerformed(evt);
            }
        });

        Apellido3.setText("Genero");

        txt_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generoActionPerformed(evt);
            }
        });

        txt_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DocumentoActionPerformed(evt);
            }
        });

        Apellido4.setText("Documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Npmbre)
                            .addComponent(Email)
                            .addComponent(Apellido)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(Apellido2)
                            .addComponent(Apellido3)
                            .addComponent(Apellido4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Npmbre1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Npmbre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Npmbre))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Apellido))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email))
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel2))
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Apellido2)
                                    .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Apellido3)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Apellido4)))
                .addGap(18, 18, 18)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimpiarCampos() {

        txt_contrasena.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_Documento.setText("");
        txt_telefono.setText("");
        txt_fechaNacimiento.setText("");
        txt_genero.setText("");
        txt_email.setText("");
    }

    // Método para validar todos los campos( nombre, apellido, email,contraseña,telefono)->
    public void validarCampos() {
        boolean camposValidos = true; // Variable para seguir el estado de la validación
        StringBuilder mensajeError = new StringBuilder(); // StringBuilder para almacenar mensajes de error

        try {
            // Validar nombre y apellido
            if (txt_nombre.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Nombre está vacío\n");
                camposValidos = false;
            }
            if (txt_apellido.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Apellido está vacío.\n");
                camposValidos = false;
            }

            // Validar correo electrónico
            if (txt_email.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Correo Electrónico está vacío.\n");
                camposValidos = false;
            }

            // Validar documento de identificación
            if (txt_Documento.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Documento de Identificación está vacío.\n");
                camposValidos = false;
            }

            // Validar teléfono
            if (txt_telefono.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Teléfono está vacío.\n");
                camposValidos = false;
            }

            // Validar fecha de nacimiento
            if (txt_fechaNacimiento.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Fecha de Nacimiento está vacío.\n");
                camposValidos = false;
            }

            // Validar género
            if (txt_genero.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Género está vacío.\n");
                camposValidos = false;
            }

            // Validar contraseña
            if (txt_contrasena.getText().trim().isEmpty()) {
                mensajeError.append("- El campo Contraseña está vacío.\n");
                camposValidos = false;
            }

            // Si alguna validación falla, mostrar un mensaje único
            if (!camposValidos) {
                JOptionPane.showMessageDialog(this, "Por favor, corrija los siguientes campos:\n\n" + mensajeError.toString());
            } else {
                // Si todas las validaciones pasan, los campos son válidos
                System.out.println("Todos los campos son válidos.");

                // Obtener los valores de los campos de texto
                String correo = txt_email.getText();
                String contraseña = txt_contrasena.getText();
                String nombre = txt_nombre.getText();
                String apellido = txt_apellido.getText();
                String documento = txt_Documento.getText();
                String telefono = txt_telefono.getText();
                String fechaNacimientoUsuario = txt_fechaNacimiento.getText();
                String genero = txt_genero.getText();

                // Crear un objeto Usuario con los valores ingresados
               Usuario usuario = new Usuario(WIDTH, correo, contraseña, nombre, apellido, documento, nombre, apellido, fechaNacimientoUsuario);

                // Llamar al método para guardar el usuario en la base de datos
                Ctrl_Usuario controladorUsuario = new Ctrl_Usuario();
                controladorUsuario.guardarUsuario(usuario);

                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");

                // Limpiar los campos después de registrar el usuario
                LimpiarCampos();

                // Cerrar la ventana actual
                this.dispose();

                // Mostrar la ventana de inicio de sesión
                Login login = new Login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        validarCampos();
        LimpiarCampos();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrasenaActionPerformed

    private void txt_fechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaNacimientoActionPerformed

    private void txt_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_generoActionPerformed

    private void txt_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Apellido2;
    private javax.swing.JLabel Apellido3;
    private javax.swing.JLabel Apellido4;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Npmbre;
    private javax.swing.JLabel Npmbre1;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_Documento;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fechaNacimiento;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
