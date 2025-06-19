package InterfacesFuncionalesYLambdas.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main2 {
    public static void main(String[] args) {
        // BiConsumer es una interfaz funcional que acepta dos argumentos y no devuelve ningún resultado.
        // Esto puede ser útil con mapas o estructuras de datos que requieren dos entradas.
        BiConsumer<Integer,Integer> addTwo = (x, y) -> {
            System.out.println("Suma: " + (x +" "+ y));
        };
        addTwo.accept(5, 10); // Imprime la concatenación de los dos números
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.forEach((key,value) -> {
            System.out.println("Clave: " + key + ", Valor: " + value);
        });

    }
}
