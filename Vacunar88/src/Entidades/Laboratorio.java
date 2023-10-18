package Entidades;

public class Laboratorio {

    private String cuit;
    private String nombreLab;
    private String pais;
    private String domicilioCom;
    private String producto;
    private boolean estado;

    public Laboratorio() {
    }

    public Laboratorio(String cuit, String nombreLab, String pais, String domicilioCom, String producto, boolean estado) {
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.producto = producto;
        this.estado = estado;
    }

    public Laboratorio(String nombreLab, String pais, String domicilioCom, String producto, boolean estado) {
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.producto = producto;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombreLab() {
        return nombreLab;
    }

    public void setNombreLab(String nombreLab) {
        this.nombreLab = nombreLab;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomicilioCom() {
        return domicilioCom;
    }

    public void setDomicilioCom(String domicilioCom) {
        this.domicilioCom = domicilioCom;
    }

    @Override
    public String toString() {
        return cuit + " - " + nombreLab + " - " +producto;
    }

}
