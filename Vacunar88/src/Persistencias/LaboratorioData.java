
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
    
      public List<Laboratorio> listarPorEstado(Boolean est){
    
      Laboratorio lab = null;
      List<Laboratorio> lista = new ArrayList<>();
        String sql = "SELECT * FROM laboratorio WHERE estado= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, est);
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
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorio.");
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
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorio.");
        }
        return lab;

    }
    
 public Laboratorio buscarNombre(String nom) {
        Laboratorio lab = null;
        String sql = "SELECT * FROM laboratorio WHERE nombreLab=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
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
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorio.");
        }
        return lab;

    }
 
  public Laboratorio buscarPorPais(String pais) {
        Laboratorio lab = null;
        String sql = "SELECT * FROM laboratorio WHERE pais=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pais);
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
  public Laboratorio buscarPorMarca(String mar) {
        Laboratorio lab = null;
        String sql = "SELECT * FROM laboratorio WHERE marca=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mar);
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
  
   
    public void bajaAlta(Boolean est,String cuit) {
    

    try{    
if(est){
    String sql = "UPDATE laboratorio SET estado= 0 WHERE cuit=?";
    
            PreparedStatement ps = con.prepareStatement(sql);
           
         
             ps.setString(1,cuit);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio dado de baja exitosamente.");
            }

           }else {
    String sql = "UPDATE laboratorio SET estado= 1 WHERE cuit=?";
    
            PreparedStatement ps = con.prepareStatement(sql);
           
          
             ps.setString(1, cuit);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Laboratorio dado de alta exitosamente.");
            }

}  
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Laboratorio.");
        

    
}
    }
  
 
    public void modficarLab(String cuitViejo, String nom, String pais, String dom, String mar, String cuit ) {
Laboratorio lab=null;
        String sql = "UPDATE laboratorio SET cuit=?, nombreLab=?, pais=?, domicilioCom=?, marca=? WHERE cuit=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
           // ps.setString(1, cuitNuevo);
            ps.setString(1, cuitViejo);
            ps.setString(2, nom);
            ps.setString(3, pais );
            ps.setString(4, dom);
            ps.setString(5, mar);
           ps.setString(6, cuit);
           
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