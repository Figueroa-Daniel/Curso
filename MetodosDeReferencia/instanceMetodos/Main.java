package MetodosDeReferencia.instanceMetodos;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PostiveNumber postiveNumber = new PostiveNumber();

        //Para usar un método de instancia, necesitamos una instancia del objeto
        // Usando su referencia
        Predicate<Integer> predicate = postiveNumber::isPositive;
        // Ahora lo mismo pero usando una expresión lambda
        Predicate<Integer> predicateLambda = number -> postiveNumber.isPositive(number);

        System.out.println(predicate.test(10)); // true
        System.out.println(predicateLambda.test(10)); // true
    }
}

class PostiveNumber {
    public boolean isPositive(int number) {
        return number >= 0;
    }
}
