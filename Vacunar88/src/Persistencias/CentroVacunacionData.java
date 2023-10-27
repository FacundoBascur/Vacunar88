package Persistencias;

import Entidades.CentroVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class CentroVacunacionData {

    private Connection con = null;

    public CentroVacunacionData() {
        con = Conexion.getConexion();
    }

    public void registrarCentro(CentroVacunacion centro) {

        String sql = "INSERT INTO centrovacunacion (nombre,zona,estado) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getZona());
            ps.setBoolean(3, centro.isEstado());
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
                centro.setZona(rs.getString("zona"));
                centro.setEstado(rs.getBoolean("estado"));
                lista.add(centro);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");
        }

        return lista;

    }

    public List<CentroVacunacion> listarPorZona(String zon) {
        CentroVacunacion centro = null;
        List<CentroVacunacion> lista = new ArrayList();

        String sql = "SELECT * FROM centrovacunacion WHERE zona= ?";
        
try{
                
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, zon);
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {

                        centro = new CentroVacunacion();
                        centro.setCodCentro(rs.getInt("codCentro"));
                        centro.setNombre(rs.getString("nombre"));
                        centro.setZona(rs.getString("zona"));
                        centro.setEstado(rs.getBoolean("estado"));
                        lista.add(centro);
                    }
                    ps.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a Centros de Vacunación.");
                
             
        }
        return lista;
    }
    
    public CentroVacunacion centroXZona(String zon){
            CentroVacunacion centro = null;
       

        String sql = "SELECT * FROM centrovacunacion WHERE zona= ?";
        
try{
                
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, zon);
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {

                        centro = new CentroVacunacion();
                        centro.setCodCentro(rs.getInt("codCentro"));
                        centro.setNombre(rs.getString("nombre"));
                        centro.setZona(rs.getString("zona"));
                        centro.setEstado(rs.getBoolean("estado"));
                        
                    }
                    ps.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a Centros de Vacunación.");
                
             
        }
        return centro;
    
    }

    public List<CentroVacunacion> listarPorEstado(boolean estado) {
        CentroVacunacion centro = null;
        List<CentroVacunacion> lista = new ArrayList();

        if (estado == false) {
            String sql = "SELECT * FROM centrovacunacion WHERE estado=0";

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setBoolean(1, estado);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    centro = new CentroVacunacion();
                    centro.setCodCentro(rs.getInt("codCentro"));
                    centro.setNombre(rs.getString("nombre"));
                    centro.setZona(rs.getString("zona"));
                    centro.setEstado(rs.getBoolean("estado"));
                    lista.add(centro);
                }
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a Centros de Vacunación.");
            }
            return lista;

        } else {

            String sql = "SELECT * FROM centrovacunacion WHERE estado=1";

            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setBoolean(1, estado);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    centro = new CentroVacunacion();
                    centro.setCodCentro(rs.getInt("codCentro"));
                    centro.setNombre(rs.getString("nombre"));
                    centro.setZona(rs.getString("zona"));
                    centro.setEstado(rs.getBoolean("estado"));
                    lista.add(centro);
                }

                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a alumnos");
            }
            return lista;
        }
    }

    public CentroVacunacion buscarPorCodCentro(int cod) {

        CentroVacunacion centro = null;
        String sql = "SELECT * FROM centrovacunacion WHERE codCentro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                centro = new CentroVacunacion();
                centro.setCodCentro(rs.getInt("codCentro"));
                centro.setNombre(rs.getString("nombre"));
                centro.setZona(rs.getString("zona"));
                centro.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a Centro de Vacunación.");
        }

        return centro;

    }

    public CentroVacunacion buscarPorNombre(String nom) {

        CentroVacunacion centro = null;
        String sql = "SELECT * FROM centrovacunacion WHERE nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                centro = new CentroVacunacion();
                centro.setCodCentro(rs.getInt("codCentro"));
                centro.setNombre(rs.getString("nombre"));
                centro.setZona(rs.getString("zona"));
                centro.setEstado(rs.getBoolean("estado"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a Centro de Vacunación.");
        }

        return centro;

    }

    public void modificarCentroVacunacion(int cod, String nom, String zon) {

        CentroVacunacion centro = null;
        String sql = "UPDATE centrovacunacion SET  nombre=? , zona=? WHERE codCentro=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nom);
            ps.setString(2, zon);
            ps.setInt(3, cod);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Centro de vacunación modificado con éxito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");
        }

    }

    public void darDeBajaAlta(boolean est, int cod) {

        try {
            if (est) {
                String sql = "UPDATE centrovacunacion SET estado= 0 WHERE codCentro=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, cod);
                int result = ps.executeUpdate();

                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Centro de Vacunación dado de baja exitosamente.");
                }

            } else {
                String sql = "UPDATE centrovacunacion SET estado= 1 WHERE codCentro=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, cod);
                int result = ps.executeUpdate();

                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Centro de Vacunación dado de alta exitosamente.");
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a CentroVacunación.");

        }
    }
}
