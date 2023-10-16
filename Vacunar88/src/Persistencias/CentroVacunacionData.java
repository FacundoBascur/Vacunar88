
package Persistencias;

import Entidades.CentroVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Entidades.CitaVacunacion;
import java.util.ArrayList;
import java.util.List;


public class CentroVacunacionData {
    
      private Connection con = null;
    
    public CentroVacunacionData() {
    con = Conexion.getConexion();
    } 
    
     public void registrarCentro(CentroVacunacion centro) {

        String sql = "INSERT INTO centrovacunacion (nombre,longXcentro,latYcentro,estado) VALUES (?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            ps.setString(1, centro.getNombre());
            ps.setInt(2, centro.getLongXcentro());
           ps.setInt(3, centro.getLatYcentro());
          ps.setBoolean(4, centro.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               centro.setCodCentro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Centro Vacunatorio registrado exitosamente.");
                ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el código del centro.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");
        }

    }    
    
     public List<CentroVacunacion> listarCentros() {
        CentroVacunacion centro = null;
        List<CentroVacunacion> lista = new ArrayList();

        try {

            String sql = "SELECT * FROM centrovacunacion";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                centro = new CentroVacunacion();
                centro.setCodCentro(rs.getInt("codCentro"));
                centro.setNombre(rs.getString("nombre"));
                centro.setLongXcentro(rs.getInt("longXcentro"));
                centro.setLatYcentro(rs.getInt("latYcentro"));
               centro.setEstado(rs.getBoolean("estado"));
                lista.add(centro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");
        }

        return lista;

    }
    
    
}
