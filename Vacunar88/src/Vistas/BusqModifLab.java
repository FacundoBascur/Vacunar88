package Vistas;

import Entidades.Laboratorio;
import Persistencias.LaboratorioData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class BusqModifLab extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    LaboratorioData lab = new LaboratorioData();
    Long cuitViejo;

    public BusqModifLab() {
        initComponents();
        armarTabla();
        jTBusq.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCOpciones = new javax.swing.JComboBox<>();
        jTBusq = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTablaLabs = new javax.swing.JTable();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBAltaBaja = new javax.swing.JButton();

        setTitle("            Búsqueda y Modificación de Laboratorios");

        jCOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Activos", "CUIT", "Inactivos", "Marca", "Nombre", "País", "Todos" }));
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

        jTTablaLabs = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > -1 && columnIndex < 5;
            }
        };
        jTTablaLabs.setModel(new javax.swing.table.DefaultTableModel(
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
        jTTablaLabs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTTablaLabs);

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBAltaBaja.setText("Alta/Baja");
        jBAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTBusq)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBModificar)
                                .addGap(43, 43, 43)
                                .addComponent(jBAltaBaja)
                                .addGap(444, 444, 444)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jTBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBAltaBaja)
                    .addComponent(jBSalir))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        String opcion = jCOpciones.getSelectedItem().toString();

        if (jTBusq.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar el campo de texto.");
            tabla.setRowCount(0);
        } else {

            if (opcion.equals("CUIT")) {
                try {
                    if (!verificar(jTBusq.getText()) && jTBusq.getText().length() > 0) {
                        JOptionPane.showMessageDialog(null, "El CUIT del laboratorio no puede contener letras.");
                        jTBusq.setText("");
                    } else if (verificar(jTBusq.getText()) && jTBusq.getText().length() != 11) {
                        JOptionPane.showMessageDialog(null, "Cantidad de dígitos fuera del rango de CUIT.");
                        jTBusq.setText("");
                    } else {
                        Laboratorio lb = lab.buscarPorCuit(jTBusq.getText());
                        tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                            lb.getMarca(), lb.isEstado()});

                    }

                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún laboratorio con el dato ingresado.");
                    jTBusq.setText("");

                }

            } else if (opcion.equals("Nombre")) {

                try {
                    if (verificar(jTBusq.getText()) == true) {
                        JOptionPane.showMessageDialog(null, "El nombre del Laboratorio no puede contener números.");
                        jTBusq.setText("");
                    } else {
                        Laboratorio lb = lab.buscarNombre(jTBusq.getText().toUpperCase());
                        tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                            lb.getMarca(), lb.isEstado()});
                    }
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún laboratorio con el dato ingresado.");
                    jTBusq.setText("");
                }

            } else if (opcion.equals("País")) {
                try {
                    if (verificar(jTBusq.getText()) == true) {

                        JOptionPane.showMessageDialog(null, "El país del laboratorio no puede contener números.");
                        jTBusq.setText("");
                    } else {

                        Laboratorio labo = lab.buscarPorPais(jTBusq.getText().toUpperCase());

                        tabla.addRow(new Object[]{labo.getCuit(), labo.getNombreLab(), labo.getPais(), labo.getDomicilioCom(),
                            labo.getMarca(), labo.isEstado()});
                    }
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún laboratorio con el dato ingresado.");
                    jTBusq.setText("");
                }
            } else if (opcion.equals("Marca")) {
                try {
                    Laboratorio lb = lab.buscarPorMarca(jTBusq.getText().toUpperCase());
                    tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                        lb.getMarca(), lb.isEstado()});
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún laboratorio con el dato ingresado.");
                    jTBusq.setText("");

    }//GEN-LAST:event_jBBuscarActionPerformed

            }
        }
    }
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        boolean correcto = true;
        String op = jCOpciones.getSelectedItem().toString();

        try {
            if (jTTablaLabs.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un Laboratorio para continuar.");
            } else {

              long cuit = Long.parseLong(jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 0).toString());
                //String cuitNuevo = cuit;
                String nom = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 1).toString();
                String pais = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 2).toString();
                String dom = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 3).toString();
                String mar = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 4).toString();
                boolean est = Boolean.parseBoolean(jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 5).toString());

                if (verificar(nom) || verificar(pais)) {
                    JOptionPane.showMessageDialog(null, "El campo a modificar no puede contener números.");
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else {
                        jBBuscarActionPerformed(evt);
                    }
                    correcto = false;
                }

                if (verificar(String.valueOf(cuit)) && String.valueOf(cuit).length()!=11) {
                    JOptionPane.showMessageDialog(null, "Cantidad de dígitos en Cuit fuera del rango permitido.");
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else {
                        jBBuscarActionPerformed(evt);
                    }
                    correcto = false;
                }

                if (nom.length() == 0 || pais.length() == 0 || dom.length() == 0 || mar.length() == 0 || String.valueOf(cuit).length()==0) {
                    JOptionPane.showMessageDialog(null, "El campo a modificar no puede quedar vacío.");
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else {
                        jBBuscarActionPerformed(evt);
                    }
                    correcto = false;
                }

                if (correcto) {

                    if (cuitViejo !=cuit  && String.valueOf(cuitViejo).length()!=0) {
                        String[] list = {"Si", "No"};
                        int opcion = JOptionPane.showOptionDialog(null, "Confirma modificacion del CUIT = " + cuitViejo + " a \nCUIT = " + cuit, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");
                        if (opcion == 0) {
                            lab.modficarLab(cuit, nom, pais, dom, mar, cuitViejo);
                            JOptionPane.showMessageDialog(null, "CUIT modificado");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se realizó modificación del CUIT.");
                              lab.modficarLab(cuitViejo, nom, pais, dom, mar, cuitViejo);
                        }

                    } else {
                        lab.modficarLab(cuit, nom, pais, dom, mar, cuitViejo);
                    }
                    JOptionPane.showMessageDialog(null, "Modificaciones realizadas con éxito.");
                    jBBuscarActionPerformed(evt);
                    cuitViejo = null;
                }
            
            
            }
        
        
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la modificación.");

            if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                jCOpcionesActionPerformed(evt);
            } else {
                jBBuscarActionPerformed(evt);
            }

        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaBajaActionPerformed
        String op = jCOpciones.getSelectedItem().toString();
        if (jTTablaLabs.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Laboratorio para continuar.");
        } else {

           long cuit = Long.parseLong(jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 0).toString());
            String nom = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 1).toString();
            String pais = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 2).toString();
            String dom = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 3).toString();
            String mar = jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 4).toString();
            boolean est = Boolean.parseBoolean(jTTablaLabs.getValueAt(jTTablaLabs.getSelectedRow(), 5).toString());

            if (est) {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Baja del Laboratorio. \n" + nom + " "
                        + "\n CUIT= " + cuit, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    lab.bajaAlta(est, cuit);
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else if (op.equals("CUIT") || op.equals("Nombre") || op.equals("Marca") || op.equals("País")) {
                        jBBuscarActionPerformed(evt);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Baja cancelada");
                }
            } else {
                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Confirmar Alta del Laboratorio.\n" + nom + " "
                        + "\n CUIT= " + cuit, "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    lab.bajaAlta(est, cuit);
                    if (op.equals("Todos") || op.equals("Activos") || op.equals("Inactivos")) {
                        jCOpcionesActionPerformed(evt);
                    } else if (op.equals("CUIT") || op.equals("Nombre") || op.equals("Marca") || op.equals("País")) {
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

    private void jCOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOpcionesActionPerformed
        tabla.setRowCount(0);
        jTBusq.setText("");
        String opcion = jCOpciones.getSelectedItem().toString();
        if (opcion.equals("<Seleccionar>")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un criterio de búsqueda.");
            jTBusq.setEnabled(false);

        } else if (opcion.equals("Todos")) {
            tabla.setRowCount(0);
            jTBusq.setText("");
            List<Laboratorio> lista = lab.listarTodos();
            for (Laboratorio lb : lista) {
                tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                    lb.getMarca(), lb.isEstado()});
            }
            jTBusq.setEnabled(false);
        } else if (opcion.equals("Activos")) {
            tabla.setRowCount(0);
            jTBusq.setText("");
            List<Laboratorio> lista = lab.listarPorEstado(true);
            for (Laboratorio lb : lista) {
                tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                    lb.getMarca(), lb.isEstado()});
            }
jTBusq.setEnabled(false);
        } else if (opcion.equals("Inactivos")) {
            tabla.setRowCount(0);
            jTBusq.setText("");
            List<Laboratorio> lista = lab.listarPorEstado(false);
            for (Laboratorio lb : lista) {
                tabla.addRow(new Object[]{lb.getCuit(), lb.getNombreLab(), lb.getPais(), lb.getDomicilioCom(),
                    lb.getMarca(), lb.isEstado()});
            }
jTBusq.setEnabled(false);
        }else if (opcion.equals("CUIT") || opcion.equals("Nombre") || opcion.equals("País") || opcion.equals("Marca")) {
        tabla.setRowCount(0);
        jTBusq.setText("");
        jTBusq.setEnabled(true);
        }
    }//GEN-LAST:event_jCOpcionesActionPerformed
    private void armarTabla() {
        String[] titulos = new String[]{"CUIT", "Nombre", "País", "Domicilio Comercial", "Marca", "Estado"};
        tabla.setColumnIdentifiers(titulos);
        jTTablaLabs.setModel(tabla);
    }

    public boolean verificar(String cadena2) {
        try {
            Long.parseLong(cadena2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
/*public boolean verificar(long cuit) {
        try {
            Integer.parseInt(cuit);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }*/

    public void obtenerCuit() {
        jTTablaLabs.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (jTTablaLabs.getSelectedColumn() == 0 && jTTablaLabs.getSelectedRow() != -1) {
                    cuitViejo = Long.parseLong(tabla.getValueAt(jTTablaLabs.getSelectedRow(), 0).toString());
                }
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltaBaja;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusq;
    private javax.swing.JTable jTTablaLabs;
    // End of variables declaration//GEN-END:variables
}
