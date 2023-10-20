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

        jCOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Activos", "Código", "Inactivos", "Todos", "Zona" }));
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
                return columnIndex > 0 && columnIndex < 4;
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
            tabla.setRowCount(0);
             jTextoBusq.setText("");
        String opcion = jCOpciones.getSelectedItem().toString();
        if (opcion.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un criterio de búsqueda.");

        } else if (opcion.equals("Todos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarCentros();
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(),
                    cv.isEstado()});
            }

        } else if (opcion.equals("Activos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarPorEstado(true);
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
            }

        } else if (opcion.equals("Inactivos")) {
            tabla.setRowCount(0);
            jTextoBusq.setText("");
            List<CentroVacunacion> lista = centro.listarPorEstado(false);
            for (CentroVacunacion cv : lista) {
                tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
            }

    }//GEN-LAST:event_jCOpcionesActionPerformed
        else if (opcion.equals("Código")) {
            tabla.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Complete el Código del Centro Vacunatorio.");
        } else if (opcion.equals("Nombre")) {
            JOptionPane.showMessageDialog(null, "Complete el Nombre del Centro Vacunatorio.");
        } else if (opcion.equals("Zona")) {
            JOptionPane.showMessageDialog(null, "Complete la Zona del Centro Vacunatorio.");
        }
    }


    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
      //  tabla.setRowCount(0);
       
        String opcion = jCOpciones.getSelectedItem().toString();
        if (jTextoBusq.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo de texto.");
    }//GEN-LAST:event_jBBuscarActionPerformed
 else {
            if (opcion.equals("Código")) {
                if (verificar(jTextoBusq.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "El código del Centro de Vacunación no puede contener letras.");
                    jTextoBusq.setText("");
                } else {
                    CentroVacunacion cen = centro.buscarPorCodCentro(Integer.parseInt(jTextoBusq.getText()));
                    tabla.addRow(new Object[]{cen.getCodCentro(), cen.getNombre(), cen.getZona(), cen.isEstado()});
                }
            } else if (opcion.equals("Nombre")) {
                if (verificar(jTextoBusq.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "El nombre del Centro de Vacunación no puede contener números.");
                    jTextoBusq.setText("");
                } else {
                    CentroVacunacion cen = centro.buscarPorNombre(jTextoBusq.getText());
                    tabla.addRow(new Object[]{cen.getCodCentro(), cen.getNombre(), cen.getZona(), cen.isEstado()});
                }

            } else if (opcion.equals("Zona")) {
                if (verificar(jTextoBusq.getText()) == true) {

                    JOptionPane.showMessageDialog(null, "La Zona del Centro de Vacunación no puede contener números.");
                    jTextoBusq.setText("");
                } else {
                    //tabla.setRowCount(0);
                    String zon = jTextoBusq.getText();

                    List<CentroVacunacion> lista = centro.listarPorZona(zon);
                    for (CentroVacunacion cv : lista) {
                        tabla.addRow(new Object[]{cv.getCodCentro(), cv.getNombre(), cv.getZona(), cv.isEstado()});
                    }
                }

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
                    if(op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")){
                jCOpcionesActionPerformed(evt);
                }else if(op.equals("Código")|| op.equals("Nombre") || op.equals("Zona")){
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
                    if(op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")){
                jCOpcionesActionPerformed(evt);
                }else if(op.equals("Código")|| op.equals("Nombre") || op.equals("Zona")){
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
      if (jTTablaCentros.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Centro de Vacunación para continuar.");
        } else {

            int cod = Integer.parseInt(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 0).toString());
            String nom = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 1).toString();
            String zon = jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 2).toString();
            boolean est = Boolean.parseBoolean(jTTablaCentros.getValueAt(jTTablaCentros.getSelectedRow(), 3).toString());

            if(verificar(nom)==true || verificar(zon))==true){
           JOptionPane.showMessageDialog(null, "El campo a modificar no puede contener números.");
        } else if (nom.isEmpty() || zon.isEmpty()){
        
        JOptionPane.showMessageDialog(null,"El campo a modificar no puede quedar vacío.");
        }else{
                
                
                
                
                }
                
                
        }
        
        
        
        
        
        
        
        

                
    }//GEN-LAST:event_jBModificarActionPerformed
            
      
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTablaCentros;
    private javax.swing.JTextField jTextoBusq;
    // End of variables declaration//GEN-END:variables
}
