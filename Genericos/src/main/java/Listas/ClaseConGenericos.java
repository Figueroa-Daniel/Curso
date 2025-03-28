package Listas;

import java.util.List;

public class ClaseConGenericos<T> {
    public void imprimirLista(List<T> lista){
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
