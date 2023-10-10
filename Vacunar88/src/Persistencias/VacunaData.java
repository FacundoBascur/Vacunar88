
package Persistencias;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class VacunaData {
    
     private Connection con = null;
    
    public VacunaData() {
    con = Conexion.getConexion();
    } 
    
     public void registrarVac(int nroSerieDosis, String marca, double medida, Date fechaVenc, 
             boolean colocada, String cuit) {

         Vacuna vac=null; 
         
        String sql = "INSERT INTO vacuna (nroSerieDosis,marca,medida,fechaVenc,colocada, cuit) VALUES (?,?,?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, nroSerieDosis);
            ps.setString(2, marca);
            ps.setDouble(3, medida);
            ps.setDate(4, fechaVenc);
            ps.setBoolean(5, colocada);
            ps.setString(6, cuit);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               vac.setIdVacuna(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Vacuna registrada exitosamente.");
                ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el id.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a vacuna.");
        }

    }    
    
    
}
