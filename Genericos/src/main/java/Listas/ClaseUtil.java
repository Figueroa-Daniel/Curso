package Listas;

import java.util.List;

public class ClaseUtil {
    public static <T> void imprimirLista(List<T> lista){
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
