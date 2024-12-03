package org.example;

public class array2D {
    public static void main(String[] args) {
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


    }
}
