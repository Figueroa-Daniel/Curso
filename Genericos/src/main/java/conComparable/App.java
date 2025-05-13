package conComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("12345678A", "Juan", "Pérez", 20, 8.5);
        Alumno alumno2 = new Alumno("87654321B", "Ana", "Gómez", 22, 9.0);
        Alumno alumno3 = new Alumno("23456789C", "Luis", "Martínez", 19, 7.5);
        Alumno alumno4 = new Alumno("34567890D", "María", "López", 21, 8.0);
        if(alumno1.compareTo(alumno2)>0) {
            System.out.println(alumno1 + " es mayor que " + alumno2);
        } else{
            System.out.println(alumno1 + " es menor que " + alumno2);
        }
        System.out.println("------------------");
        List<Alumno> lista = new ArrayList<>(List.of(alumno1, alumno2, alumno3, alumno4));
        System.out.println("Lista en orden de inserción:");
        System.out.println(lista);

        TreeSet <Alumno> set = new TreeSet<>(lista);
        System.out.println("Lista ordenada por edad:");
        System.out.println(set);

        // con comparator
        TreeSet <Alumno> set2 = new TreeSet<>(new ComparatorPorNotaDescendente());
        set2.addAll(lista);
        System.out.println("Lista ordenada por nota:");
        System.out.println(set2);

    }
}
