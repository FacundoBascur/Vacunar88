
package Persistencias;

import Entidades.CitaVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import.java.util.Local Date Time;
import javax.swing.JOptionPane;


public class CitaVacunacionData {
       private Connection con = null;
    
    public CitaVacunacionData() {
    con = Conexion.getConexion();
    } 
    
     public void registrarCita(CitaVacunacion cita) {

        String sql = "INSERT INTO citavacunacion (dni,codRefuerzo,fechaHoraCita,"
                + "centroVacunacion,fechaHoraVac,idVacuna) VALUES (?,?,?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, (Int)(cita.getDni()));
            ps.setInt(2, cita.getCodRefuerzo());
            ps.setString(3, cita.getFechaHoraCita());
            ps.setDateTime(5,    (cita.getFechaHoraVac());
            ps.set(Vacuna)(6,cita.getIdVacuna());
            ps.setString(4, cita.getCentroVacunacion());
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
