
package Vistas;

import Entidades.Ciudadano;
import Persistencias.CiudadanoData;



public class Main {

   
    public static void main(String[] args) {
  //Ciudadano ciu=new Ciudadano(32608741, "Lucas Monzon", "lucasmonzon@gmail.com", 2214856824l, 5, 9, "Diabetes", "Educación",0,true);
   //Ciudadano ciu3=new Ciudadano(32608740, "Este Banquito", "estebanquito@gmail.com", 221412324l, 5, 9, null, "Ingeniero",0,true);
      
   CiudadanoData ciu2=new CiudadanoData();
   //ciu2.registrarCiudadano(ciu);
   //ciu2.registrarCiudadano(ciu3);
   
        //System.out.println(ciu2.listarCiudadanosRegistrados());
        //System.out.println(ciu2.buscarXdni(32608741));
    Ciudadano ciu4=ciu2.buscarXdni(32608741);
 // ciu2.modificarEstado(ciu4.isEstado(), ciu4.getDni());
       // System.out.println("estado = " + ciu4.isEstado());
        ciu2.modificarCiudadano(32608743, "Lionel Messi", "lionelmessi@gmail.com", 2215489632l, 4, 2, "Hemorroides", 
                "Seguridad", 2,32608741);
    }
    
}
