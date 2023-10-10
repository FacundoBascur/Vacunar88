package Entidades;

public class Stock {

    private int idStock;
    private String marca;
    private int cantidad;
    private int codCentro;
    private String cuit;
    private boolean estado;

    public Stock() {
    }

    public Stock(int idStock, String marca, int cantidad, int codCentro, String cuit, boolean estado) {
        this.idStock = idStock;
        this.marca = marca;
        this.cantidad = cantidad;
        this.codCentro = codCentro;
        this.cuit = cuit;
        this.estado = estado;
    }

    public Stock(String marca, int cantidad, int codCentro, String cuit, boolean estado) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.codCentro = codCentro;
        this.cuit = cuit;
        this.estado = estado;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodCentro() {
        return codCentro;
    }

    public void setCodCentro(int codCentro) {
        this.codCentro = codCentro;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

}
