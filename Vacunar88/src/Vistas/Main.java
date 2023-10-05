
package Vistas;

import Entidades.Ciudadano;
import Persistencias.CiudadanoData;



public class Main {

   
    public static void main(String[] args) {
   
   Ciudadano ciu=new Ciudadano(32608742, "Lucas Suarez", "lucassuarez@gmail.com", 2214856825l, 1, 5, null, "Seguridad");
      
   CiudadanoData ciu2=new CiudadanoData();
   ciu2.registrarCiudadano(ciu);
                }
    
}
