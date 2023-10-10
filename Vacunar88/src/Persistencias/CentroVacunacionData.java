
package Persistencias;

import Entidades.CentroVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Entidades.CitaVacunacion;


public class CentroVacunacionData {
    
      private Connection con = null;
    
    public CentroVacunacionData() {
    con = Conexion.getConexion();
    } 
    
     public void registrarCentro(CentroVacunacion centro) {

        String sql = "INSERT INTO centrovacunacion (nombre,longXcentro,latYcentro,codCita) VALUES (?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            ps.setString(1, centro.getNombre());
            ps.setInt(2,centro.getLongXcentro());
           ps.setInt(3, centro.getLatYcentro());
          (CitaVacunacion)ps.setInt(4, (centro.getCodCita()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               centro.setCodCentro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Centro registrado exitosamente.");
                ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el Código del centro.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");
        }

    }    
    
    
    
    
}
