
package Entidades;

import java.time.LocalDateTime;


public class CitaVacunacion {
   
    private int codCita;
    private Ciudadano dni;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private LocalDateTime fechaHoraVac;
    private Vacuna idVacuna;

    public CitaVacunacion() {
    }

    public CitaVacunacion(int codCita, Ciudadano dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraVac, Vacuna idVacuna) {
        this.codCita = codCita;
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVac = fechaHoraVac;
        this.idVacuna = idVacuna;
    }

    public CitaVacunacion(Ciudadano dni, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraVac, Vacuna idVacuna) {
        this.dni = dni;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVac = fechaHoraVac;
        this.idVacuna = idVacuna;
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getDni() {
        return dni;
    }

    public void setDni(Ciudadano dni) {
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

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDateTime getFechaHoraVac() {
        return fechaHoraVac;
    }

    public void setFechaHoraVac(LocalDateTime fechaHoraVac) {
        this.fechaHoraVac = fechaHoraVac;
    }

    public Vacuna getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Vacuna idVacuna) {
        this.idVacuna = idVacuna;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "codCita=" + codCita + ", dni=" + dni + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraVac=" + fechaHoraVac + ", idVacuna=" + idVacuna + '}';
    }

   
}