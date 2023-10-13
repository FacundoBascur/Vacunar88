
package Entidades;


public class CentroVacunacion {
     private int codCentro;
    private String nombre;
    private int longXcentro;
    private int latYcentro;
    private boolean estado;

    public CentroVacunacion() {
    }

    public CentroVacunacion(int codCentro, String nombre, int longXcentro, int latYcentro, boolean estado) {
        this.codCentro = codCentro;
        this.nombre = nombre;
        this.longXcentro = longXcentro;
        this.latYcentro = latYcentro;
        this.estado = estado;
    }

    public CentroVacunacion(String nombre, int longXcentro, int latYcentro, boolean estado) {
        this.nombre = nombre;
        this.longXcentro = longXcentro;
        this.latYcentro =latYcentro;
        this.estado = estado;
    }

  

    public int getCodCentro() {
        return codCentro;
    }

    public void setCodCentro(int codCentro) {
        this.codCentro = codCentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongXcentro() {
        return longXcentro;
    }

    public void setLongXcentro(int longXcentro) {
        this.longXcentro = longXcentro;
    }

    public int getLatYcentro() {
        return latYcentro;
    }

    public void setLatYcentro(int latYcentro) {
        this.latYcentro = latYcentro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CentroVacunacion{" + "codCentro=" + codCentro + ", nombre=" + nombre + ", longXcentro=" + longXcentro + ", latYcentro=" + latYcentro + ", estado=" + estado + '}';
    }

    
    
    
}
