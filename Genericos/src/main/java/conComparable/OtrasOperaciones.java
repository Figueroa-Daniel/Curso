package conComparable;

import java.util.*;

public class OtrasOperaciones {
    public static void main(String[] args) {
        List<Integer> listaVacia = Collections.emptyList();

        List<Integer> lista = new ArrayList<>();
        lista.addAll(List.of(1,2,3,4,5));

        List<Integer> vistaInmutable = Collections.unmodifiableList(lista);
        lista.add(6);
        System.out.println(lista);

        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(1000));
        }
        Collections.sort(numeros);
        int pos = Collections.binarySearch(numeros, 123);
        System.out.println(numeros);
        if(pos > 0){
            System.out.println("El número 123 está en la posición " + pos);
        } else {
            System.out.println("El número 123 no está en la lista");
            System.out.println("El número debería estar en la posición " + (-pos - 1));
        }
        List<Integer> numeros2 = List.of(1,2,3,4,5,6,7,8,9,10);
        pos= Collections.indexOfSubList(numeros2, List.of(3,4,5));
        System.out.println("La sublista empieza en la posición " + pos);
        pos = Collections.lastIndexOfSubList(numeros2, List.of(5,6,7));
        System.out.println("La sublista empieza en la posición " + pos);
        List<Integer> numeros3 = new ArrayList<>(numeros2);
        Collections.shuffle(numeros3);
        System.out.println("Lista desordenada: " + numeros3);
        Collections.swap(numeros3,0,numeros3.size()-1);
        System.out.println("Lista desordenada: " + numeros3);

        List<String> saludos = Collections.nCopies(10,"Hola");
        System.out.println(saludos);
        List <String> listaVacia2 = new ArrayList<>();
        listaVacia2.addAll(Collections.nCopies(11,"Adios"));
        Collections.copy(listaVacia2, saludos);
        System.out.println(listaVacia2);

        Collections.addAll(numeros3, 1,2,3,4,5);
        System.out.println(numeros3);

        int freq = Collections.frequency(numeros3, 1);
        System.out.println("El número 1 aparece " + freq + " veces en la lista");

        int max = Collections.max(numeros);
        System.out.println("El número máximo es " + max);
        int min = Collections.min(numeros);
        System.out.println("El número mínimo es " + min);


    }
}
