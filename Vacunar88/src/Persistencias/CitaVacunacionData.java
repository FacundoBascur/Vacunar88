
package Persistencias;

import Entidades.CitaVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 import java.time.LocalDateTime;

import javax.swing.JOptionPane;


public class CitaVacunacionData {
       private Connection con = null;
    
    public CitaVacunacionData() {
    con = Conexion.getConexion();
    } 
    
     public void registrarCita(int dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraVac, int idVacuna) {
CitaVacunacion cita=null;
        String sql = "INSERT INTO citavacunacion (dni,codRefuerzo,fechaHoraCita,"
                + "centroVacunacion,fechaHoraVac,idVacuna) VALUES (?,?,?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dni);
            ps.setInt(2, codRefuerzo);
            ps.setString(3, fechaHoraCita);
            ps.setString(4, centroVacunacion);
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(fechaHoraVac));
            ps.setInt (6, idVacuna);
          
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               cita.setCodCita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cita registrada exitosamente.");
                ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo obtener el codCita.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CitaVacunacion.");
        }

    }    
    
}
