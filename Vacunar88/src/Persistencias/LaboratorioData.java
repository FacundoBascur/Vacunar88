
package Persistencias;

import Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LaboratorioData {
    
    private Connection con = null;
    
    public LaboratorioData() {
    con = Conexion.getConexion();
    }
      
    
    public void registrarLab(Laboratorio lab){
        
        String sql = "INSERT INTO laboratorio(cuit,nombreLab,pais,domicilioCom) VALUES (?,?,?,?)";
        
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, lab.getCuit());
            ps.setString(2, lab.getNombreLab());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomicilioCom());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Laboratorio registrado correctamente.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Laboratorio.");
        }
    
    }
    
}
