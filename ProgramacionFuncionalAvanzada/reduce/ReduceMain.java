package ProgramacionFuncionalAvanzada.reduce;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6,7);
        Integer aux = 0;
        // Usando un bucle for tradicional
        for (Integer number : numbers) {
            aux += number;
        }
        // Esta es la forma tradicional de sumar todos los elementos de una lista
        numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        // esto se puede simmplificar con un método de referencia
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Suma de los números: " + sum);
        // Podemos usarlo también con una multiplicación
        Integer product = numbers.stream().reduce(1, (num1, num2) -> num1 * num2);
        System.out.println("Producto de los números: " + product);
        numbers.stream().reduce(Integer::max);
        numbers.stream().reduce(Integer::min);

    }
}
