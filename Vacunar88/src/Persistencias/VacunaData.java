package Persistencias;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VacunaData {

    private Connection con = null;

    public VacunaData() {
        con = Conexion.getConexion();
    }

    public void registrarVac(int nroSerieDosis, String marca, double medida, Date fechaVenc,
            boolean colocada, String cuit) {

        Vacuna vac = null;

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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a vacuna.");
        }

    }

    public List<Vacuna> listarVacunas() {

        Vacuna vacunas = null;
        List<Vacuna> lista = new ArrayList<>();

        try {

            String sql = "SELECT * FROM vacuna";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                vacunas = new Vacuna();
                vacunas.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacunas.setMarca(rs.getString("marca"));
                vacunas.setMedida(rs.getDouble("medida"));
                vacunas.setFechaVenc(rs.getDate("fechaVenc"));
                vacunas.setColocada(rs.getBoolean("colocada"));
                vacunas.setCuit(rs.getInt("cuit"));
                lista.add(vacunas);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna." + ex);
        }

        return lista;
    }
    
    public List<Vacuna> listarVacunasXTipoYEstado(String marca,boolean colocada) {

        Vacuna vacunas = null;
        List<Vacuna> lista = new ArrayList<>();

        try {

            String sql = "SELECT * FROM vacuna WHERE marca = ? AND colocada = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setBoolean(2, colocada);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                vacunas = new Vacuna();
                vacunas.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacunas.setMarca(rs.getString("marca"));
                vacunas.setMedida(rs.getDouble("medida"));
                vacunas.setFechaVenc(rs.getDate("fechaVenc"));
                vacunas.setColocada(rs.getBoolean("colocada"));
                vacunas.setCuit(rs.getInt("cuit"));
                lista.add(vacunas);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna.");
        }

        return lista;
    }
    
    public void actualizarEstadoVacuna(int nroSerieDosis, boolean nuevoEstado) {
        String sql = "UPDATE vacuna SET colocada = ? WHERE nroSerieDosis = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, nuevoEstado);
            ps.setInt(2, nroSerieDosis);

            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Dosis programada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo programar.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado.");
        }
    }
     
   public Vacuna VacunaNroSerie(int nro) {

        Vacuna vacuna = null;

        try {

            String sql = "SELECT * FROM vacuna WHERE nroSerieDosis=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nro);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                vacuna = new Vacuna();
                vacuna.setNroSerieDosis(rs.getInt("nroSerieDosis"));
                vacuna.setMarca(rs.getString("marca"));
                vacuna.setMedida(rs.getDouble("medida"));
                vacuna.setFechaVenc(rs.getDate("fechaVenc"));
                vacuna.setColocada(rs.getBoolean("colocada"));
                vacuna.setCuit(rs.getInt("cuit"));
                
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla vacuna.");
        }

        return vacuna;
    }
   
   public int contarXmarca(String marca){
       int total=0;
       String sql = "SELECT COUNT(*) FROM vacuna WHERE marca = ? and colocada = 0";
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, marca);
           
           ResultSet resultado = ps.executeQuery();
           
           if (resultado.next()) {
               total = resultado.getInt(1);
           }
           
           
       } catch (Exception e) {
       }
       
       return total;
   }


}
