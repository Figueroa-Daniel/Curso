package set;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set <String> set1 = Set.of("Uno", "Dos", "Tres");
        for(String s : set1){
            System.out.println(s);
        }
        for(Iterator<String> it = set1.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
        Set <Alumno> set2 = new HashSet<>();
        set2.add(new Alumno("12345678", "Juan", "Pérez"));
        set2.add(new Alumno("87654321", "Ana", "Gómez"));
        set2.add(new Alumno("12345678", "Juana", "Pérez"));
        set2.add(new Alumno("12345678", "Juan", "Pérez")); // no se añade
        // El hashSet no permite duplicados
        for(Alumno a : set2){
            System.out.println(a);
        }
        System.out.println("------------------");
        Set<Alumno> set3 = new LinkedHashSet<>(set2);
        set3.add(new Alumno("12345678", "Juan", "Pérez")); // no se añade
        set3.add(new Alumno("12345678", "Juano", "Pérez"));
        set3.add(new Alumno("12345678", "Juana", "Miguéz"));
        // El linkedHashSet mantiene el orden de inserción
        for(Alumno a : set3){
            System.out.println(a);
        }
        System.out.println("------------------");
        // no se puede usar Set como referencia en el treeSet
        TreeSet<Integer> set4 = new TreeSet<>();
        //Le pasamos 10 numeros aleatorios
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            set4.add(random.nextInt(100));
        }
        // Se ordenan automaticamente de forma ascendente
        for (int i : set4){
            System.out.print(i+" ");
        }
        System.out.println();
        // para ordenarlos de forma descendente se usa descendingSet()
        for ( int i : set4.descendingSet()){
            System.out.print(i+" ");
        }
        // Tmabién se podria usar el iterator con descendingIterator() o el iterador normal
        /*
            metodo para saber el primer y el ultimo elemento: first() y last()
            metodo para eliminar el primer y el ultimo elemento: pollFirst() y pollLast()
            obtener elemento menor o mayor a uno dado: higher(e) y lower(e), o ceiling(e) y floor(e)
            obtener un subconjunto: subSet(e1, e2), headSet(e) y tailSet(e)

         */
        // uso del subset
        Set <Integer> set5 = set4.subSet(10, 50);
        System.out.println();
        for (int i : set5){
            System.out.print(i+" ");
        }


    }
}
