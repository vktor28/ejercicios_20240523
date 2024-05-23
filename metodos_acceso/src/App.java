public class App {
/*
 1- (fácil) probando metodos de acceso

Crear una clase en el directorio principal (en el mismo nivel que la clase app.java)
con los modificadores de acceso  public y private (y default) y ver como accedo a cada atributo.

Ejemplo clase Libro:
public nombre;
private codigoisbn;
(no poner nada) double precio;
Desde la clase main, instancia un libro e intenta acceder a cada propiedad del libro instanciado
por separado. ¿Cómo lo consigues?
 */
    public static void main(String[] args) throws Exception {
        Libro l1 = new Libro("LA GRIETA DEL SILENCIO", 55353, 20.80);
        Libro l2 = new Libro("HP - Pieda Filosofal", 5355, 15.90);
        
        System.out.println("\nVemos Nombre:");
        System.out.println(l1.nombre);
        System.out.println(l2.nombre);
        System.out.println(l1.getNombre());
        System.out.println(l2.getNombre());

        System.out.println("\nVemos ISBN:");
        System.out.println(l1.getCodigoisbn());
        System.out.println(l2.getCodigoisbn());

        System.out.println("\nVemos Precio:");
        System.out.println(l1.precio);
        System.out.println(l2.precio);
        System.out.println(l1.getPrecio());
        System.out.println(l2.getPrecio());

    }
}
