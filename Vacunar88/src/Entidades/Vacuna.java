
package Entidades;

import java.util.Date;


public class Vacuna {
    private int idVacuna;
    private int nroSerieDosis;
    private String marca;
    private double medida;
    private Date fechaVenc;
    private boolean colocada;
    private Laboratorio idLaboratorio;

    public Vacuna() {
    }

    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaVenc, boolean colocada, Laboratorio idLaboratorio) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVenc = fechaVenc;
        this.colocada = colocada;
        this.idLaboratorio = idLaboratorio;
    }

    public Vacuna(int idVacuna, int nroSerieDosis, String marca, double medida, Date fechaVenc, boolean colocada, Laboratorio idLaboratorio) {
        this.idVacuna = idVacuna;
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVenc = fechaVenc;
        this.colocada = colocada;
        this.idLaboratorio = idLaboratorio;
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

    public Laboratorio getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Laboratorio idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "idVacuna=" + idVacuna + ", nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaVenc=" + fechaVenc + ", colocada=" + colocada + ", idLaboratorio=" + idLaboratorio + '}';
    }
    
    
}
