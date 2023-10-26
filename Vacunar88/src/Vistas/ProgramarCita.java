package Vistas;

import Entidades.*;
import Persistencias.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ProgramarCita extends javax.swing.JInternalFrame {

    CiudadanoData cd = new CiudadanoData();
    CentroVacunacionData cvd = new CentroVacunacionData();
    VacunaData vd = new VacunaData();

    private List<Ciudadano> ciudadanosRegistrados;
    private List<CentroVacunacion> centrosRegistrados;
    private List<Vacuna> vacunasRegistradas;

    public ProgramarCita() {
        initComponents();
        ciudadanosRegistrados = cd.listarCiudadanosRegistrados();
        // Llena los ComboBox con los datos
        cbCiudadanosRegistrados.setModel(new DefaultComboBoxModel<>(ciudadanosRegistrados.toArray(new Ciudadano[0])));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbCiudadanosRegistrados = new javax.swing.JComboBox<>();
        cbVacunasRegistradas = new javax.swing.JComboBox<>();
        rb3dosis = new javax.swing.JRadioButton();
        rb2dosis = new javax.swing.JRadioButton();
        rb1dosis = new javax.swing.JRadioButton();
        jLPacienteRegistrado = new javax.swing.JLabel();
        jLVacunasRegistradas = new javax.swing.JLabel();
        jLCentroRegistrado = new javax.swing.JLabel();
        jLNroDosis = new javax.swing.JLabel();
        jBCita = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        centroVac = new javax.swing.JTextField();
        tipoVac = new javax.swing.JComboBox<>();

        cbCiudadanosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadanosRegistradosActionPerformed(evt);
            }
        });

        rb3dosis.setText("3ra dosis");

        rb2dosis.setText("2da dosis");

        rb1dosis.setText("1era dosis");

        jLPacienteRegistrado.setText("Elegir paciente registrado:");

        jLVacunasRegistradas.setText("Elegir vacuna disponible:");

        jLCentroRegistrado.setText("Asignar Centro mas cercano:");

        jLNroDosis.setText("Elegir dosis:");

        jBCita.setText("Programar cita");
        jBCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCitaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        centroVac.setEditable(false);
        centroVac.setBackground(new java.awt.Color(204, 204, 204));
        centroVac.setForeground(new java.awt.Color(0, 0, 0));
        centroVac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tipoVac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Aztrazeneca", "Moderna", "Sinopharm", "Pfizer", "Sputnik V" }));
        tipoVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLPacienteRegistrado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCentroRegistrado)
                            .addComponent(jLVacunasRegistradas))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCiudadanosRegistrados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbVacunasRegistradas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(centroVac)
                                    .addComponent(tipoVac, 0, 413, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb1dosis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb2dosis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb3dosis))
                                    .addComponent(jBCita))
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNroDosis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCiudadanosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPacienteRegistrado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCentroRegistrado)
                    .addComponent(centroVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVacunasRegistradas))
                .addGap(18, 18, 18)
                .addComponent(cbVacunasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNroDosis)
                    .addComponent(rb1dosis)
                    .addComponent(rb2dosis)
                    .addComponent(rb3dosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jBCita))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cbCiudadanosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadanosRegistradosActionPerformed
        Ciudadano ciu = (Ciudadano) cbCiudadanosRegistrados.getSelectedItem();
        centrosRegistrados = cvd.listarPorZona(ciu.getZona());
        centroVac.setText(centrosRegistrados.toString());
    }//GEN-LAST:event_cbCiudadanosRegistradosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void tipoVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVacActionPerformed

        String opcion = tipoVac.getSelectedItem().toString();
        if (tipoVac.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion correcta para continuar.");

        } else if (opcion.equals("Astrazeneca")) {
            vacunasRegistradas = vd.listarVacunasXTipo(tipoVac.toString());
        } else if (opcion.equals("Moderna")) {
            vacunasRegistradas = vd.listarVacunasXTipo(opcion);
        } else if (opcion.equals("Sinophaarm")) {
            vacunasRegistradas = vd.listarVacunasXTipo(opcion);
        } else if (opcion.equals("Pfize")) {
            vacunasRegistradas = vd.listarVacunasXTipo(opcion);
        } else if (opcion.equals("Sputnik V")) {

            vacunasRegistradas = vd.listarVacunasXTipo(opcion);
        }

        if (vacunasRegistradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay stock disponible de la vacuna solicitada");
        } else {
            cbVacunasRegistradas.setModel(new DefaultComboBoxModel<>(vacunasRegistradas.toArray(new Vacuna[0])));
        }
    }//GEN-LAST:event_tipoVacActionPerformed

    private void jBCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCitaActionPerformed
        JOptionPane.showMessageDialog(null, LocalDateTime.now());// obtener fecha y hora actual.
       
        JOptionPane.showMessageDialog(null,LocalDateTime.now().plusDays(2)); //le sumas dos dias.
    }//GEN-LAST:event_jBCitaActionPerformed

    private void jBAplicarVacunaActionPerformed(java.awt.event.ActionEvent evt) {
//        String pacienteSeleccionado = cbCiudadanosRegistrados.getSelectedItem().toString();
//        String centroSeleccionado = cbCentrosRegistrados.getSelectedItem().toString();
//        String vacunaSeleccionada = cbVacunasRegistradas.getSelectedItem().toString();
//        //LocalDate fechaSeleccionada = jDCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        JOptionPane.showMessageDialog(this, "Cita programada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ciudadano> cbCiudadanosRegistrados;
    private javax.swing.JComboBox<Vacuna> cbVacunasRegistradas;
    private javax.swing.JTextField centroVac;
    private javax.swing.JButton jBCita;
    private javax.swing.JLabel jLCentroRegistrado;
    private javax.swing.JLabel jLNroDosis;
    private javax.swing.JLabel jLPacienteRegistrado;
    private javax.swing.JLabel jLVacunasRegistradas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton rb1dosis;
    private javax.swing.JRadioButton rb2dosis;
    private javax.swing.JRadioButton rb3dosis;
    private javax.swing.JComboBox<String> tipoVac;
    // End of variables declaration//GEN-END:variables
}
