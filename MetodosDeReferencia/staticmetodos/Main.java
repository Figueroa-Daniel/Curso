package MetodosDeReferencia.staticmetodos;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Predicate<String> nameLength = name -> name.length() > 5;

        Predicate<Integer> checkPositive = num -> PositiveNumber.isPositive(num);

        // En este no podemos usar el método de referencia porque tiene mas de un metodo
        Predicate<Integer> checkPositive2 = num -> {
            System.out.println("Checking if " + num + " is positive");
            return PositiveNumber.isPositive(num);
        };
        // Ahora podemos usar el método de referencia, es totalmente equivalente al primer ejemplo
        Predicate <Integer> checkPositiveRef = PositiveNumber::isPositive;

        BooleanCheck checkPositive3 =  number -> PositiveNumber.isPositive(number);
        System.out.println(checkPositive3.check(10));


    }

}
//Podriamos crear nuestra propia interfaz funcional

interface BooleanCheck{
    boolean check(int number);
}

class PositiveNumber {
    public static boolean isPositive(int number) {
        return number >= 0;
    }
}