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
            ps.setLong(4, ciu.getCelular());
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
                ciudadano.setCelular(rs.getLong("celular"));
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
    
    public List<Ciudadano> buscarXdni(int dni){
    
        Ciudadano ciudadano = null;
        List<Ciudadano> lista = new ArrayList<>();

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
                ciudadano.setCelular(rs.getLong("celular"));
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

    

}
