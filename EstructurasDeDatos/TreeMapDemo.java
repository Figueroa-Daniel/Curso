package EstructurasDeDatos;

import javax.swing.*;
import java.util.TreeMap;

public class TreeMapDemo {
    /*
    put();
    putIfAbsent();
    putAll();
    entrySet();
    keySet();
    values();
    replace();
    firstKey();
    lastKey();
     */
    public static void main(String[] args) {
        TreeMap<String, String> names = new TreeMap<>();
        // Añadir elementos
        names.put("name1", "value1");
        names.put("name2", "value2");
        names.put("name3", "value3");
        // Imprimir el mapa
        System.out.println("Contenido del TreeMap: " + names);
        names.get( "name1" ); // Obtener un valor por su clave
        names.getOrDefault( "name4", "defaultValue" ); // Obtener un valor por su clave o un valor por defecto si no existe
        //names.remove( "name2" ); // Eliminar un elemento por su clave
        names.replace( "name3", "newValue" ); // Reemplazar el valor de una clave existente
        names.replaceAll( (key, value) -> value.toUpperCase() ); // Reemplazar todos los valores con una función
        TreeMap< String, Integer> numbers = new TreeMap<>();
        // Añadir elementos con enteros
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        // Imprimir el mapa de números
        System.out.println("Contenido del TreeMap de números: " + numbers);
        // Operaciones con TreeMap
        System.out.println(numbers.higherKey( "three" ));// Obtener la clave más alta que es mayor que la clave especificada
        System.out.println(numbers.higherEntry("three")); // Obtener la entrada (clave-valor) más alta que es mayor que la clave especificada
        // Obtener la clave más baja que es menor que la clave especificada
        System.out.println(numbers.lowerKey("three")); // Obtener la clave más baja que es menor que la clave especificada
        System.out.println(numbers.lowerEntry("three")); // Obtener la entrada (clave-valor) más baja que es menor que la clave especificada

        System.out.println(numbers.headMap( "three" )); // Obtener un mapa de todas las entradas con claves menores que la clave especificada
        System.out.println(numbers.tailMap( "three" )); // Obtener un mapa de todas las entradas con claves mayores o iguales a la clave especificada
       System.out.println(numbers.subMap("four", "two")); // Obtener un mapa de todas las entradas con claves entre las dos claves especificadas
        System.out.println("Primer clave: " + numbers.firstKey()); // Obtener la primera clave del mapa
        System.out.println("Última clave: " + numbers.lastKey()); // Obtener la última clave del mapa
        System.out.println("Primer entrada: " + numbers.firstEntry()); // Obtener la primera entrada (clave-valor) del mapa
        System.out.println("Última entrada: " + numbers.lastEntry()); // Obtener la última entrada (clave-valor) del mapa
        System.out.println("Tamaño del mapa: " + numbers.size()); // Obtener el tamaño del mapa
        System.out.println("¿El mapa está vacío? " + numbers.isEmpty()); // Verificar si el mapa está vacío
        names.clear(); // Limpiar el mapa
        System.out.println("Contenido del TreeMap después de limpiar: " + names);




    }
}
