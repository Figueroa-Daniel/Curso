package org.example;

import java.util.Scanner;

public class ordenandoArraySobreLaMarcha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[5];

        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Dime el sueldo del trabajador: ");
            int nuevoSueldo = scanner.nextInt();

            // Insertar el nuevo sueldo en el lugar correcto dentro del array
            int j = i;
            while (j > 0 && miArray[j - 1] < nuevoSueldo) { // Orden descendente
                miArray[j] = miArray[j - 1]; // Desplazar elementos hacia la derecha
                j--;
            }
            miArray[j] = nuevoSueldo; // Insertar el nuevo sueldo en su posición
        }

        // Imprimir el array ordenado
        System.out.println("Sueldo de los trabajadores ordenados de mayor a menor:");
        for (int numero : miArray) {
            System.out.println(numero);
        }

        scanner.close();
    }
    //Codigo para ordenar un array
    /*
    for(int k=0;k<vec.length;k++) {
            for(int f=0;f<vec.length-1-k;f++) {
                if (vec[f]>vec[f+1]) {
                    int aux;
                    aux=vec[f];
                    vec[f]=vec[f+1];
                    vec[f+1]=aux;
                }
            }
        }
     */
}
