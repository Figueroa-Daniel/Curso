package org.example;

import java.util.Scanner;


public class array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaración de array 2d
        int [][] array2d = new int[3][2];
        int[][] array2d2={
                {1,2},
                {3,4},
                {5,6}
        };
        //Recorrer array 2d
        for(int i=0;i<array2d2.length;i++){
            for(int j=0;j<array2d2[0].length;j++){
                System.out.print(array2d2[i][j]+"-");
            }
            System.out.println("");
        }
        //contar elementos de un array 2D, como o es un cuadrado o un rectangulo solo haría falta calcular la base y la altura
        int cuenta=array2d2.length*array2d2[0].length;
        System.out.println(cuenta);
        //Pedir rellenar todos los elementos de una matriz 2D
        System.out.println("Introduce los elementos de la matriz 2d:");
        for (int i = 0;i< array2d.length; i++) {
            for (int j = 0;j<array2d[0].length; j++) {
                System.out.println("Introduce el elemento [" + i + "][" + j + "]");
                array2d[i][j] = scanner.nextInt();
            }
        }





    }
}
