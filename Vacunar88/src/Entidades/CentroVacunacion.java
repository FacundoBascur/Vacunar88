
package Entidades;


public class CentroVacunacion {
     private int codCentro;
    private String nombre;
   private String zona ;
    private boolean estado;

    public CentroVacunacion() {
    }

    public CentroVacunacion(String nombre, String zona, boolean estado) {
        this.nombre = nombre;
        this.zona = zona;
        this.estado = estado;
    }

    public CentroVacunacion(int codCentro, String nombre, String zona, boolean estado) {
        this.codCentro = codCentro;
        this.nombre = nombre;
        this.zona = zona;
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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  codCentro + " - " + nombre + " - " + zona;
    }

   
}
