/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import static vista.InternalFrame_GestionarEmpleado.tabel_GestionEmpleado;

/**
 *
 * @author TOR
 */
public class InternalFrame_GestionarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrame_GestionarUsuarios
     */
    private int idEmpleado;

    public InternalFrame_GestionarEmpleado() {
        initComponents();
        this.cargartablaClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondoGestionarUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_GestionEmpleado = new javax.swing.JTable();
        panelGestionUsuario = new javax.swing.JPanel();
        mostrar_mostrarDatos = new javax.swing.JPanel();
        label_nombreCliente = new javax.swing.JLabel();
        label_apellidoCliente = new javax.swing.JLabel();
        txt_idCliente = new javax.swing.JTextField();
        txt_apellido_Cliente = new javax.swing.JTextField();
        label_documentoIdentidadCliente = new javax.swing.JLabel();
        label_correoCliente = new javax.swing.JLabel();
        txt_documentoIdentidad_Cliente = new javax.swing.JTextField();
        txt_correo_Cliente = new javax.swing.JTextField();
        label_dirreción = new javax.swing.JLabel();
        txt_dirrecion_Cliente = new javax.swing.JTextField();
        label_nombreCliente1 = new javax.swing.JLabel();
        txt_telefonoCliente = new javax.swing.JTextField();
        label_nombreCliente2 = new javax.swing.JLabel();
        txt_nombre_Cliente = new javax.swing.JTextField();
        botton_eliminarCliente = new javax.swing.JButton();
        botton_actualizar_datosCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_IdUsuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondoGestionarUsuarios.setBackground(java.awt.Color.white);
        panel_fondoGestionarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_GestionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabel_GestionEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabel_GestionEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellido", "Documento Identidad", "correo", "Dirreción", "Teléfono", "ID Usuario"
            }
        ));
        jScrollPane1.setViewportView(tabel_GestionEmpleado);

        panel_fondoGestionarUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 160));

        panelGestionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelGestionUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_fondoGestionarUsuarios.add(panelGestionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 890, 80));

        mostrar_mostrarDatos.setBackground(new java.awt.Color(255, 255, 255));

        label_nombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_nombreCliente.setText("ID Nombre");

        label_apellidoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_apellidoCliente.setText("Apellido");

        label_documentoIdentidadCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_documentoIdentidadCliente.setText("Documento ");

        label_correoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_correoCliente.setText("Correo");

        txt_documentoIdentidad_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoIdentidad_ClienteActionPerformed(evt);
            }
        });

        label_dirreción.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_dirreción.setText("Dirección");

        label_nombreCliente1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_nombreCliente1.setText("Teléfono");

        txt_telefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoClienteActionPerformed(evt);
            }
        });

        label_nombreCliente2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        label_nombreCliente2.setText("Nombre");

        botton_eliminarCliente.setText("Eliminar");
        botton_eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_eliminarClienteActionPerformed(evt);
            }
        });

        botton_actualizar_datosCliente.setText("Actualizar");
        botton_actualizar_datosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_actualizar_datosClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Usuario");

        txt_IdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrar_mostrarDatosLayout = new javax.swing.GroupLayout(mostrar_mostrarDatos);
        mostrar_mostrarDatos.setLayout(mostrar_mostrarDatosLayout);
        mostrar_mostrarDatosLayout.setHorizontalGroup(
            mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nombreCliente)
                            .addComponent(label_documentoIdentidadCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_documentoIdentidad_Cliente)
                            .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_nombreCliente1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nombreCliente2)
                            .addComponent(label_correoCliente))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addComponent(txt_nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_apellidoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellido_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                        .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_IdUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correo_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(label_dirreción)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dirrecion_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(290, 290, 290))
            .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(botton_actualizar_datosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botton_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mostrar_mostrarDatosLayout.setVerticalGroup(
            mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrar_mostrarDatosLayout.createSequentialGroup()
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombreCliente2)
                    .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_apellidoCliente)
                        .addComponent(txt_apellido_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_nombreCliente)
                        .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_correoCliente)
                    .addComponent(txt_correo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dirreción)
                    .addComponent(txt_dirrecion_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_documentoIdentidadCliente)
                    .addComponent(txt_documentoIdentidad_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombreCliente1)
                    .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(mostrar_mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botton_actualizar_datosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botton_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        panel_fondoGestionarUsuarios.add(mostrar_mostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 910, 290));

        getContentPane().add(panel_fondoGestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botton_actualizar_datosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_actualizar_datosClienteActionPerformed
       
    }//GEN-LAST:event_botton_actualizar_datosClienteActionPerformed

    private void txt_documentoIdentidad_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoIdentidad_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_documentoIdentidad_ClienteActionPerformed

    private void txt_telefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoClienteActionPerformed

    private void botton_eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_eliminarClienteActionPerformed
       
    }//GEN-LAST:event_botton_eliminarClienteActionPerformed

    private void txt_IdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botton_actualizar_datosCliente;
    private javax.swing.JButton botton_eliminarCliente;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_apellidoCliente;
    private javax.swing.JLabel label_correoCliente;
    private javax.swing.JLabel label_dirreción;
    private javax.swing.JLabel label_documentoIdentidadCliente;
    private javax.swing.JLabel label_nombreCliente;
    private javax.swing.JLabel label_nombreCliente1;
    private javax.swing.JLabel label_nombreCliente2;
    private javax.swing.JPanel mostrar_mostrarDatos;
    private javax.swing.JPanel panelGestionUsuario;
    private javax.swing.JPanel panel_fondoGestionarUsuarios;
    public static javax.swing.JTable tabel_GestionEmpleado;
    private javax.swing.JTextField txt_IdUsuario;
    private javax.swing.JTextField txt_apellido_Cliente;
    private javax.swing.JTextField txt_correo_Cliente;
    private javax.swing.JTextField txt_dirrecion_Cliente;
    private javax.swing.JTextField txt_documentoIdentidad_Cliente;
    private javax.swing.JTextField txt_idCliente;
    private javax.swing.JTextField txt_nombre_Cliente;
    private javax.swing.JTextField txt_telefonoCliente;
    // End of variables declaration//GEN-END:variables

// metodo para mostrar todas las nempleados
    private void cargartablaClientes() {
        Connection cn = conexion.Conexion.conectar();

        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM empleado;";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InternalFrame_GestionarEmpleado.tabel_GestionEmpleado = new JTable(model);
            InternalFrame_GestionarEmpleado.jScrollPane1.setViewportView(InternalFrame_GestionarEmpleado.tabel_GestionEmpleado);

            model.addColumn("Id_Empleado");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Documento");
            model.addColumn("Correo");
            model.addColumn("Id_Usuario");

            while (rs.next()) {

                Object fila[] = new Object[8];

                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);

            }
            cn.close();

        } catch (SQLException e) {

            System.out.println("Error al llenar la tabla Cliente" + e);
        }

        tabel_GestionEmpleado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tabel_GestionEmpleado.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idEmpleado = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosLineaSeleccionada(idEmpleado);
                }
            }
        });

    }

    private void EnviarDatosLineaSeleccionada(int idEmpleado) {
        try {
            Connection cno = conexion.Conexion.conectar();
            PreparedStatement pst = cno.prepareStatement("SELECT * FROM empleado WHERE id_empleado = '" + idEmpleado + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txt_idCliente.setText(rs.getString("Id_Empleado"));
                txt_nombre_Cliente.setText(rs.getString("Nombre"));
                txt_apellido_Cliente.setText(rs.getString("Apellido"));
                txt_documentoIdentidad_Cliente.setText(rs.getString("Documento"));
                txt_correo_Cliente.setText(rs.getString("Correo"));
                txt_dirrecion_Cliente.setText(rs.getString("Direccion"));
                txt_telefonoCliente.setText(rs.getString("Telefono"));
                txt_IdUsuario.setText(rs.getString("Id_Usuario"));

            }
            cno.close();

        } catch (SQLException e) {

            System.err.println("Error cargar categoria" + e);
        }
    }

}
