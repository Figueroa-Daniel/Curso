package MetodosDeReferencia.staticmetodos;

import java.awt.*;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        Predicate<Integer> esPar = Operations::esPar;
        System.out.println(esPar.test(4));
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(Operations::esPar)
                .forEach(System.out::println); // Imprime los números pares de la lista
        54:00
    }
}
class Operations{
    static boolean esPar(int number) {
        return number % 2 == 0;
    }
    static boolean esNegativo(int number) {
        return number < 0;
    }
}
