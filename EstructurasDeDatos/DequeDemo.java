package EstructurasDeDatos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
// Operaciones de deque (double-ended queue): Elementos se pueden añadir o eliminar por ambos extremos
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        Deque<String> names2 = new LinkedList<>();
        names.addFirst("name1");
        names.addLast("name2");
        names.offer( "name3"); // Añade al final, similar a addLast
        names.offerFirst("name0"); // Añade al principio, similar a addFirst
        names2.offer( "name1");
        names2.offerLast("name2");
        names2.offerFirst("name3");
        names2.offerLast("name4");
        System.out.println(names2);
        //Tambien tenemos Peek que nos da el primer elemento sin eliminarlo
        System.out.println("Primer elemento: " + names.peekFirst()); // Nos da el primer elemento sin eliminarlo
        // Con el tambien tenemos peekLast que nos da el ultimo elemento sin eliminarlo
        // Y peekFirst que nos da el primer elemento sin eliminarlo






        
    }
}
