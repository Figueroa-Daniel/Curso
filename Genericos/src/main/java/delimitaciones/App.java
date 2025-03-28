package delimitaciones;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // MathListUtils <String> mathListUtilsString = new MathListUtils<>(); //error
        MathListUtils <Integer> mathListUtilsInteger = new MathListUtils<>();
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        System.out.println(mathListUtilsInteger.suma(listaEnteros));
        List<Double> listaReales = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        MathListUtils <Double> mathListUtilsDouble = new MathListUtils<>();
        System.out.println(mathListUtilsDouble.suma(listaReales));


        // esto da error MultipleBounds.max("A","B","C");
        MultipleBounds.max(1,2,3);
        System.out.println(MultipleBounds.max(1,2,3));
    }
}
