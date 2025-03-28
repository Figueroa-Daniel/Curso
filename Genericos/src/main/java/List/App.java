package List;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4, 5);
        List<String> cadenas = List.of("Hola", "Mundo", "Java", "Kotlin");
        ClaseSinGenericos claseSinGenericos = new ClaseSinGenericos();
        claseSinGenericos.imprimirListaCadena(cadenas);
        claseSinGenericos.imprmirListaEnteros(enteros);
    }
}
