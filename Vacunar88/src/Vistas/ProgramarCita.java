package Vistas;

import Entidades.*;
import Persistencias.*;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ProgramarCita extends javax.swing.JInternalFrame {

    CiudadanoData cd = new CiudadanoData();
    CentroVacunacionData cvd = new CentroVacunacionData();
    VacunaData vd = new VacunaData();
    CitaVacunacionData citaD = new CitaVacunacionData();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    int codRefuerzo;

    private List<Ciudadano> ciudadanosRegistrados;
    CentroVacunacion centrosRegistradosZona;
    private List<Vacuna> vacunasRegistradas = new ArrayList<>();

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

        jLCentroRegistrado.setText("Centro mas cercano:");

        jLNroDosis.setText("Nro Dosis");

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

        tipoVac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Astrazeneca", "Moderna", "Sinopharm", "Pfizer", "Sputnik V" }));
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
                            .addComponent(jLVacunasRegistradas)
                            .addComponent(jLNroDosis))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbCiudadanosRegistrados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbVacunasRegistradas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(centroVac)
                                    .addComponent(tipoVac, 0, 413, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(rb1dosis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jBCita)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbSalir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb2dosis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb3dosis)))
                                .addGap(41, 41, 41))))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        List<CitaVacunacion> cv = citaD.buscarCitasPorDNISA(ciu.getDni());
        centrosRegistradosZona = cvd.centroXZona(ciu.getZona());
        centroVac.setText(centrosRegistradosZona.toString());
        String fechaAc = LocalDateTime.now().format(formato);
        if (cv.isEmpty()) {
            limpiarRb();
            rb1dosis.setSelected(true);
            rb2dosis.setEnabled(false);
            rb3dosis.setEnabled(false);
            codRefuerzo = 1;
        } else {

            for (CitaVacunacion ct : cv) {
                if (ct.getCodRefuerzo() == 1 && !ct.isEstado()) {
                    JOptionPane.showMessageDialog(null, "El paciente ya tiene la primer dosis colocada.");
                    limpiarRb();
                    rb2dosis.setSelected(true);
                    rb1dosis.setEnabled(false);
                    rb3dosis.setEnabled(false);
                    tipoVac.setSelectedItem(vd.VacunaNroSerie(ct.getnroSerieDosis()).getMarca());
                    codRefuerzo = 2;

                } else if (ct.getCodRefuerzo() == 2 && !ct.isEstado()) {
                    JOptionPane.showMessageDialog(null, "El paciente ya tiene la segunda dosis colocada.");
                    limpiarRb();
                    rb3dosis.setSelected(true);
                    rb2dosis.setEnabled(false);
                    rb1dosis.setEnabled(false);
                    tipoVac.setSelectedItem(vd.VacunaNroSerie(ct.getnroSerieDosis()).getMarca());
                    codRefuerzo = 3;

                } else {

                    LocalDateTime fechacita = LocalDateTime.parse(ct.getFechaHoraCita(), formato);

                    if (fechacita.isBefore(LocalDateTime.now())) {
                        JOptionPane.showMessageDialog(null, "La fecha de la cita ya pasó, debe reprogramar la misma.");
                    } else if (fechacita.isAfter(LocalDateTime.now())) {
                        JOptionPane.showMessageDialog(null, "El paciente tiene una cita pendiente el dia. " + ct.getFechaHoraCita());
                    }

                    cancelarRb();
                    break;
                }

            }
        }
    }//GEN-LAST:event_cbCiudadanosRegistradosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void tipoVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVacActionPerformed

        String opcion = tipoVac.getSelectedItem().toString();
        if (opcion.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion correcta para continuar.");

        } else if (opcion.equals("Astrazeneca")) {
            vacunasRegistradas = vd.listarVacunasXTipoYEstado(opcion, false);
        } else if (opcion.equals("Moderna")) {
            vacunasRegistradas = vd.listarVacunasXTipoYEstado(opcion, false);
        } else if (opcion.equals("Sinopharm")) {
            vacunasRegistradas = vd.listarVacunasXTipoYEstado(opcion, false);
        } else if (opcion.equals("Pfizer")) {
            vacunasRegistradas = vd.listarVacunasXTipoYEstado(opcion, false);
        } else if (opcion.equals("Sputnik V")) {
            vacunasRegistradas = vd.listarVacunasXTipoYEstado(opcion, false);
        }

        if (vacunasRegistradas.isEmpty() && !opcion.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "No hay stock disponible de la vacuna solicitada");
            cancelarRb();
        }

        cbVacunasRegistradas.setModel(new DefaultComboBoxModel<>(vacunasRegistradas.toArray(new Vacuna[0])));
    }//GEN-LAST:event_tipoVacActionPerformed

    private void jBCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCitaActionPerformed
        Ciudadano ciu = (Ciudadano) cbCiudadanosRegistrados.getSelectedItem();
        Vacuna vac = (Vacuna) cbVacunasRegistradas.getSelectedItem();
        CentroVacunacion cv = (CentroVacunacion) cvd.centroXZona(ciu.getZona());

        String ambito = ciu.getAmbitoTrabajo();
        String pat = ciu.getPatologia();

        String fechaCita = "";

        if (cbVacunasRegistradas.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una vacuna para continuar.");
        } else {

            if (ambito.equalsIgnoreCase("Salud") || ambito.equalsIgnoreCase("Jubilado") || ambito.equalsIgnoreCase("Comercio") || ambito.equalsIgnoreCase("Educacion") || !pat.equals("S/P")) {
                LocalDateTime fecha = LocalDateTime.now().plusDays(1);
                fechaCita = fecha.format(formato);
            } else {
                LocalDateTime fecha = LocalDateTime.now().plusDays(3);
                fechaCita = fecha.format(formato);
            }

            String[] list = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(null, "Confirma Cita a paciente Dni : " + ciu.getDni(), "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

            if (opcion == 0) {
                citaD.registrarCita(ciu.getDni(), codRefuerzo, fechaCita, cv.getCodCentro(), null, vac.getNroSerieDosis(), true);
                JOptionPane.showMessageDialog(null, "Paciente Dni:" + ciu.getDni() + " \nCita programada para el Dia y hora: " + fechaCita + "\nLugar : "
                        + "" + cv.getNombre() + "-" + cv.getZona() + "\nVacuna: " + vac.getMarca() + "\n..................\nConcurra al lugar en tiempo y forma o la cita sera reprogramada.");
            } else {
                JOptionPane.showMessageDialog(null, "Cita cancelada");

            }
            
            vd.actualizarEstadoVacuna(vac.getNroSerieDosis(), true);
            limpiarRb();
            centroVac.setText("");
            initComponents();

        }


    }//GEN-LAST:event_jBCitaActionPerformed

    public void limpiarRb() {
        rb1dosis.setSelected(false);
        rb2dosis.setSelected(false);
        rb3dosis.setSelected(false);
        rb3dosis.setEnabled(true);
        rb2dosis.setEnabled(true);
        rb1dosis.setEnabled(true);
        jBCita.setEnabled(true);
    }

    public void cancelarRb() {
        rb3dosis.setEnabled(false);
        rb2dosis.setEnabled(false);
        rb1dosis.setEnabled(false);
        jBCita.setEnabled(false);
    }

    public Duration calcularDiferenciaFechas(LocalDateTime fechaProgramacion, LocalDateTime fechaInoculacion) {
        return Duration.between(fechaProgramacion, fechaInoculacion);
    }

    private void jBAplicarVacunaActionPerformed(java.awt.event.ActionEvent evt) {
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
