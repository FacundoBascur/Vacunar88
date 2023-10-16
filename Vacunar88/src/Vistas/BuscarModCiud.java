package Vistas;

import Entidades.Ciudadano;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Persistencias.*;
import java.util.List;
import javax.swing.JTable;

public class BuscarModCiud extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    CiudadanoData ciuData = new CiudadanoData();

    public BuscarModCiud() {
        initComponents();
        cabeceraTabla();
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCiudadanos = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        altaBaja = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox<>();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D.N.I");

        tablaCiudadanos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCiudadanos);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        altaBaja.setText("Baja/Alta");
        altaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaBajaActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Seleccionar >", "Por DNI", "Todos" }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(35, 35, 35)
                                .addComponent(altaBaja)
                                .addGap(464, 464, 464)
                                .addComponent(salir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(altaBaja)
                    .addComponent(salir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        String opcion = opciones.getSelectedItem().toString();

        if (opcion.equals("Por DNI")) {
            try {

                if (jtDni.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes colocar un DNI para continuar");
                } else if (Integer.parseInt(jtDni.getText()) < 0 || jtDni.getText().length() > 8) {

                    JOptionPane.showMessageDialog(null, "DNI en formato incorrecto, intentelo nuevamente");
                    jtDni.setText("");
                } else {
                    tabla.setRowCount(0);

                    Ciudadano ciu = ciuData.buscarXdni(Integer.parseInt(jtDni.getText()));

                    tabla.addRow(new Object[]{ciu.getDni(), ciu.getNombreCompleto(), ciu.getCelular(), ciu.getEmail(), ciu.getPatologia(), ciu.getAmbitoTrabajo(), ciu.getDosis(), ciu.isEstado()});

                }

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "No se encuentra un ciudadano registrado con ese DNI");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en el campo DNI, verifique");
                jtDni.setText("");
            }

        } else if (opcion.equals("Todos")) {

            tabla.setRowCount(0);
            List<Ciudadano> lista = ciuData.listarCiudadanosRegistrados();

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encuentran ciudadanos registrados actualmente");
            } else {
                for (Ciudadano ciu : lista) {
                    tabla.addRow(new Object[]{ciu.getDni(), ciu.getNombreCompleto(), ciu.getCelular(), ciu.getEmail(), ciu.getPatologia(), ciu.getAmbitoTrabajo(), ciu.getDosis(), ciu.isEstado()});
                }

            }

        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void altaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaBajaActionPerformed
        if (tablaCiudadanos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno para continuar");
        } else {
            int dni = Integer.parseInt(tablaCiudadanos.getValueAt(tablaCiudadanos.getSelectedRow(), 0).toString());
            String nombre = tablaCiudadanos.getValueAt(tablaCiudadanos.getSelectedRow(), 1).toString();
            boolean estado = Boolean.parseBoolean(tablaCiudadanos.getValueAt(tablaCiudadanos.getSelectedRow(), 7).toString());

            if (estado) {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja de Ciudadano \n" + nombre + "\nDNI = " + dni, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    ciuData.modificarEstado(estado, dni);
                    jbBuscarActionPerformed(evt);

                } else {
                    JOptionPane.showMessageDialog(this, "Baja cancelada");
                }
            } else {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Alta del alumno \n" + nombre + "\nDNI = " + dni, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    ciuData.modificarEstado(estado, dni);
                    jbBuscarActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Alta cancelada");
                }
            }

        }
        tablaCiudadanos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaCiudadanos.doLayout();
    }//GEN-LAST:event_altaBajaActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        if (opciones.getSelectedItem().toString().equals("Todos")) {
            tabla.setRowCount(0);
            jtDni.setText("");
            jtDni.setEnabled(false);
        } else {
            tabla.setRowCount(0);
            jtDni.setText("");
            jtDni.setEnabled(true);
        }
    }//GEN-LAST:event_opcionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jtDni;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaCiudadanos;
    // End of variables declaration//GEN-END:variables

    public void cabeceraTabla() {

        String[] titulos = new String[]{"DNI", "Apellido y Nombre", "N° Cel", "Email", "Patologias", "Ammbito Laboral", "Dosis", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        tablaCiudadanos.setModel(tabla);
    }

    public void rellenarTabla(int dni) {

    }

}