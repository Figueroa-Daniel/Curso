package EstructurasDeDatos;


import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        System.out.println(names.peek()); // Nos da el primer elemento sin eliminarlo y devuelve null si la lista está vacía
        System.out.println(names.element()); // Nos da el primer elemento sin eliminarlo y lanza una excepción si la lista está vacía
        System.out.println(names.poll()); // Nos da el primer elemento y lo elimina, devuelve null si la lista está vacía
        System.out.println(names.remove()); // Nos da el primer elemento y lo elimina, lanza una excepción si la lista está vacía
        System.out.println(names.offer("name4")); // Añade un elemento al final de la lista y devuelve true si se añade correctamente
        System.out.println(names.add("name5")); // Añade un elemento al final de la lista y devuelve true si se añade correctamente
        //Si en vez de tener un Queue tuviéramos una LinkedList podríamos usar los métodos de la clase LinkedList
        LinkedList<String> linkedList = (LinkedList<String>) names;
        linkedList.addFirst("name0"); // Añade un elemento al principio de la lista
        linkedList.addLast("name6"); // Añade un elemento al final de la lista
        System.out.println(linkedList.getFirst()); // Nos da el primer elemento sin eliminarlo
        System.out.println(linkedList.getLast()); // Nos da el último elemento sin eliminarlo
        System.out.println(linkedList.removeFirst()); // Nos da el primer elemento y lo elimina
        System.out.println(linkedList.removeLast()); // Nos da el último elemento y lo elimina

    }
}
