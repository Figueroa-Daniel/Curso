package org.example;

public class array_sintax {
    public static void main(String[] args) {
        //Crear arrays
        int[] numeros = {10, 20, 40, 40, 50};
        int[] edades = new int[5];
        edades[0] = 31;
        edades[1] = 23;
        edades[2] = 56;
        edades[3] = 12;
        edades[4] = 32;
        int[] cosas;
        cosas = new int[3]; // Array con tamaño
        //Clonar array
        int[] numeros2 = numeros.clone();
        int[] numeros3 = arrayclonacion(numeros);
        //mostrar array con for each
        for (int numero : numeros3) {
            System.out.println(numero);
        }
        //mostrar array con for normal
        for(int i=0;i<numeros3.length;i++){
            System.out.print("-"+numeros3[i]);
        }


    }
    static int[] arrayclonacion(int[]numeros){
        int[] nueva = new int[numeros.length];
        for(int i=0;i<numeros.length;i++){
            nueva[i]=numeros[i];
        }
        return nueva;
    }

}
