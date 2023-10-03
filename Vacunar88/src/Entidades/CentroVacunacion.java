
package Entidades;


public class CentroVacunacion {
    private int codCentro;
    private String nombre;
    private String localidad;
    private CitaVacunacion codCita;

    public CentroVacunacion() {
    }

    public CentroVacunacion(int codCentro, String nombre, String localidad, CitaVacunacion codCita) {
        this.codCentro = codCentro;
        this.nombre = nombre;
        this.localidad = localidad;
        this.codCita = codCita;
    }

    public CentroVacunacion(String nombre, String localidad, CitaVacunacion codCita) {
        this.nombre = nombre;
        this.localidad = localidad;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public CitaVacunacion getCodCita() {
        return codCita;
    }

    public void setCodCita(CitaVacunacion codCita) {
        this.codCita = codCita;
    }

    @Override
    public String toString() {
        return "CentroVacunacion{" + "codCentro=" + codCentro + ", nombre=" + nombre + ", localidad=" + localidad + ", codCita=" + codCita + '}';
    }
    
    
    
    
    
}
