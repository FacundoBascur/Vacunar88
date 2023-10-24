package Vistas;

import AppPackage.AnimationClass;

public class MainPrincipal extends javax.swing.JFrame {

    AnimationClass anim = new AnimationClass();

    public MainPrincipal() {
        initComponents();
        escritorio.setLayout(null); // con esta sentencia, doy control total sobre las ubicaciones de los elementos.
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        ciudadano = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        citas = new javax.swing.JLabel();
        centros = new javax.swing.JLabel();
        busModCiu = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        regCiu = new javax.swing.JLabel();
        regCitas = new javax.swing.JLabel();
        busModCitas = new javax.swing.JLabel();
        regCentros = new javax.swing.JLabel();
        busModCentros = new javax.swing.JLabel();
        regLab = new javax.swing.JLabel();
        busModLab = new javax.swing.JLabel();
        imagEscr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vacunación Covid-19");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        escritorio.setForeground(new java.awt.Color(255, 255, 255));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.setPreferredSize(new java.awt.Dimension(1280, 691));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2 .png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        ciudadano.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        ciudadano.setText(" Ciudadano");
        ciudadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadanoMouseClicked(evt);
            }
        });
        jPanel1.add(ciudadano, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 70, 130, -1));

        cerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cerrar.setText(" Cerrar");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 230, 130, -1));

        citas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        citas.setText(" Citas");
        citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citasMouseClicked(evt);
            }
        });
        jPanel1.add(citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 110, 130, -1));

        centros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        centros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hospital.png"))); // NOI18N
        centros.setText(" Centros");
        centros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centrosMouseClicked(evt);
            }
        });
        jPanel1.add(centros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 150, 130, -1));

        busModCiu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        busModCiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        busModCiu.setText("Buscar/Modificar");
        busModCiu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busModCiuMouseClicked(evt);
            }
        });
        jPanel1.add(busModCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 110, 190, -1));

        lab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/laboratorio.png"))); // NOI18N
        lab.setText(" Laboratorios");
        lab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labMouseClicked(evt);
            }
        });
        jPanel1.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 190, 130, -1));

        regCiu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regCiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        regCiu.setText(" Registro");
        regCiu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regCiuMouseClicked(evt);
            }
        });
        jPanel1.add(regCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 70, 130, -1));

        regCitas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        regCitas.setText(" Registro");
        regCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regCitasMouseClicked(evt);
            }
        });
        jPanel1.add(regCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 110, 130, -1));

        busModCitas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        busModCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        busModCitas.setText("Buscar/Modificar");
        busModCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busModCitasMouseClicked(evt);
            }
        });
        jPanel1.add(busModCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 150, 190, -1));

        regCentros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regCentros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        regCentros.setText(" Registro");
        regCentros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regCentrosMouseClicked(evt);
            }
        });
        jPanel1.add(regCentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 150, 130, -1));

        busModCentros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        busModCentros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        busModCentros.setText("Buscar/Modificar");
        busModCentros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busModCentrosMouseClicked(evt);
            }
        });
        jPanel1.add(busModCentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 190, 190, -1));

        regLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        regLab.setText(" Registro");
        regLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regLabMouseClicked(evt);
            }
        });
        jPanel1.add(regLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 190, 130, -1));

        busModLab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        busModLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        busModLab.setText("Buscar/Modificar");
        busModLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busModLabMouseClicked(evt);
            }
        });
        jPanel1.add(busModLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 230, 190, -1));

        escritorio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));

        imagEscr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escritorio.jpg"))); // NOI18N
        escritorio.add(imagEscr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("jLabel1");
        escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regCiuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regCiuMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(jPanel1);
        CiudadanoNuevo cn = new CiudadanoNuevo();
        cn.setVisible(true);
        cn.setFrameIcon(null);
        cn.setLocation(369, 92);
        escritorio.add(cn);
        escritorio.add(imagEscr);
    }//GEN-LAST:event_regCiuMouseClicked

    private void busModCiuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busModCiuMouseClicked
        escritorio.removeAll();
        escritorio.repaint(); 
        escritorio.add(jPanel1);
        BuscarModCiud bm = new BuscarModCiud();
        bm.setVisible(true);
        bm.setFrameIcon(null);
        bm.setLocation(230, 96);
        escritorio.add(bm);
        escritorio.add(imagEscr);
    }//GEN-LAST:event_busModCiuMouseClicked

    private void regCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regCitasMouseClicked

    }//GEN-LAST:event_regCitasMouseClicked

    private void busModCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busModCitasMouseClicked

    }//GEN-LAST:event_busModCitasMouseClicked

    private void regCentrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regCentrosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(jPanel1);
        RegistroCentros regis = new RegistroCentros();
        regis.setVisible(true);
        regis.setFrameIcon(null);
        escritorio.add(regis);
        escritorio.moveToFront(regis);
        regis.setLocation(379, 221);
         escritorio.add(imagEscr);
    }//GEN-LAST:event_regCentrosMouseClicked

    private void busModCentrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busModCentrosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(jPanel1);
        BusqModifCentros buscar = new BusqModifCentros();
        buscar.setVisible(true);
        buscar.setFrameIcon(null);
        escritorio.add(buscar);
        escritorio.moveToFront(buscar);
        buscar.setLocation(361, 89);
         escritorio.add(imagEscr);
    }//GEN-LAST:event_busModCentrosMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        anim.jLabelXRight(-130, 10, 10, 5, ciudadano);
        anim.jLabelXRight(-130, 10, 10, 5, citas);
        anim.jLabelXRight(-130, 10, 10, 5, centros);
        anim.jLabelXRight(-130, 10, 10, 5, lab);
        anim.jLabelXRight(-130, 10, 10, 5, cerrar);
        anim.jLabelXLeft(10, -130, 10, 5, ciudadano);
        anim.jLabelXLeft(10, -130, 10, 5, citas);
        anim.jLabelXLeft(10, -130, 10, 5, centros);
        anim.jLabelXLeft(10, -130, 10, 5, lab);
        anim.jLabelXLeft(10, -130, 10, 5, cerrar);
        anim.jLabelXLeft(10, -200, 10, 5, regCiu);
        anim.jLabelXLeft(10, -200, 10, 5, busModCiu);
        anim.jLabelXLeft(10, -200, 10, 5, regCitas);
        anim.jLabelXLeft(10, -200, 10, 5, busModCitas);
        anim.jLabelXLeft(10, -200, 10, 5, regCentros);
        anim.jLabelXLeft(10, -200, 10, 5, busModCentros);
        anim.jLabelXLeft(10, -200, 10, 5, regLab);
        anim.jLabelXLeft(10, -200, 10, 5, busModLab);
    }//GEN-LAST:event_menuMouseClicked

    private void ciudadanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadanoMouseClicked
        anim.jLabelXRight(-200, 10, 10, 5, regCiu);
        anim.jLabelXRight(-200, 10, 10, 5, busModCiu);
        menuMouseClicked(evt);
    }//GEN-LAST:event_ciudadanoMouseClicked

    private void citasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasMouseClicked
        anim.jLabelXRight(-200, 10, 10, 5, regCitas);
        anim.jLabelXRight(-200, 10, 10, 5, busModCitas);
        menuMouseClicked(evt);
    }//GEN-LAST:event_citasMouseClicked

    private void centrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centrosMouseClicked
        anim.jLabelXRight(-200, 10, 10, 5, regCentros);
        anim.jLabelXRight(-200, 10, 10, 5, busModCentros);
        menuMouseClicked(evt);
    }//GEN-LAST:event_centrosMouseClicked

    private void labMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMouseClicked
        anim.jLabelXRight(-200, 10, 10, 5, regLab);
        anim.jLabelXRight(-200, 10, 10, 5, busModLab);
        menuMouseClicked(evt);
    }//GEN-LAST:event_labMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void regLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLabMouseClicked
       escritorio.removeAll();
       escritorio.repaint();
       escritorio.add(jPanel1);
       RegistroLab reLab = new RegistroLab();
       reLab.setVisible(true);
       reLab.setFrameIcon(null);
       reLab.setLocation(412,168);
       escritorio.add(reLab);
       escritorio.add(imagEscr);
    }//GEN-LAST:event_regLabMouseClicked

    private void busModLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busModLabMouseClicked
       escritorio.removeAll();
       escritorio.repaint();
       escritorio.add(jPanel1);
       BusqModifLab modLab= new BusqModifLab();
       modLab.setVisible(true);
       modLab.setFrameIcon(null);
       modLab.setLocation(220, 159);
       escritorio.add(modLab);
       escritorio.add(imagEscr);
       
    }//GEN-LAST:event_busModLabMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel busModCentros;
    private javax.swing.JLabel busModCitas;
    private javax.swing.JLabel busModCiu;
    private javax.swing.JLabel busModLab;
    private javax.swing.JLabel centros;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel citas;
    private javax.swing.JLabel ciudadano;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel imagEscr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel regCentros;
    private javax.swing.JLabel regCitas;
    private javax.swing.JLabel regCiu;
    private javax.swing.JLabel regLab;
    // End of variables declaration//GEN-END:variables
}
