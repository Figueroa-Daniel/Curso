package genericosComodin;

import java.util.List;

public class ProcesaListas {
    public static void imprimirLista(List<?> lista){
        for (Object elemento : lista) {
            System.out.println(elemento);
        }

    }
    public static void imprimirListav2(List<? extends Number> lista){
        for(int i = 0; i <= lista.size()-2; i++){
            System.out.print(lista.get(i)+", ");
        }
        System.out.println(lista.get(lista.size()-1));
    }

    public static void addNumeros(List<? super Integer> lista){
        for(int i = 1; i <= 10; i++){
            lista.add(i);
        }
    }
}
