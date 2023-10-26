
package Entidades;

import java.util.Date;


public class Vacuna {
    
    private int nroSerieDosis;
    private String marca;
    private double medida;
    private Date fechaVenc;
    private boolean colocada;
    private int cuit;

    public Vacuna() {
    }

  
    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaVenc, boolean colocada, int cuit) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVenc = fechaVenc;
        this.colocada = colocada;
        this.cuit = cuit;
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

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return  nroSerieDosis + " - " + marca + " - " + medida + " Vencimiento: " + fechaVenc + " Colocada:" + colocada;
    }

   
    
}
