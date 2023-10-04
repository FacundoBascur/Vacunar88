
package Persistencias;

import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CiudadanoData {
    
    private Connection con=null;
    
    public CiudadanoData(){
    con=Conexion.getConexion();
    }
    
public void registrarCiudadano(Ciudadano ciu){

String sql= "INSERT INTO ciudadano (dni, nombreCompleto, email, celular, longXciu, latYciu, patologia, ambitoTrabajo) "
        + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, ciu.getDni());
            ps.setString(2, ciu.getNombreCompleto());
            ps.setString(3, ciu.getEmail());
            ps.setLong(4, ciu.getCelular());
            ps.setInt(5, ciu.getLongXciu());
            ps.setInt(6, ciu.getLatYciu());
            ps.setString(7, ciu.getPatologia());
            ps.setString(8, ciu.getAmbitoTrabajo());
            
        ps.executeUpdate();
            
          JOptionPane.showMessageDialog(null, "Ciudadano registrado correctamente.");
            
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
        }




}
    
    
    
    
    
}
