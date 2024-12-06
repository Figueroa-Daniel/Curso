package org.example;

public class SumaElementosArray {
    public static void main(String[] args) {
        int[] miArray ={1,2,3,4,4,5,6,6,6,6,7,8,8,9};
        int suma=0;
        //sumar todos los elementos de un array
        for(int i=0;i<miArray.length;i++){
            suma=suma+miArray[i];
        }
        System.out.println(suma);
        arrayCopy();
        sumarElementos2D();

    }
    public static void sumarElementos2D(){
        //Esta funcion suma todos los elementos de un array 2d
        int[][] array2d2={
                {1,2,4},
                {3,4,5},
                {5,6,6}
        };
        int sum=0;
        for(int i=0;i<array2d2.length;i++){
            for(int j=0;j<array2d2[0].length;j++){
                sum=sum+ array2d2[i][j];
            }
        }
        System.out.println(sum);

    }

    public static void arrayCopy() {
        //Copiar una array a otro usando el rango indicado
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
                't', 'e', 'd' };

        // Copy a range from the `copyFrom` array
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        // Print the copied range as a new String
        System.out.println(new String(copyTo));
    }


    public static void sumar2Matrizes2D(int afirs[][],int asecon[][]) {
        int c, d;
        int sum[][] = new int[afirs.length][afirs[0].length];
        //recorrer las dos matrizes y sumar cada elemento concreto
        for (c = 0; c < afirs.length; c++)
        {
            for (d = 0; d < afirs[0].length; d++)
            {
                sum[c][d] = afirs[c][d] + asecon[c][d];
            }
        }

        System.out.println("\nSum of the two matrices is : ");
        //mostrar la nueva matriz bidimensional
        for (c = 0; c < afirs.length; c++)
        {
            for (d = 0; d < afirs[0].length; d++)
            {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }

}
