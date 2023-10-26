package Entidades;

public class Ciudadano {

    private int dni;
    private String nombreCompleto;
    private String email;
    private String celular;
    private String zona;
    private String patologia;
    private String ambitoTrabajo;
    private boolean estado;

    public Ciudadano() {
    }

    public Ciudadano(int dni, String nombreCompleto, String email, String celular, String zona, String patologia, String ambitoTrabajo, boolean estado) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.zona = zona;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
        this.estado = estado;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoTrabajo() {
        return ambitoTrabajo;
    }

    public void setAmbitoTrabajo(String ambitoTrabajo) {
        this.ambitoTrabajo = ambitoTrabajo;
    }

    @Override
    public String toString() {
        return dni + " - " + nombreCompleto + " - " + zona;
    }

    

}
