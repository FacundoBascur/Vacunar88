
package Persistencias;

import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class CitaVacunacionData {
       private Connection con = null;
    
    public CitaVacunacionData() {
    con = Conexion.getConexion();
    } 
    
    public void registrarCita(int dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion,
             LocalDateTime fechaHoraVac, int nroSerieDosis, boolean estado) {
CitaVacunacion cita=null;
        String sql = "INSERT INTO citavacunacion (dni,codRefuerzo,fechaHoraCita,"
                + "centroVacunacion,fechaHoraVac,nroSerieDosis, estado) VALUES (?,?,?,?,?,?,?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dni);
            ps.setInt(2, codRefuerzo);
            ps.setString(3, fechaHoraCita);
            ps.setString(4, centroVacunacion);
            ps.setTimestamp(5, java.sql.Timestamp.valueOf(fechaHoraVac));
            ps.setInt (6, nroSerieDosis);
            ps.setBoolean(7, estado);
          
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
     
    public void cancelarCita(int codCita) {
    String sql = "UPDATE citavacunacion SET estado = 0 WHERE codCita = ? AND estado IN (1, 2)"; // 1 para "pendiente" y 2 para "activa", les parece?
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codCita);
        
        int result = ps.executeUpdate();
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Cita cancelada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo cancelar la cita o la cita ya está cancelada/completada.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cancelar la cita.");
    }

}
     
    public void modificarCita(int codCita, int dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraVac, int nroSerieDosis) {
    String sql = "UPDATE citavacunacion SET dni = ?, codRefuerzo = ?, fechaHoraCita = ?, centroVacunacion = ?, fechaHoraVac = ?, nroSerieDosis = ? WHERE codCita = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ps.setInt(2, codRefuerzo);
        ps.setString(3, fechaHoraCita);
        ps.setString(4, centroVacunacion);
        ps.setTimestamp(5, java.sql.Timestamp.valueOf(fechaHoraVac));
        ps.setInt(6, nroSerieDosis);
        ps.setInt(7, codCita);
        
        int result = ps.executeUpdate();
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Cita modificada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la cita o la cita no existe.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar la cita.");
    }
}
    
    public void actualizarEstadoCita(int codCita, int nuevoEstado) {
    String sql = "UPDATE citavacunacion SET estado = ? WHERE codCita = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nuevoEstado);
        ps.setInt(2, codCita);
        
        int result = ps.executeUpdate();
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Estado de la cita actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado de la cita o la cita no existe.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la cita.");
    }
}
    
    public List<CitaVacunacion> buscarCitasPorDNI(int dni) {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE dni = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                citas.add(cita);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar citas por DNI.");
        }
        
        return citas;
    }
     
    public List<CitaVacunacion> listarCitas() {
    List<CitaVacunacion> listaCitas = new ArrayList<>();
    String sql = "SELECT * FROM citavacunacion";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            CitaVacunacion cita = new CitaVacunacion();
            cita.setCodCita(rs.getInt("codCita"));
            cita.setDni(rs.getInt("dni"));
            cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
            cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
            cita.setCentroVacunacion(rs.getInt("centroVacunacion"));
            cita.setFechaHoraVac(rs.getTimestamp("fechaHoraVac").toLocalDateTime());
            cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
            cita.setEstado(rs.getBoolean("estado"));
            listaCitas.add(cita);
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar las citas de vacunación.");
    }
    
    return listaCitas;
}
 
    public List<CitaVacunacion> listarCitasPendientes() {
    List<CitaVacunacion> citasPendientes = new ArrayList<>();
    String sql = "SELECT * FROM citavacunacion WHERE estado = true"; // Suponiendo que true representa "pendiente"
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            CitaVacunacion cita = new CitaVacunacion();
            cita.setCodCita(rs.getInt("codCita"));
            cita.setDni(rs.getInt("dni"));
            cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
            cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
            cita.setCentroVacunacion(rs.getInt("centroVacunacion"));
            cita.setFechaHoraVac(rs.getTimestamp("fechaHoraVac").toLocalDateTime());
            cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
            cita.setEstado(rs.getBoolean("estado"));
            citasPendientes.add(cita);
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al listar las citas pendientes.");
    }
    
    return citasPendientes;
}
 
    public void asignarVacunaACita(int codCita, int nroSerieDosis) {
    String sql = "UPDATE citavacunacion SET idVacuna = ? WHERE codCita = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nroSerieDosis);
        ps.setInt(2, codCita);
        
        int result = ps.executeUpdate();
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Vacuna asignada a la cita exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo asignar la vacuna a la cita.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al asignar la vacuna a la cita.");
    }
}
    
    public Ciudadano obtenerCiudadanoPorCodCita(int codCita) {
    Ciudadano ciudadano = null;

    String sql = "SELECT c.* FROM citavacunacion AS cv " +
                 "JOIN ciudadano AS c ON cv.dni = c.dni " +
                 "WHERE cv.codCita = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codCita);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            ciudadano = new Ciudadano();
            ciudadano.setDni(rs.getInt("dni"));
            ciudadano.setNombreCompleto(rs.getString("nombreCompleto"));
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener Ciudadano.");
    }

    return ciudadano;
}
    
    public long DiferenciaEntreFechas(int codCita) {
    String sql = "SELECT fechaHoraCita, fechaHoraVac FROM citavacunacion WHERE codCita = ?";
    long diferenciaDias = -1;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codCita);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            LocalDateTime fechaProgramacion = LocalDateTime.parse(rs.getString("fechaHoraCita"));
            LocalDateTime fechaInoculacion = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
            
            diferenciaDias = ChronoUnit.DAYS.between(fechaProgramacion, fechaInoculacion);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al calcular la diferencia de fechas.");
    }

    return diferenciaDias;
}
    
    public Duration calcularDiferenciaFechas(LocalDateTime fechaProgramacion, LocalDateTime fechaInoculacion) {
        return Duration.between(fechaProgramacion, fechaInoculacion);
    }

}