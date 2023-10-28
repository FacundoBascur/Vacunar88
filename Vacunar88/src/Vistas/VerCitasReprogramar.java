package Vistas;

import Entidades.CitaVacunacion;
import Persistencias.CitaVacunacionData;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerCitasReprogramar extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    CitaVacunacionData cvd = new CitaVacunacionData();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public VerCitasReprogramar() {

        initComponents();
        reprogramar.setEnabled(false);
        cabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCita = new javax.swing.JTable();
        aplicada = new javax.swing.JButton();
        reprogramar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox<>();
        jtDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tablaCita = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 7;
            }
        };
        tablaCita.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCita);

        aplicada.setText("Vacuna ya aplicada");
        aplicada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicadaActionPerformed(evt);
            }
        });

        reprogramar.setText("Reprogramar cita");
        reprogramar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprogramarActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Todos", "Por DNI", "Pendientes", "Realizadas", "Reprogramar", " ", " ", " ", " " }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        jtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aplicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reprogramar)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aplicada)
                    .addComponent(reprogramar)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String opcion = opciones.getSelectedItem().toString();

        if (opcion.equals("Por DNI")) {
            try {

                if (jtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes colocar un DNI para continuar");
                } else if (Integer.parseInt(jtDni.getText()) < 0 || jtDni.getText().length() != 8) {

                    JOptionPane.showMessageDialog(null, "DNI en formato incorrecto, intentelo nuevamente");
                    jtDni.setText("");
                } else {
                    tabla.setRowCount(0);

                    for (CitaVacunacion ct : cvd.buscarCitasPorDNISA(Integer.parseInt(jtDni.getText()))) {

                        tabla.addRow(new Object[]{ct.getCodCita(), ct.getDni(), ct.getCodRefuerzo(), ct.getFechaHoraCita(), ct.getCentroVacunacion(), ct.getFechaHoraVac(), ct.getnroSerieDosis(), ct.isEstado()});
                    }
                }

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No se encuentran citas registradas con ese DNI");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en el campo DNI, verifique");
                jtDni.setText("");
            }

        } else if (opcion.equals("Todos")) {
            tabla.setRowCount(0);

            List<CitaVacunacion> lista = cvd.listarCitas();
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encuentran citas registradas actualmente");
            } else {
                for (CitaVacunacion ct : lista) {
                    tabla.addRow(new Object[]{ct.getCodCita(), ct.getDni(), ct.getCodRefuerzo(), ct.getFechaHoraCita(), ct.getCentroVacunacion(), ct.getFechaHoraVac(), ct.getnroSerieDosis(), ct.isEstado()});
                }

            }

        } else if (opcion.equals("Pendientes")) {
            tabla.setRowCount(0);
            List<CitaVacunacion> lista = cvd.listarCitasXEstado(true);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encuentran citas pendientes");
            } else {
                for (CitaVacunacion ct : lista) {
                    tabla.addRow(new Object[]{ct.getCodCita(), ct.getDni(), ct.getCodRefuerzo(), ct.getFechaHoraCita(), ct.getCentroVacunacion(), ct.getFechaHoraVac(), ct.getnroSerieDosis(), ct.isEstado()});
                }

            }

        } else if (opcion.equals("Realizadas")) {
            tabla.setRowCount(0);
            List<CitaVacunacion> lista = cvd.listarCitasXEstado(false);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Las citas fueron realizadas");
            } else {
                for (CitaVacunacion ct : lista) {
                    tabla.addRow(new Object[]{ct.getCodCita(), ct.getDni(), ct.getCodRefuerzo(), ct.getFechaHoraCita(), ct.getCentroVacunacion(), ct.getFechaHoraVac(), ct.getnroSerieDosis(), ct.isEstado()});
                }

            }
        } else if (opcion.equals("Reprogramar")) {

            tabla.setRowCount(0);
            reprogramar.setEnabled(true);
            List<CitaVacunacion> lista = cvd.listarCitas();
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encuentran citas registradas actualmente");
            } else {
                for (CitaVacunacion ct : lista) {

                    LocalDateTime fechacita = LocalDateTime.parse(ct.getFechaHoraCita(), formato);

                    if (fechacita.isBefore(LocalDateTime.now())) {
                        tabla.addRow(new Object[]{ct.getCodCita(), ct.getDni(), ct.getCodRefuerzo(), ct.getFechaHoraCita(), ct.getCentroVacunacion(), ct.getFechaHoraVac(), ct.getnroSerieDosis(), ct.isEstado()});
                    }

                }

            }

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        if (opciones.getSelectedItem().toString().equals("Todos") || opciones.getSelectedItem().toString().equals("Pendientes") || opciones.getSelectedItem().toString().equals("Realizadas") || opciones.getSelectedItem().toString().equals("Reprogramar")) {
            tabla.setRowCount(0);
            jtDni.setText("");
            jtDni.setEnabled(false);
            reprogramar.setEnabled(false);
            jbBuscarActionPerformed(evt);
        } else if (opciones.getSelectedItem().toString().equals("< Seleccionar >")) {
            tabla.setRowCount(0);
            jtDni.setText("");
            jtDni.setEnabled(false);
            reprogramar.setEnabled(false);
        } else {
            reprogramar.setEnabled(false);
            tabla.setRowCount(0);
            jtDni.setText("");
            jtDni.setEnabled(true);
        }
    }//GEN-LAST:event_opcionesActionPerformed

    private void aplicadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicadaActionPerformed
        // en este caso verifica que seleccione una fila y que la vacuna todavia no se aplico.
        if (tablaCita.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para continuar");
        } else {
            String fechaS = tablaCita.getValueAt(tablaCita.getSelectedRow(), 3).toString();//obtengo la fecha de la cita para setearla en la fecha de vacunacion.
            LocalDateTime dateTime = LocalDateTime.parse(fechaS, formato);
            boolean estado = Boolean.parseBoolean(tablaCita.getValueAt(tablaCita.getSelectedRow(), 7).toString());

            if (!estado) {
                JOptionPane.showMessageDialog(null, "La vacuna que selecciono ya fue aplicada.");
            } else if (dateTime.isBefore(LocalDateTime.now())) {
                JOptionPane.showMessageDialog(null, "Debe reprogramar la cita");
            } else {
                aplicada.setSelected(true);

                Timestamp fecha = Timestamp.valueOf(dateTime);

                //la fecha de vacuna se setea con al fecha de la sita, ya que es a modo funcional para el proyecto. 
                if (tablaCita.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para continuar");
                } else {
                    int codCita = Integer.parseInt(tablaCita.getValueAt(tablaCita.getSelectedRow(), 0).toString());
                    cvd.vacunaAplicada(fecha, false, codCita);
                    JOptionPane.showMessageDialog(null, "La vacuna fue aplicada a la Fecha/hora: " + fecha);
                    jbBuscarActionPerformed(evt);
                }
            }

        }


    }//GEN-LAST:event_aplicadaActionPerformed

    private void reprogramarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprogramarActionPerformed
        // si la cita se tiene que reprogramar, la misma 
        if (opciones.getSelectedItem().toString().equals("Reprogramar")) {
            int codCita = Integer.parseInt(tablaCita.getValueAt(tablaCita.getSelectedRow(), 0).toString());
            int dni = Integer.parseInt(tablaCita.getValueAt(tablaCita.getSelectedRow(), 1).toString());

            String fechaS = tablaCita.getValueAt(tablaCita.getSelectedRow(), 3).toString();//obtengo la fecha de la cita para reprogramar la cita.
            LocalDateTime dateTime = LocalDateTime.parse(fechaS, formato);
            String fechaNueva = dateTime.plusDays(14).format(formato);

            String[] list = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(null, "¿Reprogramar cita? \nPaciente DNI: " + dni, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

            if (opcion == 0) {
                cvd.reprogramarFecha(fechaNueva, codCita);
                JOptionPane.showMessageDialog(null, "Cita Reprogramada.\nFecha/hora: " + fechaNueva);

            } else {
                JOptionPane.showMessageDialog(null, "Reprogramacion cancelada");
            }
            jbBuscarActionPerformed(evt);
        } else {

            JOptionPane.showMessageDialog(null, "Debe seleccionar opcion valida para continuar");
        }
    }//GEN-LAST:event_reprogramarActionPerformed

    public void cabeceraTabla() {

        String[] titulos = new String[]{"Cita", "Dni", "Refuerzo", "Fechc/hora - Cita", "Centro", "Fecha/hora Vacunacion", "N° serie dosis", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        tablaCita.setModel(tabla);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicada;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JTextField jtDni;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JButton reprogramar;
    private javax.swing.JTable tablaCita;
    // End of variables declaration//GEN-END:variables
}
