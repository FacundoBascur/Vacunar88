
package Persistencias;

import Entidades.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class StockData {
    private Connection con = null;

    public StockData() {
        con = Conexion.getConexion();
    }

    public Stock solicitudStock(String marca, int cant, int codCentro, String cuit, boolean estado) {

        Stock st = null;
        String sql = "INSERT INTO stock(marca,cantidad,codCentro,cuit,estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, marca);
            ps.setInt(2, cant);
            ps.setInt(3, codCentro);
            ps.setString(4, cuit);
            ps.setBoolean(5, estado);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                st = new Stock(rs.getInt(1), marca, cant, codCentro, cuit, estado);
                JOptionPane.showMessageDialog(null, "Solicitud realizada con exito");
                ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizada la solicitud");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }

        return st;
    }

    public void modficacion(int id, String marca, int cant, String cuit, int codCentro, boolean estado) {

        String sql = "UPDATE stock SET marca=?, cantidad=?, codCentro=?, cuit=?, estado=? WHERE idStock=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setInt(2, cant);
            ps.setInt(3, codCentro);
            ps.setString(4, cuit);
            ps.setBoolean(5, estado);
            ps.setInt(6, id);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Solicitud modificada con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de datos");
        }

    }

    public void baja(int id) {
        String sql = "UPDATE stock SET estado=0 WHERE idStock = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int result = ps.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Solicitud de stock realizada");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de datos");
        }

    }
}
