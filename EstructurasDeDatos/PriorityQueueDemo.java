package EstructurasDeDatos;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> names = new PriorityQueue<>();
        // Operaciones de cola de prioridad
        names.offer(5); // Añade un elemento
        names.offer(1); // Añade un elemento
        names.offer(3); // Añade un elemento
        names.offer(2); // Añade un elemento
        names.offer(4); // Añade un elemento
        System.out.println("Elementos en la cola de prioridad: " + names);
        // Con strings
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("banana");
        stringQueue.offer( "apple");
        stringQueue.offer("cherry");
        stringQueue.offer("date");
        System.out.println("Elementos en la cola de prioridad de strings: " + stringQueue);
        // Podriamos usar un comparator
        PriorityQueue<String> customQueue = new PriorityQueue<>(Comparator.comparingInt(String::length)); // Orden descendente
        customQueue.offer("banana");
        customQueue.offer("apple");
        customQueue.offer("cherry");
        customQueue.offer("date");
        System.out.println("Elementos en la cola de prioridad personalizada: " + customQueue);
        names.remove(1); // Elimina un elemento específico
        System.out.println("Elementos después de eliminar el 1: " + names);
        // El remove tambien puede eliminar strings
        stringQueue.remove("apple"); // Elimina un elemento específico
        // El poll devuelve el primer elemento y lo elimina
        System.out.println("Primer elemento eliminado: " + names.poll());
        // PriorytyQueuw con comparator, esto elimina el primer elemento según el criterio del comparator
        PriorityQueue<String> customPriorityQueue = new PriorityQueue<>( Comparator.comparingInt(String::length)); // Orden descendente
        customPriorityQueue.offer("banana");
        customPriorityQueue.offer("apple");
        customPriorityQueue.offer("cherry");
        customPriorityQueue.offer("date");
        while (!customPriorityQueue.isEmpty()) {
            System.out.println("Elemento eliminado: " + customPriorityQueue.poll()); // Elimina el primer elemento
        }



    }
}
