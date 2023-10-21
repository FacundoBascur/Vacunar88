
package Persistencias;

import Entidades.*;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class LaboratorioData {
    
    private Connection con = null;
    
    public LaboratorioData() {
    con = Conexion.getConexion();
    }
      
    public List<Laboratorio> listarTodos(){
    
      Laboratorio lab = null;
      List<Laboratorio> lista = new ArrayList<>();
        String sql = "SELECT * FROM laboratorio";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                lab = new Laboratorio();
                lab.setCuit(rs.getString("cuit"));
                lab.setNombreLab(rs.getString("nombreLab"));
                lab.setPais(rs.getString("pais"));
                lab.setDomicilioCom(rs.getString("domicilioCom"));
                lab.setMarca(rs.getString("marca"));
                lab.setEstado(rs.getBoolean("estado"));
                lista.add(lab);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorios.");
        }
    
        return lista;
    
    }
    
    public void registrarLab(Laboratorio lab) {

        String sql = "INSERT INTO laboratorio(cuit,nombreLab,pais,domicilioCom,marca,estado) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lab.getCuit());
            ps.setString(2, lab.getNombreLab());
            ps.setString(3, lab.getPais());
            ps.setString(4, lab.getDomicilioCom());
            ps.setString(5, lab.getMarca());
            ps.setBoolean(6, lab.isEstado());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Laboratorio registrado correctamente.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Laboratorio.");
        }

    }

    public Laboratorio buscarPorCuit(String cuit) {
        Laboratorio lab = null;
        String sql = "SELECT * FROM laboratorio WHERE cuit=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuit);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                lab = new Laboratorio();
                lab.setCuit(rs.getString("cuit"));
                lab.setNombreLab(rs.getString("nombreLab"));
                lab.setPais(rs.getString("pais"));
                lab.setDomicilioCom(rs.getString("domicilioCom"));
                lab.setMarca(rs.getString("marca"));
                lab.setEstado(rs.getBoolean("estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorios.");
        }
        return lab;

    }

    public void baja(String cuit) {
        String sql = "UPDATE laboratorio SET estado=0 WHERE cuit = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuit);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio dado de baja exitosamente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de datos.");
        }

    }
 public void alta(String cuit) {
        String sql = "UPDATE laboratorio SET estado=1 WHERE cuit = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuit);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio dado de alta exitosamente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de datos.");
        }

    }
  
 
    public void modficarLab(String cuit, String nombreLab, String pais, String domicilioCom, String marca ,boolean estado) {

        String sql = "UPDATE laboratorio SET cuit=?, nombreLab=?, pais=?, domicilioCom=?, marca=?, estado=? WHERE cuit=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuit);
            ps.setString(2, nombreLab);
            ps.setString(3, pais );
            ps.setString(4, domicilioCom);
            ps.setString(5, marca);
            ps.setBoolean(6, estado);
            ps.setString(7, cuit);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio modificado con éxito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Laboratorio.");
        }

    }
    
}
 /* public List<Vacuna> producirVacunas(Stock st) {

        List<Vacuna> lista = new ArrayList<>();
        lista = null;

        if (st.isEstado()) {

            Laboratorio lab = buscarPorCuit(st.getCuit());
            String marca = "";
            double medida = 0;

            switch (lab.getCuit()) {
                case "china":
                    marca = "Sinopharm";
                    medida = 0.5;
                    break;
                case "usa":
                    marca = "Moderna";
                    medida = 0.5;
                    break;
                case "rusia":
                    marca = "Sputnik V";
                    medida = 0.5;
                    break;
                case "inglaterra":
                    marca = "AstraZeneca";
                    medida = 0.5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El laboratorio no produce la vacuna solicitada.");
            }

            for (int i = 1; i == st.getCantidad(); i++) {

                lista.add(new Vacuna(i, marca, medida, Date.valueOf(LocalDate.now().plusDays(60)), true, st.getCuit()));

            }

        } else {
            JOptionPane.showMessageDialog(null, "La solicitud: "+ st.getIdStock() + "para laboratorio cuit nro: "+ st.getCuit() + " ya fue realizada.");
        }

        return lista;
    }*/