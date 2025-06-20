package MetodosDeReferencia.staticmetodos;

import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        Predicate<Integer> esPar = Operations::esPar;
        System.out.println(esPar.test(4));
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(Operations::esPar)
                .filter(Operations::esNegativo) // Filtra los números negativos
                .forEach(System.out::println); // Imprime los números pares de la lista

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
