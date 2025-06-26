package ApiStreams.operacionesIntermedias;

import java.util.*;
import java.util.ArrayList;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.size());
        System.out.println(numbers);
        long num = numbers.stream()
                .distinct() // Elimina los elementos duplicados
                .count();
        System.out.println(num); // Imprime el número de elementos únicos



    }
}
