package Entidades;

public class Ciudadano {

    private int dni;
    private String nombreCompleto;
    private String email;
    private String celular;
    private int longXciu;
    private int latYciu;
    private String patologia;
    private String ambitoTrabajo;
    private int dosis;
    private boolean estado;

    public Ciudadano() {
    }

    public Ciudadano(int dni, String nombreCompleto, String email, String celular, int longXciu, int latYciu, String patologia, String ambitoTrabajo, int dosis, boolean estado) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.longXciu = longXciu;
        this.latYciu = latYciu;
        this.patologia = patologia;
        this.ambitoTrabajo = ambitoTrabajo;
        this.dosis = dosis;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
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

    public int getLongXciu() {
        return longXciu;
    }

    public void setLongXciu(int longXciu) {
        this.longXciu = longXciu;
    }

    public int getLatYciu() {
        return latYciu;
    }

    public void setLatYciu(int latYciu) {
        this.latYciu = latYciu;
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
        return "Ciudadano \n" + nombreCompleto + "\nDni: " + dni + "\nContacto: " + celular + "\nPatologia: " + patologia + "\nAmbito Laboral: " + ambitoTrabajo + "\nDosis colocadas: "+dosis+"\nEstado: " + estado;
    }

}
