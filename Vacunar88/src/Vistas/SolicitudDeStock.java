package Vistas;

import Entidades.*;
import Persistencias.*;
import javax.swing.JOptionPane;

public class SolicitudDeStock extends javax.swing.JInternalFrame {

    CentroVacunacionData cd = new CentroVacunacionData();
    LaboratorioData ld = new LaboratorioData();
    StockData sd = new StockData();

    public SolicitudDeStock() {
        initComponents();
        llenarCB();
        llenarLab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcCentro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcLaboratorio = new javax.swing.JComboBox<>();
        jtCantidad = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tipoVacuna = new javax.swing.JTextField();

        jLabel1.setText("Centro de salud solicitante");

        jLabel2.setText("Seleccione el laboratorio");

        jLabel3.setText("Coloque la cantidad necesaria");

        jcLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcLaboratorioActionPerformed(evt);
            }
        });

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

        jLabel4.setText("Vacuna");

        tipoVacuna.setEditable(false);
        tipoVacuna.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCentro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcLaboratorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoVacuna)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jtCantidad))
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20))
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
                    .addComponent(jcLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipoVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
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

        Integer cantidad = Integer.parseInt(jtCantidad.getText());
        Laboratorio lab = (Laboratorio) jcLaboratorio.getSelectedItem();
        CentroVacunacion cv = (CentroVacunacion) jcCentro.getSelectedItem();

        try {
            if (verificar(jtCantidad.getText()) && cantidad > 0) {

                String[] list = {"Si", "No"};
                int opcion = JOptionPane.showOptionDialog(null, "Desea confirmar solicitud a \nlaboratorio: " + lab.getNombreLab() + "\nCuit :" + lab.getCuit(), "", 0, JOptionPane.QUESTION_MESSAGE, null, list, "");

                if (opcion == 0) {
                    Stock st = sd.solicitudStock(tipoVacuna.getText(), Integer.parseInt(jtCantidad.getText()), cv.getCodCentro(), lab.getCuit(), true);

                    JOptionPane.showMessageDialog(null, " La solicitud: " + st.getIdStock() + "\nVacuna tipo: " + st.getMarca()
                            + "\nCodigo de centro solicitante: " + st.getCodCentro() + "\nCuit del laboratorio: " + st.getCuit() + "\nGracias. Pronto recibirá lo solicitado.");

                } else {
                    JOptionPane.showMessageDialog(null, "Solicitud cancelada exitosamente");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Formato de cantidad solicitada no valido");
            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Formato de cantidad solicitada no valido");
        }

        jtCantidad.setText("");


    }//GEN-LAST:event_confirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcLaboratorioActionPerformed
        tipoVacuna.setText("");

        Laboratorio lab = (Laboratorio) jcLaboratorio.getSelectedItem();

        try {
            tipoVacuna.setText(lab.getProducto());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No posee producto para ofrecer");
        }
    }//GEN-LAST:event_jcLaboratorioActionPerformed

    public void llenarCB() {

        for (CentroVacunacion cent : cd.listarPorEstado(true)) {
            jcCentro.addItem(cent);
        }

    }

    private void llenarLab() {

        for (Laboratorio lab : ld.listarTodos()) {
            jcLaboratorio.addItem(lab);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<CentroVacunacion> jcCentro;
    private javax.swing.JComboBox<Laboratorio> jcLaboratorio;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField tipoVacuna;
    // End of variables declaration//GEN-END:variables
}
