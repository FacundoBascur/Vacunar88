
package Vistas;


public class Main2 extends javax.swing.JFrame {

    
    public Main2() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Ciudadanos");

        jMenuItem2.setText("Registro");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Búsqueda y modificación");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Citas");

        jMenuItem5.setText("Generación");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Búsqueda y modificación");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laboratorios");

        jMenuItem9.setText("Registro");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Búsqueda y modificación");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Centros");

        jMenuItem11.setText("Registro");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Búsqueda y modificación");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Stock");

        jMenuItem13.setText("Ingreso lote");
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Inventario/modificaciones");
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

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

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}






/*package Vistas;

import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Persistencias.CiudadanoData;
import Entidades.Stock;
import Persistencias.LaboratorioData;
import Persistencias.StockData;



public class Main {

   
    public static void main(String[] args) {
 //Ciudadano ciu=new Ciudadano(32608741, "Lucas Monzon", "lucasmonzon@gmail.com", 2214856824l, 5, 9, "Diabetes", "Educación",0,true);
   //Ciudadano ciu3=new Ciudadano(32608740, "Este Banquito", "estebanquito@gmail.com", 221412324l, 5, 9, null, "Ingeniero",0,true);
      
   //CiudadanoData ciu2=new CiudadanoData();
   //ciu2.registrarCiudadano(ciu);
   //ciu2.registrarCiudadano(ciu3);
   
        //System.out.println(ciu2.listarCiudadanosRegistrados());
        //System.out.println(ciu2.buscarXdni(32608741));
    //Ciudadano ciu4=ciu2.buscarXdni(32608741);
 // ciu2.modificarEstado(ciu4.isEstado(), ciu4.getDni());
       // System.out.println("estado = " + ciu4.isEstado());
       // ciu2.modificarCiudadano(32608743, "Lionel Messi", "lionelmessi@gmail.com", 2215489632l, 4, 2, "Hemorroides", 
        //        "Seguridad", 2,32608741);
        
    
        //Laboratorio lab = new Laboratorio("3012345670", "Beijing Institute of Biological Products", "China", "No. 6, 2nd Boxing Road, Beijing Economic-Technological Development Area",true);
        LaboratorioData labData = new LaboratorioData();
        //labData.registrarLab(lab);
        
        //labData.baja("3012345670");
        System.out.println(labData.buscarPorCuit("3012345670"));
        
        StockData stock = new StockData();
        Stock st1 = new Stock("Sinopharm", 10, 1 ,"3012345670" , true);
        
        Stock st2 = stock.solicitudStock(st1.getMarca(),st1.getCantidad(), st1.getCodCentro(), st1.getCuit(), st1.isEstado());
       
       
        //System.out.println(labData.producirVacunas(st2));
        
    }
    
}
*/