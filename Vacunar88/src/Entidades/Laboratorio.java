
package Entidades;


public class Laboratorio {
    private int idLaboratorio;
    private int cuit;
    private String nombreLab;
    private String pais;
    private String domicilioCom;

    public Laboratorio() {
    }

    public Laboratorio(int cuit, String nombreLab, String pais, String domicilioCom) {
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
    }

    public Laboratorio(int idLaboratorio, int cuit, String nombreLab, String pais, String domicilioCom) {
        this.idLaboratorio = idLaboratorio;
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
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
        return "Laboratorio{" + "idLaboratorio=" + idLaboratorio + ", cuit=" + cuit + ", nombreLab=" + nombreLab + ", pais=" + pais + ", domicilioCom=" + domicilioCom + '}';
    }
    
    
    
    
    
    
    
}
