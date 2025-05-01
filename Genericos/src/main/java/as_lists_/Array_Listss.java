package as_lists_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_Listss {
    public static void main(String[] args) {
        List<Integer> listaArr= new ArrayList<>();
        listaArr.add(10);
        listaArr.add(20);
        listaArr.add(30);
        listaArr.addAll(List.of(8,7,6));
        listaArr.add(45);
        System.out.println(listaArr);
        for(int i = 0; i < listaArr.size(); i++){
            System.out.println(listaArr.get(i));
        }
        System.out.println("El tamaño de la lista es: "+listaArr.size());
        System.out.println("------------------");
        for( Integer elemento : listaArr){
            System.out.println(elemento);
        }
        System.out.println("------------------");
        List<Integer> lista4 = new ArrayList<>(List.of(1,2,3,4,5,25,26,27,28,29,30));
        for(Iterator<Integer> it = lista4.iterator(); it.hasNext();){
            int n = it.next();
            if(n%10==0 || n%5==0){
                it.remove();
            }
        }
        System.out.println(lista4);

        System.out.println("------------------");
        int pos = lista4.indexOf(27); // devuelve la posicion del elemento(primera coincidencia)
        System.out.println(pos);
        int pos2= lista4.lastIndexOf(27); // devuelve la posicion del elemento(ultima coincidencia)
        boolean contains = lista4.contains(27); // devuelve true o false
        System.out.println(contains);
        contains= lista4.containsAll(List.of(1,2,3,4)); // devuelve true o false

    }
}
