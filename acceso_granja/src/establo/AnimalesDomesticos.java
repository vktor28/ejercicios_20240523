package establo;

public class AnimalesDomesticos extends Animales {
    private String nombreMascota;

    public AnimalesDomesticos() {
    }

    public AnimalesDomesticos(String animalNombre, int peso, String nombreMascota) {
        super(animalNombre,peso);
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    @Override
    public String toString() {
        return "AnimalesDomesticos [getanimalNombre()=" + getanimalNombre() + ", getNombreMascota()="
                + getNombreMascota() + ", getPeso()=" + getPeso() + "]";
    }

}
