
package Entidades;


public class CentroVacunacion {
     private int codCentro;
    private String nombre;
    private int longXcentro;
    private int latYcentro;
    private int codCita;

    public CentroVacunacion() {
    }

    public CentroVacunacion(int codCentro, String nombre, int longXcentro, int latYcentro, int codCita) {
        this.codCentro = codCentro;
        this.nombre = nombre;
        this.longXcentro = longXcentro;
        this.latYcentro = latYcentro;
        this.codCita = codCita;
    }

    public CentroVacunacion(String nombre, int longXcentro, int latYcentro, int codCita) {
        this.nombre = nombre;
        this.longXcentro = longXcentro;
        this.latYcentro =latYcentro;
        this.codCita = codCita;
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

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

  

    @Override
    public String toString() {
        return "CentroVacunacion{" + "codCentro=" + codCentro + ", nombre=" + nombre + ", longXcentro=" + longXcentro + ", latYcentro=" + latYcentro + ", codCita=" + codCita + '}';
    }

    
    
    
}
