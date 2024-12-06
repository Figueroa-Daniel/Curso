package org.example;

public class transposicion_matriz {
    public static void main(String[] args) {
        int[][] array2d2 = {
                {1, 2, 5},
                {3, 4, 6}
        };
        int[][] arraytranspuesto = new int[array2d2[0].length][array2d2.length];
        //Mostramos el array nuevo vacio
        for (int i = 0; i < arraytranspuesto.length; i++) {
            for (int j = 0; j < arraytranspuesto[0].length; j++) {
                System.out.print(arraytranspuesto[i][j] + "-");
            }
            System.out.println("");
        }
        //hacemos la transposicon
        for (int i = 0; i < array2d2.length; i++) {
            for (int j = 0; j < arraytranspuesto.length; j++) {
                arraytranspuesto[j][i] = array2d2[i][j];
            }
            System.out.println("");
        }
        System.out.println("mostramos el array lleno");
        for (int i = 0; i < arraytranspuesto.length; i++) {
            for (int j = 0; j < arraytranspuesto[0].length; j++) {
                System.out.print(arraytranspuesto[i][j] + "-");
            }
            System.out.println("");
        }
    }
}
