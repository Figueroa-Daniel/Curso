package InterfacesFuncionalesYLambdas.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> extractLength = str -> str.length(); // el str.length() devuelve un entero que equivale al Integer de la función

        Integer titleLength = extractLength.apply("Interfaces Funcionales y Lambdas");
        System.out.println("Longitud del título: " + titleLength); // Imprime la longitud del título

        BiFunction<Integer, Integer, Double> diveder = (x, y) -> Double.valueOf(x/y);
        System.out.println(diveder.apply(5,3));
    }
}
