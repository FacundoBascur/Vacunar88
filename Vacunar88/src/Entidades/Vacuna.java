
package Entidades;

import java.util.Date;


public class Vacuna {
    private int idVacuna;
    private int nroSerieDosis;
    private String marca;
    private double medida;
    private Date fechaVenc;
    private boolean colocada;
    private String cuit;

    public Vacuna() {
    }

    public Vacuna(int idVacuna, int nroSerieDosis, String marca, double medida, Date fechaVenc, boolean colocada, String cuit) {
        this.idVacuna = idVacuna;
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVenc = fechaVenc;
        this.colocada = colocada;
        this.cuit = cuit;
    }

    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaVenc, boolean colocada, String cuit) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVenc = fechaVenc;
        this.colocada = colocada;
        this.cuit = cuit;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "idVacuna=" + idVacuna + ", nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaVenc=" + fechaVenc + ", colocada=" + colocada + ", cuit=" + cuit + '}';
    }

   
    
}
