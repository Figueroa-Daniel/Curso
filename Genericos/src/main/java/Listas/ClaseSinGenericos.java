package Listas;

import java.util.List;

public class ClaseSinGenericos {
    public void imprmirListaEnteros(List<Integer> listaEnteros) {
        for (Integer entero : listaEnteros) {
            System.out.println(entero);
        }
    }
    public void imprimirListaCadena(List<String> listaCadenas) {
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }
    }
}
