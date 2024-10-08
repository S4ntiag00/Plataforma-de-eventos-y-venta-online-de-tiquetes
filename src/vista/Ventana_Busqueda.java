/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_Artista;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Artista;
import modelo.Evento;

/**
 *
 * @author andre
 */
public class Ventana_Busqueda extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Busqueda
     */
    private String textoBusqueda;

    public Ventana_Busqueda(String textoBusqueda) {
        this.textoBusqueda = textoBusqueda; // Asignación del parámetro al campo
        initComponents();
        initTabla(textoBusqueda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtbusquedatabla = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla.setShowGrid(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.setVerifyInputWhenFocusTarget(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtbusquedatabla, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtbusquedatabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int row = tabla.getSelectedRow();
        if (row != -1) {

            // Consultar la base de datos para obtener los detalles del evento seleccionado
            Evento eventoSeleccionado = obtenerEventoPorFila(row);

            // Mostrar los detalles del evento en la nueva ventana
            if (eventoSeleccionado != null) {
                mostrarDetallesEvento(eventoSeleccionado);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Menu_Principal menu_Principal = new Menu_Principal();
        menu_Principal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textoBusqueda = txtbusquedatabla.getText().trim();
        initTabla(textoBusqueda);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txtbusquedatabla;
    // End of variables declaration//GEN-END:variables

    private void initTabla(String Buscar) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0);

        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "SELECT eventos.id_evento, eventos.nombre_evento, eventos.descripcion_evento, eventos.poster "
                    + "FROM eventos "
                    + "JOIN categorias ON eventos.id_categoria = categorias.id_categoria "
                    + "WHERE eventos.nombre_evento LIKE ? OR categorias.nombre_categoria LIKE ?"
            );
            consulta.setString(1, "%" + Buscar + "%");
            consulta.setString(2, "%" + Buscar + "%");

            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Integer idevento = rs.getInt("id_evento");
                String nombreEvento = rs.getString("nombre_evento");
                String descripcionEvento = rs.getString("descripcion_evento");
                byte[] poster = rs.getBytes("poster");
                modeloTabla.addRow(new Object[]{idevento, nombreEvento, descripcionEvento, poster});
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener datos de la base de datos: " + ex.getMessage());
        }

        // Establecer el renderizador de celdas para la columna del póster
        tabla.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
        // Establecer la altura de las filas para que el póster se muestre más grande
        tabla.setRowHeight(240); // Ajustar la altura de las filas para adaptarse al tamaño del póster
        tabla.setFont(new Font("Arial", Font.BOLD, 12)); // Establecer la fuente en negrita con tamaño de 12 puntos
    }

// Clase interna para renderizar las celdas de la columna del póster como imágenes
    class ImageRenderer extends DefaultTableCellRenderer {

        JLabel label;

        public ImageRenderer() {
            label = new JLabel();
            label.setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value != null) {
                // Escalar la imagen al tamaño deseado
                ImageIcon icon = new ImageIcon((byte[]) value);
                Image image = icon.getImage().getScaledInstance(180, 240, Image.SCALE_SMOOTH);
                label.setIcon(new ImageIcon(image)); // Convierte el valor a un ImageIcon y lo establece en el JLabel
            } else {
                label.setIcon(null);
            }
            return label;
        }
    }

    private Evento obtenerEventoPorFila(int fila) {
        Evento evento = null;
        Connection conexion = Conexion.conectar();
        String consulta = "SELECT * FROM eventos WHERE id_evento = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(consulta);
            // Obtener el ID del evento en la fila seleccionada
            int idEvento = (int) tabla.getValueAt(fila, 0); // Suponiendo que la primera columna contiene el ID del evento
            ps.setInt(1, idEvento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                evento = new Evento();
                evento.setIdEvento(rs.getInt("id_evento"));
                evento.setNombreEvento(rs.getString("nombre_evento"));
                evento.setDescripcionEvento(rs.getString("descripcion_evento"));
                evento.setDireccion(rs.getString("direccion"));
                evento.setFecha(rs.getString("fecha"));
                evento.setHora(rs.getString("hora"));
                byte[] bytePoster = rs.getBytes("poster");
                evento.setPoster(bytePoster);
                evento.setIdArtista(rs.getInt("id_artista"));
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles del evento: " + e.getMessage());
        }
        return evento;
    }

    private void mostrarDetallesEvento(Evento evento) {
        if (evento != null) {
            int idEvento = evento.getIdEvento();
            Detalles_Evento detallesEvento = new Detalles_Evento(idEvento); // Pasar idEvento al constructor
            Artista artista = obtenerArtistaPorID(evento.getIdArtista());
            detallesEvento.setNombreEvento(evento.getNombreEvento());
            detallesEvento.setDescripcionEvento(evento.getDescripcionEvento());
            detallesEvento.setPoster(evento.getPoster());
            detallesEvento.setHora(evento.getHora());
            detallesEvento.setDireccionEvento(evento.getDireccion());
            detallesEvento.setFecha(evento.getFecha());
            detallesEvento.setArtista(artista.getNombreArtista());
            detallesEvento.setEspecialidad(artista.getEspecialidad());
            detallesEvento.setDescripcionEvento(evento.getDescripcionEvento());

            detallesEvento.setVisible(true);
            detallesEvento.setLocationRelativeTo(null);
        }
    }

    private Artista obtenerArtistaPorID(int idArtista) {
        Ctrl_Artista ctrlArtista = new Ctrl_Artista();
        List<Artista> artistas = ctrlArtista.obtenerArtistas();
        for (Artista artista : artistas) {
            if (artista.getIdArtista() == idArtista) {
                return artista;
            }
        }
        return null;
    }

}
