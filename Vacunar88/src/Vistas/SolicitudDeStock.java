package Vistas;

import Entidades.CentroVacunacion;
import Persistencias.CentroVacunacionData;
import Persistencias.StockData;
import javax.swing.JOptionPane;

public class SolicitudDeStock extends javax.swing.JInternalFrame {

    CentroVacunacionData cd = new CentroVacunacionData();
    StockData sd = new StockData();

    public SolicitudDeStock() {
        initComponents();
        llenarCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcCentro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcVacuna = new javax.swing.JComboBox<>();
        jtCantidad = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Seleccione el centro de salud");

        jLabel2.setText("Seleccione la vacuna a solicitar");

        jLabel3.setText("Coloque la cantidad necesaria");

        jcVacuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Moderna", "Pfizer", "AstraZeneca", "Sinopharm", "Sputnik V" }));

        jtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        confirmar.setText("Confirmar Solicitud");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
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
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcCentro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcVacuna, 0, 232, Short.MAX_VALUE)
                            .addComponent(jtCantidad)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
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

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed

        try {
            if (jcVacuna.getSelectedItem().toString().equals("<Seleccionar>")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una marca de vacuna valida para continuar.");
            } else if (verificar(jtCantidad.getText())) {
                CentroVacunacion cv = (CentroVacunacion) jcCentro.getSelectedItem();
                String marca = jcVacuna.getSelectedItem().toString();
                int cantidad = Integer.parseInt(jtCantidad.getText());
                
                sd.solicitudStock(marca, cantidad, cv.getCodCentro(), title, true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Formato de cantidad solicitada no valido");

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Formato de cantidad solicitada no valido");
        }


    }//GEN-LAST:event_confirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void llenarCB() {

        for (CentroVacunacion cent : cd.listarPorEstado(true)) {
            jcCentro.addItem(cent);
        }

    }

    public boolean verificar(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<CentroVacunacion> jcCentro;
    private javax.swing.JComboBox<String> jcVacuna;
    private javax.swing.JTextField jtCantidad;
    // End of variables declaration//GEN-END:variables
}
