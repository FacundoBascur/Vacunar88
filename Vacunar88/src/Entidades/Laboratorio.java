
package Entidades;


public class Laboratorio {
  
   private String cuit;
    private String nombreLab;
    private String pais;
    private String domicilioCom;
    private boolean estado;

    public Laboratorio() {
    }

    public Laboratorio(String cuit, String nombreLab, String pais, String domicilioCom, boolean estado) {
        this.cuit = cuit;
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.estado = estado;
    }

    public Laboratorio(String nombreLab, String pais, String domicilioCom, boolean estado) {
        this.nombreLab = nombreLab;
        this.pais = pais;
        this.domicilioCom = domicilioCom;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
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
        return "Laboratorio{" + "cuit=" + cuit + ", nombreLab=" + nombreLab + ", pais=" + pais + ", domicilioCom=" + domicilioCom + ", estado=" + estado + '}';
    }
   
}
