package establo;

public class AnimalesSalvajes extends Animales {

    String habitat;

    public AnimalesSalvajes() {
    }

    public AnimalesSalvajes(String animalNombre, int peso, String habitat) {
        super(animalNombre,peso);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "AnimalesSalvajes [getNombre()=" + getanimalNombre() + ", getHabitat()=" + getHabitat() + ", getPeso()="
                + getPeso() + "]";
    }
    

}
