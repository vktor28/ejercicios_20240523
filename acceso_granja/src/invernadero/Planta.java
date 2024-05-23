package invernadero;

public class Planta {
    public String nombrePlanta;
    private String tipoPlanta; //interior o exterior
    String origen;


    public Planta() {
    }

    public Planta(String nombrePlanta, String tipoPlanta, String origen) {
        this.nombrePlanta = nombrePlanta;
        this.tipoPlanta = tipoPlanta;
        this.origen = origen;
    }


    public String getNombrePlanta() {
        return this.nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public String getTipoPlanta() {
        return this.tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Planta [getNombrePlanta()=" + getNombrePlanta() + ", getTipoPlanta()=" + getTipoPlanta()
                + ", getOrigen()=" + getOrigen() + "]";
    }


}