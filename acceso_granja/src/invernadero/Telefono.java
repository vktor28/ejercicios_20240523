package invernadero;

public class Telefono {
        private String marca;
        private String modelo;
        private double precio;
        private static double descuento = 20;
    
    
    public Telefono() {
    }

    public Telefono(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double precioBF(){
        return precio-precio/descuento;
    }
    public static void cancelarBf(boolean bfActive) {
        if(bfActive){descuento=0;}
    }



    @Override
    public String toString() {
        String ofertaTxt="";
        if(descuento>0){ofertaTxt =  " -> OFERTA BF: " + precioBF() + "€";}
        return getMarca() + " " + getModelo() + " | PVP: " +
            getPrecio() + "€" + ofertaTxt;
    }
}