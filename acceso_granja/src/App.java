import establo.AnimalesDomesticos;
import establo.AnimalesSalvajes;
import invernadero.Arbol;
import invernadero.Planta;

public class App {
/*
2 - Tienes una granja con un establo y un invernadero => 2 packages (paquetes de clases),
Dentro de la carpeta src (donde se encuentra el main) tienes dos carpetas con archivos java
(paquetes), donde cada uno de estos
paquetes contienen al menos dos clases:

- Package1:
o Clase Arbol: atributos default, private y public (uno de cada)
o Y clase Planta: atributos default, private y public (uno de cada)


- Package2:

o Crear clase madre Animales, y atributos protected. Las clases hijas son:
o Clase AnimalSalvaje
o Clase AnimalDomestico



Desde la clase Principal, crear:
- Un objeto de la clase Planta (o/y Arbol)
- Un objeto de la clase AnimalSalvaje
- Un objeto de la clase AnimalDomestico
- (No hace falta instanciar la clase madre) (puede ser abstract)


Como siempre, cuando instancias esos objetos desde el main, le pasas los valores para cada atributo. Estos atributos los inventas tú.


Imprimes todos estos objetos, y propiedades de objetos de todas las clases desde la clase main. ¿De qué manera accedes a cada uno de ellos? Prueba a acceder a los atributos con modificadores protected, default, private y public desde el main.


+ EXTRA: probar a traer una clase que pertenezca a cualquier otro proyecto java realizado anteriormente. ¿Cómo la integras en un package determinado?

+EXTRA: ¿Y podrías, por ejemplo acceder desde la clase Planta a algún atributo de la clase Arbol?


Sobre todo, es fundamental el PLANTEAMIENTO del esquema de dónde está cada cosa: se aconseja crear un esquema visual antes en lápiz y papel. Suerte!


 */
    public static void main(String[] args) throws Exception {
        invernadero.Planta planta1 = new Planta("Areca", "interior", "Colombia");
        invernadero.Arbol arbol1 = new Arbol("Platanero", "perene", 1.9);
        establo.AnimalesDomesticos ad1 = new AnimalesDomesticos("perro", 7, "Pancho");
        establo.AnimalesSalvajes as1 = new AnimalesSalvajes("Oso", 300, "montaña");

        System.err.println("La " + planta1.nombrePlanta + " es una planta de " + planta1.getTipoPlanta() + " y viene de " + planta1.getOrigen());
        System.err.println("El " + arbol1.nombreArbol + " es un arbol de hoja " + arbol1.getTipoArbol() + " y tiene una altura de " + arbol1.getAltura() + "m");
        System.err.println("El " + ad1.getanimalNombre() + " pesa " + ad1.getPeso() + "Kg y se llama " + ad1.getNombreMascota());
        System.err.println("El " + as1.getanimalNombre() + " pesa " + ad1.getPeso() + " y vive en " + as1.getHabitat());
        
        //invernadero.Planta planta3 = new Planta(arbol1.getNombreArbol(), "interior", "Colombia");
        //System.err.println("La " + planta3.nombrePlanta + " es una planta de " + planta3.getTipoPlanta() + " y viene de " + planta3.getOrigen());

    }
}
