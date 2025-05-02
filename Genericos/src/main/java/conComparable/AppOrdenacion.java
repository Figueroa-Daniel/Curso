package conComparable;


import java.util.*;

public class AppOrdenacion {
    public static void main(String[] args) {
        int [] intArray = new int[100];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1000);
        }
        //Arrays.sort(intArray,0,10);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        Integer [] intArray2 = new Integer[100];
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = random.nextInt(1000);
        }
        Arrays.sort(intArray2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArray2));

        Alumno alumno1 = new Alumno("12345678A", "Juan", "Pérez", 20, 8.5);
        Alumno alumno2 = new Alumno("87654321B", "Ana", "Gómez", 22, 9.0);
        Alumno alumno3 = new Alumno("23456789C", "Luis", "Martínez", 19, 7.5);
        Alumno alumno4 = new Alumno("34567890D", "María", "López", 21, 8.0);

        // un ArrayList de alumnos
        List<Alumno> lista = new ArrayList<>(Arrays.asList(alumno1, alumno2, alumno3, alumno4));
        Collections.sort(lista);
        System.out.println(lista);
        Collections.sort(lista, new ComparatorPorNotaDescendente());
        System.out.println(lista);

        System.out.println("------------------");

        Set<Integer> setSinOrden = Set.of(1, 2, 3, 4, 5);
        Set<Integer> setConOrden = new TreeSet<>(setSinOrden);
        System.out.println(setConOrden);

        Set <Integer> setConOrden2 = new TreeSet<>(Comparator.reverseOrder());
        setConOrden2.addAll(setSinOrden);
        System.out.println(setConOrden2);




    }
}
