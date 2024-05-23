package invernadero;

public class Arbol {
    public String nombreArbol;
    private String tipoArbol;
    double altura;


    public Arbol() {
    }

    public Arbol(String nombreArbol, String tipoArbol, double altura) {
        this.nombreArbol = nombreArbol;
        this.tipoArbol = tipoArbol;
        this.altura = altura;
    }

    public String getNombreArbol() {
        return this.nombreArbol;
    }

    public void setNombreArbol(String nombreArbol) {
        this.nombreArbol = nombreArbol;
    }

    public String getTipoArbol() {
        return this.tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol [getNombreArbol()=" + getNombreArbol() + ", getTipoArbol()=" + getTipoArbol() + ", getAltura()="
                + getAltura() + "]";
    }

}
