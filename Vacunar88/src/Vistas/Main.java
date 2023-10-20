package Vistas;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registro = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMRegistroCentros = new javax.swing.JMenu();
        jMRegistroCen = new javax.swing.JMenuItem();
        jMBusqModifCentros = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMRegLab = new javax.swing.JMenuItem();
        jMBusqModLab = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addGap(17, 17, 17))
        );

        jMenu1.setText(" Ciudadanos");

        registro.setText("Registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jMenu1.add(registro);

        jMenuItem2.setText("Búsqueda y modificaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Citas");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMRegistroCentros.setText("Centros");

        jMRegistroCen.setText("Registro");
        jMRegistroCen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistroCenActionPerformed(evt);
            }
        });
        jMRegistroCentros.add(jMRegistroCen);

        jMBusqModifCentros.setText("Búsqueda y modificaciones");
        jMBusqModifCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBusqModifCentrosActionPerformed(evt);
            }
        });
        jMRegistroCentros.add(jMBusqModifCentros);

        jMenuBar1.add(jMRegistroCentros);

        jMenu4.setText("Laboratorios");

        jMRegLab.setText("Registro");
        jMRegLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegLabActionPerformed(evt);
            }
        });
        jMenu4.add(jMRegLab);

        jMBusqModLab.setText("Búsqueda y modificación");
        jMBusqModLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBusqModLabActionPerformed(evt);
            }
        });
        jMenu4.add(jMBusqModLab);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CiudadanoNuevo cn = new CiudadanoNuevo();
        cn.setVisible(true);
        cn.setFrameIcon(null);
        cn.setLocation(175, 70);
        escritorio.add(cn);
    }//GEN-LAST:event_registroActionPerformed

    private void jMRegistroCenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistroCenActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RegistroCentros regis = new RegistroCentros();
        regis.setVisible(true);
        regis.setFrameIcon(null);
        escritorio.add(regis);
        escritorio.moveToFront(regis);
        regis.setLocation(279, 106);
    }//GEN-LAST:event_jMRegistroCenActionPerformed

    private void jMBusqModifCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBusqModifCentrosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusqModifCentros buscar = new BusqModifCentros();
        buscar.setVisible(true);
        buscar.setFrameIcon(null);
        escritorio.add(buscar);
        escritorio.moveToFront(buscar);
        buscar.setLocation(261, 77);
    }//GEN-LAST:event_jMBusqModifCentrosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BuscarModCiud bm = new BuscarModCiud();
        bm.setVisible(true);
        bm.setFrameIcon(null);
        bm.setLocation(130, 85);
        escritorio.add(bm);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMRegLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegLabActionPerformed
          escritorio.removeAll();
        escritorio.repaint();
        RegistroLab reg= new RegistroLab();
        reg.setVisible(true);
        reg.setFrameIcon(null);
        escritorio.add(reg);
        escritorio.moveToFront(reg);
        reg.setLocation(261, 77);
    }//GEN-LAST:event_jMRegLabActionPerformed

    private void jMBusqModLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBusqModLabActionPerformed
          escritorio.removeAll();
        escritorio.repaint();
        BusqModifLab bus= new BusqModifLab();
        bus.setVisible(true);
        bus.setFrameIcon(null);
        escritorio.add(bus);
        escritorio.moveToFront(bus);
        bus.setLocation(261, 77);
    }//GEN-LAST:event_jMBusqModLabActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMBusqModLab;
    private javax.swing.JMenuItem jMBusqModifCentros;
    private javax.swing.JMenuItem jMRegLab;
    private javax.swing.JMenuItem jMRegistroCen;
    private javax.swing.JMenu jMRegistroCentros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem registro;
    // End of variables declaration//GEN-END:variables

}
