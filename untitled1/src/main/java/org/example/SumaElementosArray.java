package org.example;

public class SumaElementosArray {
    public static void main(String[] args) {
        int[] miArray ={1,2,3,4,4,5,6,6,6,6,7,8,8,9};
        int suma=0;
        for(int i=0;i<miArray.length;i++){
            suma=suma+miArray[i];
        }
        System.out.println(suma);
    }

}
