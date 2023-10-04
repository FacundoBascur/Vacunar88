
package Vistas;

import Entidades.Ciudadano;
import Persistencias.CiudadanoData;



public class Main {

   
    public static void main(String[] args) {
   
   Ciudadano ciu=new Ciudadano(32608741, "Lucas Monzon", "lucasmonzon@gmail.com", 2214856824l, 5, 9, "Diabetes", "Educación");
      
   CiudadanoData ciu2=new CiudadanoData();
   ciu2.registrarCiudadano(ciu);
                }
    
}
