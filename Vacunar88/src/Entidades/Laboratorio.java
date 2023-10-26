package Entidades;

public class Laboratorio {

    private long cuit;
    private String nombreLab;
    private String pais;
    private String domicilioCom;
    private String marca;
    private boolean estado;

    public Laboratorio() {
    }

    public Laboratorio(long cuit, String nombreLab, String pais, String domicilioCom, String marca, boolean estado) {
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.marca=marca;
        this.estado = estado;
    }

    public Laboratorio(String nombreLab, String pais, String domicilioCom, String marca, boolean estado) {
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.marca=marca;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
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
        return cuit + " - " + nombreLab + " - " +marca;
    }

}
