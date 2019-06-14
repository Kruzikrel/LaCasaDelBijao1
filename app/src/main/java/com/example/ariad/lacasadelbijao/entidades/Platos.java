package com.example.ariad.lacasadelbijao.entidades;

/**
 * Created by ariad on 4/06/2019.
 */

public class Platos {
    int codigop; String nombrep, descripcionp; double preciop;

    public Platos() {
    }

    public Platos(int codigop, String nombrep, String descripcionp, double preciop) {
        this.codigop = codigop;
        this.nombrep = nombrep;
        this.descripcionp = descripcionp;
        this.preciop = preciop;
    }

    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDescripcionp() {
        return descripcionp;
    }

    public void setDescripcionp(String descripcionp) {
        this.descripcionp = descripcionp;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }
}