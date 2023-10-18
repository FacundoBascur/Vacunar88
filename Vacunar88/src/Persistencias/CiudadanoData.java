package Persistencias;

import Entidades.Ciudadano;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CiudadanoData {

    private Connection con = null;

    public CiudadanoData() {
        con = Conexion.getConexion();
    }

    public void registrarCiudadano(Ciudadano ciu) {

        String sql = "INSERT INTO ciudadano (dni, nombreCompleto, email, celular, longXciu, latYciu, patologia, ambitoTrabajo,dosis,estado) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciu.getDni());
            ps.setString(2, ciu.getNombreCompleto());
            ps.setString(3, ciu.getEmail());
            ps.setString(4, ciu.getCelular());
            ps.setInt(5, ciu.getLongXciu());
            ps.setInt(6, ciu.getLatYciu());
            ps.setString(7, ciu.getPatologia());
            ps.setString(8, ciu.getAmbitoTrabajo());
            ps.setInt(9, ciu.getDosis());
            ps.setBoolean(10, ciu.isEstado());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ciudadano registrado correctamente.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla ciudadano.");
        }
    }

    public List<Ciudadano> listarCiudadanosRegistrados() {

        Ciudadano ciudadano = null;
        List<Ciudadano> lista = new ArrayList<>();

        try {

            String sql = " SELECT * FROM ciudadano";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNombreCompleto(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setLongXciu(rs.getInt("longXciu"));
                ciudadano.setLatYciu(rs.getInt("latYciu"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                ciudadano.setDosis(rs.getInt("dosis"));
                ciudadano.setEstado(rs.getBoolean("estado"));
                lista.add(ciudadano);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadanos.");
        }

        return lista;
    }

    public Ciudadano buscarXdni(int dni) {

        Ciudadano ciudadano = null;

        try {

            String sql = " SELECT * FROM ciudadano WHERE dni = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ciudadano = new Ciudadano();
                ciudadano.setDni(dni);
                ciudadano.setNombreCompleto(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setLongXciu(rs.getInt("longXciu"));
                ciudadano.setLatYciu(rs.getInt("latYciu"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                ciudadano.setDosis(rs.getInt("dosis"));
                ciudadano.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadanos.");
        }

        return ciudadano;

    }

    public List<Ciudadano> buscarXestado(boolean estado) {

        Ciudadano ciudadano = null;
        List<Ciudadano> lista = new ArrayList<>();

        try {

            String sql = " SELECT * FROM ciudadano WHERE estado= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ciudadano = new Ciudadano();
                ciudadano.setDni(rs.getInt("dni"));
                ciudadano.setNombreCompleto(rs.getString("nombreCompleto"));
                ciudadano.setEmail(rs.getString("email"));
                ciudadano.setCelular(rs.getString("celular"));
                ciudadano.setLongXciu(rs.getInt("longXciu"));
                ciudadano.setLatYciu(rs.getInt("latYciu"));
                ciudadano.setPatologia(rs.getString("patologia"));
                ciudadano.setAmbitoTrabajo(rs.getString("ambitoTrabajo"));
                ciudadano.setDosis(rs.getInt("dosis"));
                ciudadano.setEstado(estado);
                lista.add(ciudadano);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadanos.");
        }

        return lista;
    }

    public void modificarEstado(boolean estado, int dni) {

        try {
            if (estado) {
                String sql = "UPDATE ciudadano SET estado=0 WHERE dni=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, dni);

                int rs = ps.executeUpdate();

                if (rs == 1) {
                    JOptionPane.showMessageDialog(null, "Ciudadano dado de baja correctamente.");
                }
            } else {
                String sql = "UPDATE ciudadano SET estado=1 WHERE dni=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, dni);

                int rs = ps.executeUpdate();

                if (rs == 1) {
                    JOptionPane.showMessageDialog(null, "Ciudadano dado de alta correctamente.");
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudadanos.");
        }
    }
    
    public void modificarCiudadano(int dniNuevo, String nombreCompleto, String email, String celular, int longXciu, 
        int latYciu, String patologia, String ambitoTrabajo, int dosis, int dni) {

        Ciudadano ciu= null;
        String sql = "UPDATE ciudadano SET dni=?, nombreCompleto=?, email=?, celular=?, longXciu=?, \n" +
"        latYciu=?, patologia=?, ambitoTrabajo=?, dosis=? WHERE dni=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dniNuevo);
            ps.setString(2, nombreCompleto);
            ps.setString(3, email);
            ps.setString(4,celular);
            ps.setInt(5, longXciu);
            ps.setInt(6, latYciu);
            ps.setString(7, patologia);
            ps.setString(8,ambitoTrabajo);
            ps.setInt(9,dosis);
            ps.setInt(10, dni);
            
            int result = ps.executeUpdate();

            if (result == 1) {
               //JOptionPane.showMessageDialog(null, "Alumno modificado con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a alumnos");
        }

    }
}
