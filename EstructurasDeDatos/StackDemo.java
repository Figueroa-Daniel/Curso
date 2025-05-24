package EstructurasDeDatos;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Son operaciones de pila
        Stack<String> names = new Stack<>();
        names.push("name1");
        names.push("name2");
        names.push("name3");
        System.out.println(names.get(0));
        System.out.printf(names.peek()); //Nos da el ultimo introducido
        System.out.println(names.pop()); //Nos da el ultimo introducido y lo elimina
        System.out.println(names.search("name2"));
        names.pop();
        System.out.println(names.search("names2")); //devuelve -1 porque no lo encuentra
    }
}
