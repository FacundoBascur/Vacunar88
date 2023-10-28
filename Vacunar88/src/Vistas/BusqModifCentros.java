package Vistas;

import Entidades.CentroVacunacion;
import Persistencias.CentroVacunacionData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BusqModifCentros extends javax.swing.JInternalFrame {
    
    DefaultTableModel tabla = new DefaultTableModel();
    CentroVacunacionData centro = new CentroVacunacionData();
    
    public BusqModifCentros() {
        initComponents();
        armarTabla();
        jTextoBusq.setEnabled(false);
        jCZonas.setEnabled(false);
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
        jCZonas = new javax.swing.JComboBox<>();

        setTitle("      Búsqueda y Modificación de Centros Vacunatorios");
        setPreferredSize(new java.awt.Dimension(839, 424));

        jPanel1.setPreferredSize(new java.awt.Dimension(837, 402));

        jCOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Activos", "Código", "Inactivos", "Nombre", "Todos", "Zona" }));
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

        jTTablaCentros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 0 && columnIndex < 3;
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

        jCZonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Este", "Norte", "Oeste ", "Sur" }));
        jCZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCZonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBModificar)
                                .addGap(50, 50, 50)
                                .addComponent(jBAltaBaja))
                            .addComponent(jCOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jBBuscar)
                                .addGap(46, 46, 46))
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jTextoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOpcionesActionPerformed
        tabla.setRowCount(0);
        jTextoBusq.setText("");
        String opcion = jCOpciones.getSelectedItem().toString();
        if (opcion.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un criterio de búsqueda.");
            jTextoBusq.setEnabled(false);
            jCZonas.setEnabled(false);
        } else if (opcion.equals("Todos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarCentros();
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(),
                    cv.isEstado()});
            }
            jTextoBusq.setEnabled(false);
            jCZonas.setEnabled(false);
        } else if (opcion.equals("Activos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarPorEstado(true);
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
            }
            jTextoBusq.setEnabled(false);
            jCZonas.setEnabled(false);
        } else if (opcion.equals("Inactivos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarPorEstado(false);
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
            }
            jTextoBusq.setEnabled(false);
            jCZonas.setEnabled(false);
    }//GEN-LAST:event_jCOpcionesActionPerformed
        else if (opcion.equals("Código") || opcion.equals("Nombre")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            jTextoBusq.setEnabled(true);
            jCZonas.setEnabled(false);
        } else if (opcion.equals("Zona")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            jTextoBusq.setEnabled(false);
            jCZonas.setEnabled(true);
          
            
        }
        
    }
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        String opcion = jCOpciones.getSelectedItem().toString();
        if (jTextoBusq.isEnabled() && jTextoBusq.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo de texto.");
            tabla.setRowCount(0);
    }//GEN-LAST:event_jBBuscarActionPerformed
        else {
            switch (opcion) {
                case "Código":
                    
                    try {
                        if (verificar(jTextoBusq.getText()) == false) {
                            JOptionPane.showMessageDialog(null, "El código del Centro de Vacunación no puede contener letras.");
                            jTextoBusq.setText("");
                        } else {
                            tabla.setRowCount(0);
                            CentroVacunacion cen = centro.buscarPorCodCentro(Integer.parseInt(jTextoBusq.getText()));
                            tabla.addRow(new Object[]{cen.getCodCentro(), cen.getNombre(), cen.getZona(), cen.isEstado()});
                        }
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún Centro de Vacunacion con el dato ingresado.");
                        jTextoBusq.setText("");
                        
                    }
                    
                    break;
                case "Nombre":
                    try {
                        if (verificar(jTextoBusq.getText()) == true) {
                            JOptionPane.showMessageDialog(null, "El nombre del Centro de Vacunación no puede contener números.");
                            jTextoBusq.setText("");
                        } else {
                            String nom = jTextoBusq.getText().toUpperCase();
                            CentroVacunacion cent = centro.buscarPorNombre(nom);
                            tabla.addRow(new Object[]{cent.getCodCentro(), cent.getNombre(), cent.getZona(), cent.isEstado()});
                            
                        }
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún Centro de Vacunacion con el dato ingresado.");
                        jTextoBusq.setText("");
                    }
                    
                    break;


                /* if (verificar(jTextoBusq.getText()) == true) {

                        JOptionPane.showMessageDialog(null, "La Zona del Centro de Vacunación no puede contener números.");
                        jTextoBusq.setText("");
                    } else {
                        String zon = jTextoBusq.getText().toUpperCase();
                        List<CentroVacunacion> lista = centro.listarPorZona(zon);
                        if (!lista.isEmpty()) {
                            for (CentroVacunacion cv : lista) {
                                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró ningún Centro de Vacunacion con el dato ingresado.");
                        }

                        jTextoBusq.setText("");

                    }*/
            }
        }
    }
    private void jBAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaBajaActionPerformed
        String op = jCOpciones.getSelectedItem().toString();
        if (jTTablaCentros.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Centro de Vacunación para continuar.");
        } else {
            
            int cod = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 0).toString());
            String nom = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 1).toString();
            String zon = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 2).toString();
            boolean est = Boolean.parseBoolean(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 3).toString());
            
            if (est) {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja del Centro de Vacunación. \n" + nom + " "
                        + "\n Código Centro = " + cod, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");
                
                if (opcion == 0) {
                    centro.darDeBajaAlta(est, cod);
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else if (op.equals("Código") || op.equals("Nombre") || op.equals("Zona")) {
                        jBBuscarActionPerformed(evt);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Baja cancelada");
                }
            } else {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Alta del Centro de Vacunación.\n" + nom + " "
                        + "\n Código Centro = " + cod, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");
                
                if (opcion == 0) {
                    centro.darDeBajaAlta(est, cod);
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else if (op.equals("Código") || op.equals("Nombre") || op.equals("Zona")) {
                        jBBuscarActionPerformed(evt);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Alta cancelada");
                }
            }
            
        }
    }//GEN-LAST:event_jBAltaBajaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        
        boolean correcto = true;
        String op = jCOpciones.getSelectedItem().toString();
        
        try {
            if (jTTablaCentros.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un Centro de Vacunación para continuar.");
            } else {
                
                int cod = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 0).toString());
                String nom = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 1).toString();
                String zon = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 2).toString();
                boolean est = Boolean.parseBoolean(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 3).toString());
                
                if (verificar(nom) || verificar(zon)) {
                    JOptionPane.showMessageDialog(null, "El campo a modificar no puede contener números.");
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else {
                        jBBuscarActionPerformed(evt);
                    }
                } else if (nom.isEmpty() || zon.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo a modificar no puede quedar vacío.");
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else {
                        jBBuscarActionPerformed(evt);
                    }
                } else {
                    if (correcto) {
                        String[] list = {"Si", "No"};
                        int opcion = JOptionPane.showOptionDialog(null, "Confirma la modificación. \n" + nom + " "
                                + "\n Código Centro = " + cod, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");
                        
                        if (opcion == 0) {
                            centro.modificarCentroVacunacion(cod, nom, zon);
                            if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                                jCOpcionesActionPerformed(evt);
                            } else {
                                jBBuscarActionPerformed(evt);
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(this, "Modificación cancelada");
                            if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                                jCOpcionesActionPerformed(evt);
                            } else {
                                jBBuscarActionPerformed(evt);
                            }
                        }
                    }
                }
                
            }
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de modificación incorrecto.");
    }//GEN-LAST:event_jBModificarActionPerformed
    }
    private void jCZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCZonasActionPerformed
        tabla.setRowCount(0);
        jTextoBusq.setEnabled(false);
        if (jCZonas.getSelectedItem().equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una zona..");
        } else {
            String zon = jCZonas.getSelectedItem().toString();
            List<CentroVacunacion> lista = centro.listarPorZona(zon);
            if (!lista.isEmpty()) {
                for (CentroVacunacion cv : lista) {
                    tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún Centro de Vacunacion con el dato ingresado.");
            }
            

    }//GEN-LAST:event_jCZonasActionPerformed
        
    }

    private void armarTabla() {
        String[] titulos = new String[]{"Código", "Nombre", "Zona", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        jTTablaCentros.setModel(tabla);
    }
    
    public boolean verificar(String cadena2) {
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
    private javax.swing.JComboBox<String> jCZonas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTablaCentros;
    private javax.swing.JTextField jTextoBusq;
    // End of variables declaration//GEN-END:variables
}
