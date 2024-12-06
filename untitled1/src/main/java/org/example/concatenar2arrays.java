package org.example;

public class concatenar2arrays {
    public static void main(String[] args) {

    }
    public static int[] concat(int[] array1, int[] array2) {
        int longitud1 = array1.length;
        int longitud2 = array2.length;
        int[] arrayConcatenado = new int[longitud1 + longitud2];
        System.arraycopy(array1, 0, arrayConcatenado, 0, longitud1);
        System.arraycopy(array2, 0, arrayConcatenado, longitud1, longitud2);
        //1.array del que se copiaran los elementos
        //2.Posicion desde donde se empieza a copiar
        //3.Array donde se posicionaran los elementos
        //4.Posición inicial en el array de destino donde se posicionaran los elementos
        //5.Cantidad de elementos a copiar
        return arrayConcatenado;
    }
}
