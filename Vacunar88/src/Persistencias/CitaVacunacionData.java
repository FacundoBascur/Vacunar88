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
        String sql = "SELECT * FROM citavacunacion WHERE dni = ?";

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

    public long DiferenciaEntreDias(int codCita) {
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

    public boolean validarIntervaloDosis(int codCita, LocalDateTime fechaHoraCita, LocalDateTime fechaHoraVac) {

        CitaVacunacion citaExistente = BuscarCitaPorCodigo(codCita);

        long intervaloDias = ChronoUnit.DAYS.between(citaExistente.getFechaHoraVac(), fechaHoraCita);

        int intervaloMinimoDias = 21;
        int intervaloMaximoDias = 42;

        if (intervaloDias >= intervaloMinimoDias && intervaloDias <= intervaloMaximoDias) {
            return true; //ya se puede aplicar dosis
        } else {
            return false;
        }
    }

    public CitaVacunacion BuscarCitaPorCodigo(int codCita) {
        CitaVacunacion cita = null;
        String sql = "SELECT * FROM citavacunacion WHERE codCita = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCita);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cita = new CitaVacunacion();
                cita.setCodCita(rs.getInt("codCita"));
                cita.setDni(rs.getInt("dni"));
                cita.setCodRefuerzo(rs.getInt("codRefuerzo"));
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                cita.setCentroVacunacion(rs.getInt("centroVacunacion"));
                cita.setFechaHoraVac(rs.getTimestamp("fechaHoraVac").toLocalDateTime());
                cita.setnroSerieDosis(rs.getInt("nroSerieDosis"));
                cita.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la cita por código.");
        }

        return cita;
    }

    public void registrarColocacionDosis(int codCita, LocalDateTime fechaHoraVacunacion, int codRefuerzo) {

        CitaVacunacion cita = BuscarCitaPorCodigo(codCita);

        if (cita == null) {
            JOptionPane.showMessageDialog(null, "La cita no existe.");
            return;
        }

        if (!cita.estadoPendienteOActivo()) {
            JOptionPane.showMessageDialog(null, "La cita no está en estado pendiente o activa.");
            return;
        }

        if (cita.getCodRefuerzo() > 0 && cita.getCodRefuerzo() <= 3) {
            JOptionPane.showMessageDialog(null, "El ciudadano ya ha recibido una dosis previa.");
            return;
        }

        LocalDateTime fechaMinima = LocalDateTime.parse(cita.getFechaHoraCita());
        LocalDateTime fechaMaxima = fechaMinima.plusWeeks(8);

        if (fechaHoraVacunacion.isBefore(fechaMinima) || fechaHoraVacunacion.isAfter(fechaMaxima)) {
            JOptionPane.showMessageDialog(null, "Fecha de vacunación fuera del intervalo válido.");
            return;
        }

        cita.setFechaHoraVac(fechaHoraVacunacion);
        cita.setCodRefuerzo(codRefuerzo);
        cita.setEstado(false);

        /*
    if (modificarCita(cita)) {
        JOptionPane.showMessageDialog(null, "Dosis de vacuna registrada con éxito.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al registrar la dosis de vacuna.");
    }
         */
        JOptionPane.showMessageDialog(null, "Dosis de vacuna registrada con éxito.");
    }

    /*
    public List<CitaVacunacion> obtenerCitasVencidas() {
        List<CitaVacunacion> citasVencidas = new ArrayList<>();
        LocalDateTime fechaActual = LocalDateTime.now();

        for (CitaVacunacion cita : listarCitas()) {
            if (cita.estadoPendienteOActivo() && cita.getFechaHoraCita().isBefore(fechaActual)) {
                citasVencidas.add(cita);
            }
        }

        return citasVencidas;
    }

    public List<CitaVacunacion> obtenerCitasCumplidas() {
        List<CitaVacunacion> citasCumplidas = new ArrayList();

        for (CitaVacunacion cita : listarCitas()) {
            if (!cita.estadoPendienteOActivo() && !cita.estadoPendienteOActivo()) {
                citasCumplidas.add(cita);
            }
        }

        return citasCumplidas;
    }

    public List<CitaVacunacion> obtenerCitasCanceladas() {
        List<CitaVacunacion> citasCanceladas = new ArrayList();

        for (CitaVacunacion cita : listarCitas()) {
            if (cita.estadoPendienteOActivo()) {
                citasCanceladas.add(cita);
            }
        }

        return citasCanceladas;
    }
}
     */
}
