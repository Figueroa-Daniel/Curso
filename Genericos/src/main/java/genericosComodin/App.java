package genericosComodin;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> l1= List.of("Hola", "Mundo", "Java", "Kotlin");
        List<Integer> l2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ProcesaListas.imprimirLista(l1);
        ProcesaListas.imprimirLista(l2);

        ProcesaListas.imprimirListav2(l2);


        ProcesaListas.addNumeros(l2);
        ProcesaListas.imprimirListav2(l2);
    }
}
