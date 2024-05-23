package establo;

abstract class Animales {
    protected String animalNombre;
    protected int peso;

    public Animales() {
    }

    public Animales(String animalNombre, int peso) {
        this.animalNombre = animalNombre;
        this.peso = peso;
    }

    public String getanimalNombre() {
        return this.animalNombre;
    }

    public void setanimalNombre(String animalNombre) {
        this.animalNombre = animalNombre;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" +
            " animal='" + getanimalNombre() + "'" +
            ", peso='" + getPeso() + "'" +
            "}";
    }


}
