package Vistas;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusqModifCentros extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();

    public BusqModifCentros() {
        initComponents();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCOpciones = new javax.swing.JComboBox<>();
        jTextoBusq = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaCentros = new javax.swing.JTable();
        jBModificar = new javax.swing.JButton();
        jBAltaBaja = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setTitle("                                     Búsqueda y Modificación de Centros Vacunatorios");

        jCOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Código", "Nombre", "Activos", "Inactivos", "Todos" }));
        jCOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOpcionesActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        tablaAlumnos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 0 && columnIndex < 5;
            }
        };
        jTTablaCentros.setModel(new javax.swing.table.DefaultTableModel(
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
        jTTablaCentros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTTablaCentros);

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBAltaBaja.setText("Alta/Baja");
        jBAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaBajaActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBModificar)
                        .addGap(97, 97, 97)
                        .addComponent(jBAltaBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCOpciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jTextoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBAltaBaja)
                    .addComponent(jBSalir))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOpcionesActionPerformed

    }//GEN-LAST:event_jCOpcionesActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        try {
            if (jTTablaCentros.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "No se ha realizado ninguna modificacion");
            } else {

                //En estos variables se guardan los datos obtenidos al seleccionar una fila de la tabla. "tabla.getValueAt(tablaAlumnos.getSelectedRow --> selecciona fila"
                int cod = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 0).toString());
                String nom = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 1).toString();
                int longXcentro = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 2).toString());
                int lat = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 3).toString());
                String est = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 4).toString();

                if (nom.isEmpty()||  ) {
                    JOptionPane.showMessageDialog(null, "No se admiten numeros y/o casilleros vacios en Apellido y Nombre");
                    buscarActionPerformed(evt);
                } else {

                    String[] list = {"Si", "No"};
                    int opcion = JOptionPane.showOptionDialog(null, " Confirmar modificacion", "", 0, JOptionPane.QUESTION_MESSAGE, null, list, ""); // muestra un cuadro de dialogo para confirmar la modificacion del alumno devuelve 0 o 1 dependiendo la opcion que se elija

                    if (opcion == 0) {
                        alumno.modificarAlumno(id, dni, ap, nom, fecha);

                    } else {
                        JOptionPane.showMessageDialog(this, "Modificacion cancelada");
                    }

                }
            }
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en la modificacion - el DNI colocado no es correcto, excede limites de digitos");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de fecha");

        }


    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaBajaActionPerformed

    }//GEN-LAST:event_jBAltaBajaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void armarTabla() {
        String[] titulos = new String[]{"Código", "Nombre", "Longitud", "Latitud", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        jTTablaCentros.setModel(tabla);
    }

    public boolean verificarNombre(String cadena2) {
        try {
            Integer.parseInt(cadena2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltaBaja;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTablaCentros;
    private javax.swing.JTextField jTextoBusq;
    // End of variables declaration//GEN-END:variables
}
