public class Libro {
public String nombre;
private int codigoisbn;
double precio;

    public Libro() {
    }

    public Libro(String nombre, int codigoisbn, double precio) {
        this.nombre = nombre;
        this.codigoisbn = codigoisbn;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoisbn() {
        return this.codigoisbn;
    }

    public void setCodigoisbn(int codigoisbn) {
        this.codigoisbn = codigoisbn;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigoisbn='" + getCodigoisbn() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
}
