package Persistencias;

import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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

    public void registrarCita(int dni, int codRefuerzo, String fechaHoraCita, int codCentro,
            LocalDateTime fechaHoraVac, int nroSerieDosis, boolean estado) {

        CitaVacunacion cita = new CitaVacunacion(dni, codRefuerzo, fechaHoraCita, codCentro, fechaHoraVac, nroSerieDosis, estado);

        String sql = "INSERT INTO citavacunacion (dni,codRefuerzo,fechaHoraCita,"
                + "codCentro,fechaHoraVac,nroSerieDosis, estado) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dni);
            ps.setInt(2, codRefuerzo);
            ps.setString(3, fechaHoraCita);
            ps.setInt(4, codCentro);
            /*  
            if (fechaHoraVac != null) {
                ps.setTimestamp(5, Timestamp.valueOf(fechaHoraVac));
            } else {
                ps.setNull(5, java.sql.Types.TIMESTAMP);
            }
             */
            ps.setNull(5, java.sql.Types.TIMESTAMP);
            ps.setInt(6, nroSerieDosis);
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

    public void cancelarCita(int codCita,int dni) {
        String sql = "UPDATE citavacunacion SET fechaHoraCita = 'CANCELADA', estado = false WHERE codCita = ? AND dni = ?"; // 1 para "pendiente" y 2 para "activa", les parece?

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCita);
            ps.setInt(2, dni);
            

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

    public void reprogramarFecha(String fecha, int codCita) {

        String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE codCita = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha);
            ps.setInt(2, codCita);

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

    public void vacunaAplicada(Timestamp fecha, boolean estado, int codCita) {

        String sql = "UPDATE citavacunacion SET fechaHoraVac = ?, estado = ? WHERE codCita=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, fecha);
            ps.setBoolean(2, estado);
            ps.setInt(3, codCita);

            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion realizada, la vacuna fue aplicada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la cita o la cita no existe.");
            }

            ps.close();

        } catch (SQLException e) {
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

    public List<CitaVacunacion> buscarCitasPorDNISA(int dni) {
        List<CitaVacunacion> citas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE dni = ? AND fechaHoraCita != 'CANCELADA'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("codCentro"));
                if (rs.getTimestamp("fechaHoraVac") == null) {
                    cita.setFechaHoraVac(null);
                } else {
                    LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                    cita.setFechaHoraVac(fecha);
                }
                cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
                cita.setEstado(rs.getBoolean("estado"));

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
                cita.setCentroVacunacion(rs.getInt("codCentro"));

                if (rs.getTimestamp("fechaHoraVac") == null) {
                    cita.setFechaHoraVac(null);
                } else {
                    LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                    cita.setFechaHoraVac(fecha);
                }

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

    public List<CitaVacunacion> listarCitasXEstado(boolean estado) {
        List<CitaVacunacion> citasPendientes = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE estado = ?"; // Suponiendo que true representa "pendiente"

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("codCentro"));
                if (rs.getTimestamp("fechaHoraVac") == null) {
                    cita.setFechaHoraVac(null);
                } else {
                    LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                    cita.setFechaHoraVac(fecha);
                }
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

        String sql = "SELECT c.* FROM citavacunacion AS cv "
                + "JOIN ciudadano AS c ON cv.dni = c.dni "
                + "WHERE cv.codCita = ?";

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

    public List<CitaVacunacion> citasCanceladas(){
        List<CitaVacunacion> canceladas = new ArrayList<>();
        String sql = "SELECT * FROM citavacunacion WHERE fechaHoraCita = 'CANCELADA'";
    
    try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CitaVacunacion cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("codCentro"));
                if (rs.getTimestamp("fechaHoraVac") == null) {
                    cita.setFechaHoraVac(null);
                } else {
                    LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                    cita.setFechaHoraVac(fecha);
                }
                cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
                cita.setEstado(rs.getBoolean("estado"));
                canceladas.add(cita);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las citas pendientes.");
        }

        return canceladas;
    
    }

    public CitaVacunacion BuscarCitaPorDniEstado(int dni, int codRe) {
        CitaVacunacion cita = null;
        String sql = "SELECT * FROM citavacunacion WHERE dni = ? AND estado = 0 AND codRefuerzo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setInt(2, codRe);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("codCentro"));
                LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                cita.setFechaHoraVac(fecha);
                cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
                cita.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la cita por código.");
        }

        return cita;
    }

    public int contarVacunasXCentro(int cod) {
        int total = 0;
        String sql = "SELECT COUNT(*) FROM citavacunacion WHERE codCentro = ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                total = resultado.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla cita.");
        }
        return total;
    }

    public List<CitaVacunacion> citaXcentro(int codCentro) {
        List<CitaVacunacion> lista = new ArrayList<>();
        CitaVacunacion cita = null;
        String sql = "SELECT * FROM citavacunacion WHERE codCentro = ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCentro);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("codCentro"));
                LocalDateTime fecha = rs.getTimestamp("fechaHoraVac").toLocalDateTime();
                cita.setFechaHoraVac(fecha);
                cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
                cita.setEstado(rs.getBoolean("estado"));
                lista.add(cita);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la cita por código.");
        }

        return lista;

    }

}
