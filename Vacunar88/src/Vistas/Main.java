
package Vistas;

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
