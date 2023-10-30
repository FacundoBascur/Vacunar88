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
        registrar = new javax.swing.JButton();
        zona = new javax.swing.JComboBox<>();

        setResizable(true);
        setTitle(" Registrar ciudadano");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel1.setText("D.N.I");

        nombreCompleto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel2.setText("Apeliido y Nombre");

        dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nroCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel3.setText("Nro Celular");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel4.setText("Email");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel6.setText("Ubicacion");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Zona");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel8.setText("¿Posee patoliogias previas?");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        jLabel9.setText("Ambito laboral");

        ambLaboral.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Seleccionar >", "Norte", "Sur", "Este", "Oeste" }));

        javax.swing.GroupLayout CiudadanoNuevoLayout = new javax.swing.GroupLayout(CiudadanoNuevo);
        CiudadanoNuevo.setLayout(CiudadanoNuevoLayout);
        CiudadanoNuevoLayout.setHorizontalGroup(
            CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                            .addComponent(registrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))
                        .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nroCel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CiudadanoNuevoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(rbEstado))
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ambLaboral, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zona, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CiudadanoNuevoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patoCual, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        CiudadanoNuevoLayout.setVerticalGroup(
            CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CiudadanoNuevoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
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
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
                .addGap(33, 33, 33)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(CiudadanoNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(registrar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CiudadanoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    || email.getText().isEmpty()
                    || patoCual.getText().isEmpty() || ambLaboral.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios.");
                correcto = false;
            } else {
               
                
                if (verificar(nombreCompleto.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo 'Apellido y Nombre' en formato incorrecto, verifique.");
                    correcto = false;
                }
                if (!verificar(dni.getText())||dni.getText().length() != 8) {
                    JOptionPane.showMessageDialog(null, "Campo 'Dni' en formato incorrecto, verifique.");
                    correcto = false;
                }
                
                if (!verificar(nroCel.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo 'Nro Celular' en formato incorrecto, verifique.");
                    correcto = false;
                }
                if (verificar(email.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo 'Email' en formato incorrecto, verifique.");
                    correcto = false;
                }
                 if (zona.getSelectedItem().equals("< Seleccionar >")) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una zona correcta para continuar");
                    correcto = false;
                }
                if (verificar(patoCual.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo 'Patologia' en formato incorrecto, verifique.");
                    correcto = false;
                }
                if (verificar(ambLaboral.getText())) {
                    JOptionPane.showMessageDialog(null, "Campo 'Ambito Laboral' en formato incorrecto, verifique.");
                    correcto = false;
                }

                if (correcto) {
                    ciuD.registrarCiudadano(new Ciudadano(Integer.parseInt(dni.getText()), nombreCompleto.getText(), email.getText(), nroCel.getText(),
                            zona.getSelectedItem().toString(), patoCual.getText(), ambLaboral.getText(), rbEstado.isSelected()));

                    nombreCompleto.setText("");
                    dni.setText("");
                    nroCel.setText("");
                    email.setText("");
                    zona.setSelectedIndex(0);
                    patoCual.setText("");
                    ambLaboral.setText("");
                    rbSi.setSelected(false);
                    rbNo.setSelected(false);
                    rbEstado.setSelected(false);
                }

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error en Formato");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CiudadanoNuevo;
    private javax.swing.JTextField ambLaboral;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreCompleto;
    private javax.swing.JTextField nroCel;
    private javax.swing.JTextField patoCual;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables

    public boolean verificar(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
