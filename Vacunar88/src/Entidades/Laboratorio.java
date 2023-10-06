
package Entidades;


public class Laboratorio {
  
    private long cuit;
    private String nombreLab;
    private String pais;
    private String domicilioCom;

    public Laboratorio() {
    }

    public Laboratorio(long cuit, String nombreLab, String pais, String domicilioCom) {
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
    }

    public Laboratorio(String nombreLab, String pais, String domicilioCom) {
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
    }

    public long getCuit() {
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
        return "Laboratorio{" + "cuit=" + cuit + ", nombreLab=" + nombreLab + ", pais=" + pais + ", domicilioCom=" + domicilioCom + '}';
    }

   
    
    
    
    
    
    
}
