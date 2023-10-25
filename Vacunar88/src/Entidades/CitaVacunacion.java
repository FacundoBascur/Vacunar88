
package Entidades;

import java.time.LocalDateTime;


public class CitaVacunacion {
   
    private int codCita;
    private int dni;
    private int codRefuerzo;
    private String fechaHoraCita;
    private int centroVacunacion;
    private LocalDateTime fechaHoraVac;
    private int nroSerieDosis;
    private boolean estado;

    public CitaVacunacion() {
    }

    public CitaVacunacion(int codCita, int dni, int codRefuerzo, String fechaHoraCita, int centroVacunacion,
            LocalDateTime fechaHoraVac, int nroSerieDosis, boolean estado) {
        this.codCita = codCita;
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVac = fechaHoraVac;
        this.nroSerieDosis = nroSerieDosis;
        this.estado=estado;
    }

    public CitaVacunacion(int dni, int codRefuerzo, String fechaHoraCita, int centroVacunacion, 
            LocalDateTime fechaHoraVac, int nroSerieDosis, boolean estado) {
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVac = fechaHoraVac;
        this.nroSerieDosis = nroSerieDosis;
        this.estado= estado;
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public int getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(int centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDateTime getFechaHoraVac() {
        return fechaHoraVac;
    }

    public void setFechaHoraVac(LocalDateTime fechaHoraVac) {
        this.fechaHoraVac = fechaHoraVac;
    }

    public int getnroSerieDosis() {
        return nroSerieDosis;
    }

    public void setnroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  

    @Override
    public String toString() {
        return "CitaVacunacion{" + "codCita=" + codCita + ", dni=" + dni + ", codRefuerzo=" + codRefuerzo +", fechaHoraCita=" + 
  fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraVac=" + fechaHoraVac + ", nroSerieDosis=" + nroSerieDosis + 
                ", estado= " + estado + '}';
    }
   
}