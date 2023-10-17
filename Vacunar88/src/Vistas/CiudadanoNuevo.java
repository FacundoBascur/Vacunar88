package Vistas;

import Entidades.Ciudadano;
import Persistencias.*;
import javax.swing.JOptionPane;

public class CiudadanoNuevo extends javax.swing.JInternalFrame {

    CiudadanoData ciuD = new CiudadanoData();
    int dosis;

    public CiudadanoNuevo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CiudadanoNuevo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreCompleto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        nroCel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        longitud = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        patoCual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ambLaboral = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbSi = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rbNo = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        latitud = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        dosis1 = new javax.swing.JRadioButton();
        dosis2 = new javax.swing.JRadioButton();
        dosis3 = new javax.swing.JRadioButton();
        dosis0 = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel1.setText("D.N.I");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel2.setText("Apeliido y Nombre");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel3.setText("Nro Celular");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lat");

        longitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel6.setText("Ubicacion");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Long");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel8.setText("¿Posee patoliogias previas?");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel9.setText("Ambito laboral");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel10.setText("Estado");

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel11.setText("Activo");

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel12.setText("SI");

        rbSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbSiMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel13.setText("No");

        rbNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbNoMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel14.setText("¿Cuál?");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        latitud.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel15.setText("Dosis");

        dosis1.setText("1");
        dosis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosis1MouseClicked(evt);
            }
        });

        dosis2.setText("2");
        dosis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosis2MouseClicked(evt);
            }
        });

        dosis3.setText("3");
        dosis3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosis3MouseClicked(evt);
            }
        });

        dosis0.setText("0");
        dosis0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosis0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CiudadanoNuevoLayout = new javax.swing.GroupLayout(CiudadanoNuevo);
        CiudadanoNuevo.setLayout(CiudadanoNuevoLayout);
        CiudadanoNuevoLayout.setHorizontalGroup(
            CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CiudadanoNuevoLayout.createSequentialGroup()
                        .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ambLaboral)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CiudadanoNuevoLayout.createSequentialGroup()
                                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(longitud)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                    .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patoCual, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(latitud, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreCompleto)
                                    .addComponent(dni)
                                    .addComponent(nroCel)
                                    .addComponent(email)
                                    .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                                                .addComponent(dosis0)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dosis1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dosis2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dosis3)
                                                .addGap(161, 161, 161))
                                            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbEstado)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(100, 100, 100))
        );
        CiudadanoNuevoLayout.setVerticalGroup(
            CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nroCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patoCual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ambLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dosis1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosis2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosis3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosis0, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CiudadanoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CiudadanoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        boolean correcto = true;

        try {

            if (nombreCompleto.getText().isEmpty() || dni.getText().isEmpty() || nroCel.getText().isEmpty()
                    || email.getText().isEmpty() || longitud.getText().isEmpty() || latitud.getText().isEmpty()
                    || patoCual.getText().isEmpty() || ambLaboral.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios.");
                correcto = false;
            } else if (verificar(nombreCompleto.getText()) || !verificar(nroCel.getText())
                    || verificar(email.getText()) || verificar(patoCual.getText()) || verificar(ambLaboral.getText())) {
                JOptionPane.showMessageDialog(null, "Ha ingresado campos en formato incorrectos, verifique.");
                correcto = false;
            }

            if (dosis0.isSelected()) {
                dosis = 0;
            }
            if (dosis1.isSelected()) {
                dosis = 1;
            }
            if (dosis2.isSelected()) {
                dosis = 2;
            }
            if (dosis3.isSelected()) {
                dosis = 3;
            }

            if (correcto) {
                ciuD.registrarCiudadano(new Ciudadano(Integer.parseInt(dni.getText()), nombreCompleto.getText(), email.getText(), nroCel.getText(),
                        Integer.parseInt(longitud.getText()), Integer.parseInt(latitud.getText()), patoCual.getText(), ambLaboral.getText(), dosis, rbEstado.isSelected()));
            }
            
            nombreCompleto.setText("");
            dni.setText("");
            nroCel.setText("");
            email.setText("");
            longitud.setText("");
            latitud.setText("");
            patoCual.setText("");
            ambLaboral.setText("");
            rbSi.setSelected(false);
            rbNo.setSelected(false);
            dosis0.setSelected(false);
            dosis1.setSelected(false);
            dosis2.setSelected(false);
            dosis3.setSelected(false);
            rbEstado.setSelected(false);

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en formato Dni y/o ubicacion.");
        }

        
    }//GEN-LAST:event_registrarActionPerformed

    private void rbSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSiMouseClicked
        patoCual.setText("");
        rbNo.setSelected(false);
        patoCual.setEnabled(true);
    }//GEN-LAST:event_rbSiMouseClicked

    private void rbNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbNoMouseClicked

        patoCual.setText("S/P");
        rbSi.setSelected(false);
        patoCual.setEnabled(false);
    }//GEN-LAST:event_rbNoMouseClicked

    private void dosis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosis1MouseClicked
        dosis0.setSelected(false);
        dosis2.setSelected(false);
        dosis3.setSelected(false);
    }//GEN-LAST:event_dosis1MouseClicked

    private void dosis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosis2MouseClicked
        dosis0.setSelected(false);
        dosis1.setSelected(false);
        dosis3.setSelected(false);
    }//GEN-LAST:event_dosis2MouseClicked

    private void dosis0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosis0MouseClicked
        dosis1.setSelected(false);
        dosis2.setSelected(false);
        dosis3.setSelected(false);
    }//GEN-LAST:event_dosis0MouseClicked

    private void dosis3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosis3MouseClicked
        dosis0.setSelected(false);
        dosis2.setSelected(false);
        dosis1.setSelected(false);
    }//GEN-LAST:event_dosis3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CiudadanoNuevo;
    private javax.swing.JTextField ambLaboral;
    private javax.swing.JTextField dni;
    private javax.swing.JRadioButton dosis0;
    private javax.swing.JRadioButton dosis1;
    private javax.swing.JRadioButton dosis2;
    private javax.swing.JRadioButton dosis3;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField latitud;
    private javax.swing.JTextField longitud;
    private javax.swing.JTextField nombreCompleto;
    private javax.swing.JTextField nroCel;
    private javax.swing.JTextField patoCual;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables

    public boolean verificar(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
