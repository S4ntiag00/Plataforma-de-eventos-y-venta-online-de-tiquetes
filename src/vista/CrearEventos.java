package vista;

import controlador.Ctrl_Artista;
import controlador.Ctrl_Categoria;
import controlador.Ctrl_Evento;
import controlador.Ctrl_Localidades;
import controlador.Ctrl_Usuario;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Artista;
import modelo.Categoria;
import modelo.Evento;
import modelo.Localidad;
import modelo.Usuario;


/**
 *
 * @author andres
 */
public class CrearEventos extends javax.swing.JFrame {

    /**
     * Creates new form CrearEventos
     */
    private byte[] fis;
    private ArrayList<Localidad> listaLocalidades = new ArrayList<>();
    private List<Categoria> categorias;

    public CrearEventos() {
        initComponents();
        cargarCategorias();
        TextPrompt phn = new TextPrompt("Nombre del Evento ",txt_nombreEvento); 
        TextPrompt phd = new TextPrompt("Descripcion del Evento",txt_descripcionEvento); 
        TextPrompt phfe = new TextPrompt("Fecha del Evento",txt_fecha); 
        TextPrompt phhe = new TextPrompt("Hora del Evento",txt_hora); 
        TextPrompt phde = new TextPrompt("Direccion del Evento",txt_direccion); 
        TextPrompt pha = new TextPrompt("Artista, Grupo, Organizacion",txt_nombreArtista); 
        TextPrompt phe = new TextPrompt("Acto, Especialidad, Campo ",txt_especialidad); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelPoster = new javax.swing.JLabel();
        txt_nombreEvento = new javax.swing.JTextField();
        txt_hora = new javax.swing.JFormattedTextField();
        txt_fecha = new javax.swing.JFormattedTextField();
        txt_descripcionEvento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_nombreArtista = new javax.swing.JTextField();
        txt_especialidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("BOLETERIA");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoster, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txt_nombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreEventoActionPerformed(evt);
            }
        });

        txt_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horaActionPerformed(evt);
            }
        });

        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        txt_descripcionEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionEventoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Locaciones");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("General");

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Artista");

        txt_nombreArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreArtistaActionPerformed(evt);
            }
        });

        txt_especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_especialidadActionPerformed(evt);
            }
        });

        jButton2.setText("SUBIR POSTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CREAR EVENTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        jButton4.setText("Crear Locaciones");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 869, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_descripcionEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_nombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(167, 167, 167)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txt_nombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_descripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreEventoActionPerformed

    }//GEN-LAST:event_txt_nombreEventoActionPerformed

    private void txt_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horaActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void txt_descripcionEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionEventoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_nombreArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreArtistaActionPerformed

    private void txt_especialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_especialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_especialidadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Evento nuevoEvento = new Evento();
        Ctrl_Evento controlEvento = new Ctrl_Evento();
        Ctrl_Artista controlArtista = new Ctrl_Artista();
        Ctrl_Localidades controlLocalidad = new Ctrl_Localidades();

        if (txt_nombreEvento.getText().isEmpty() || txt_descripcionEvento.getText().isEmpty()
                || txt_fecha.getText().isEmpty() || txt_hora.getText().isEmpty()
                || txt_direccion.getText().isEmpty()
                || txt_nombreArtista.getText().isEmpty() || txt_especialidad.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return; 
        }

        // Verificar y crear el artista si no existe
        int idArtista = controlArtista.obtenerIdPorNombre(txt_nombreArtista.getText().trim());
        if (idArtista == -1) {
            Artista nuevoArtista = new Artista();
            nuevoArtista.setNombreArtista(txt_nombreArtista.getText().trim());
            nuevoArtista.setEspecialidad(txt_especialidad.getText().trim());

            // Guardar el artista y obtener su ID generado
            idArtista = controlArtista.guardarArtistaObtenerID(nuevoArtista);
        }

        int index = comboBoxCategoria.getSelectedIndex();
        if (idArtista != -1 && index != -1) {
            int idCategoria = categorias.get(index).getId();
            // Crear un nuevo evento con la localidad, artista y la imagen obtenidos
            nuevoEvento.setNombreEvento(txt_nombreEvento.getText().trim());
            nuevoEvento.setDescripcionEvento(txt_descripcionEvento.getText().trim());
            nuevoEvento.setFecha(txt_fecha.getText().trim());
            nuevoEvento.setHora(txt_hora.getText().trim());
            nuevoEvento.setDireccion(txt_direccion.getText().trim());
            nuevoEvento.setPoster(fis); // Establecer la imagen seleccionada
            nuevoEvento.setIdArtista(idArtista);
            nuevoEvento.setIdCategoria(idCategoria);
            nuevoEvento.setIdUsuario(Ctrl_Usuario.obtenerUsuarioActivo().getIdUsuario());

            // Guardar el evento
            int idEvento = controlEvento.guardarEvento(nuevoEvento);
            if (idEvento != -1) {
                // Guardar las localidades asociadas al evento
                for (Localidad localidad : listaLocalidades) {
                    localidad.setIdEvento(idEvento);
                    controlLocalidad.guardarLocalidad(localidad);
                }

                JOptionPane.showMessageDialog(null, "Evento y localidades creados exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el evento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar el artista.");
        }

        // Limpiar campos después de guardar
        txt_nombreEvento.setText("");
        txt_descripcionEvento.setText("");
        txt_fecha.setText("");
        txt_hora.setText("");
        txt_direccion.setText("");
        txt_nombreArtista.setText("");
        txt_especialidad.setText("");
        listaLocalidades.clear();  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();

        // Filtrar solo archivos de imagen (jpg y png)
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                Image img = ImageIO.read(file);
                // Reescalar la imagen para que se ajuste al tamaño del JLabel
                Image scaledImg = img.getScaledInstance(labelPoster.getWidth(), labelPoster.getHeight(), Image.SCALE_SMOOTH);
                labelPoster.setIcon(new ImageIcon(scaledImg));

                // Almacenar la imagen seleccionada y su longitud
                fis = Files.readAllBytes(file.toPath());
                

            } catch (IOException ex) {
                System.out.println("Error al cargar la imagen: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Menu_Principal menu_Principal = new Menu_Principal();
        menu_Principal.setVisible(true);
        menu_Principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// Crear una instancia del diálogo AgregarLocalidadDialog
        AgregarLocalidadDialog dialog = new AgregarLocalidadDialog(this, true);
        dialog.setLocationRelativeTo(SwingUtilities.getWindowAncestor(this)); // Centrar la ventana
        dialog.setVisible(true);
        

        // Obtener los datos ingresados por el usuario desde el diálogo
        String nombreLocalidad = dialog.getNombreLocalidad();
        int capacidad = dialog.getCapacidad();
        float precio = dialog.getPrecio();

        // Verificar si se canceló el diálogo
        if (nombreLocalidad == null) {
            // Si se canceló, salir del método
            return;
        }

        // Crear una instancia de la clase Localidad con los datos ingresados por el usuario
        Localidad localidad = new Localidad();
        localidad.setTipoLocalidad(nombreLocalidad);
        localidad.setEspaciosDisponibles(capacidad);
        localidad.setPrecio(precio);

        // Agregar la localidad a la lista de localidades asociadas al evento
        listaLocalidades.add(localidad);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Localidad agregada correctamente.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed

    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelPoster;
    private javax.swing.JTextField txt_descripcionEvento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_especialidad;
    private javax.swing.JFormattedTextField txt_fecha;
    private javax.swing.JFormattedTextField txt_hora;
    private javax.swing.JTextField txt_nombreArtista;
    private javax.swing.JTextField txt_nombreEvento;
    // End of variables declaration//GEN-END:variables

    private void cargarCategorias() {
        Ctrl_Categoria ctrlCategoria = new Ctrl_Categoria();
        try {
            categorias = ctrlCategoria.obtenerCategorias();
            comboBoxCategoria.removeAllItems(); // Limpiar items previos
            for (Categoria categoria : categorias) {
                comboBoxCategoria.addItem(categoria.getNombre());
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrearEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
