package as_lists_;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Ejemplo de uso de List.of y asList
 * Esto sirve para crear listas inmutables
 * cosa que los arays no pueden hacer
 */

public class App {
    public static void main(String[] args) {
        List<String> lista = asList("Hola", "Mundo", "Java", "Kotlin");
        //lista.add("Python");
        // lista.remove(0);
        // No van a funcionar porque la lista es inmutable en tamaño
        lista.set(0, "Python");
        System.out.println(lista);
        List<Integer> lista2 = List.of(1,2,3,4,5);
        //lista.add("Python");
        // lista.remove(0);
        // lista.set(0, 1);
        // No funcionan porque la lista es inmutable en tamaño y en contenido

        List<Producto> lista3= List.of(
                new Producto("Producto 1", 10.0),
                new Producto("Producto 2", 20.0),
                new Producto("Producto 3", 30.0),
                new Producto("Producto 4", 40.0)
        );
        lista3.get(1).precio=4.5;
        // Aunque la lista no sea mutable, el objeto dentro de la lista sí lo es

    }
}
