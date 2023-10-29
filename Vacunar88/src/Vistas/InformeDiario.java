package Vistas;

import Entidades.*;
import Persistencias.CentroVacunacionData;
import Persistencias.CitaVacunacionData;
import Persistencias.VacunaData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class InformeDiario extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    DefaultTableModel tabla2 = new DefaultTableModel();
    CentroVacunacionData centro = new CentroVacunacionData();
    CitaVacunacionData cita = new CitaVacunacionData();
    VacunaData vacu;

    public InformeDiario() {
        initComponents();
        armarTabla();
        armarCentros();
        armarTablaInforme();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabladiaria = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInformeCentro = new javax.swing.JTable();

        setTitle("   Informe Diario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabladiaria= new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex > 3;
            }
        };
        jTabladiaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabladiaria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabladiaria);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        tablaInformeCentro = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return columnIndex >3;
            }
        };
        tablaInformeCentro.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaInformeCentro.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaInformeCentro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSalir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    private void armarTabla() {
        String[] titulos = new String[]{"Codigo Centro", "Centro Vacunatorio", "Cantidad de vacunaciones"};
        String[] titulos2 = new String[]{"DNI", "N° serie vacuna"};
        tabla.setColumnIdentifiers(titulos);
        tabla2.setColumnIdentifiers(titulos2);
        jTabladiaria.setModel(tabla);
        tablaInformeCentro.setModel(tabla2);
    }

    private void armarTablaInforme() {
        jTabladiaria.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                int fila = jTabladiaria.getSelectedRow();

                if (fila != -1) {
                    tabla2.setRowCount(0);
                    int codCentro = Integer.parseInt(jTabladiaria.getValueAt(jTabladiaria.getSelectedRow(), 0).toString());

                    for (CitaVacunacion ct : cita.citaXcentro(codCentro)) {
                        tabla2.addRow(new Object[]{ct.getDni(), ct.getnroSerieDosis()});
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para continuar.");
                }

            }
        });
    }

    private void armarCentros() {
        List<CentroVacunacion> centros = centro.listarCentros();

        for (CentroVacunacion cen : centros) {

            tabla.addRow(new Object[]{cen.getCodCentro(), cen.getNombre(), cita.contarVacunasXCentro(cen.getCodCentro())});

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabladiaria;
    private javax.swing.JTable tablaInformeCentro;
    // End of variables declaration//GEN-END:variables
}
