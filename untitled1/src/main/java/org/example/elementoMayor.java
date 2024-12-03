package org.example;

public class elementoMayor {
    public static void main(String[] args) {
        int [] miArray={5,10,2,8,3};
        int max = miArray[0];
        for(int i=1;i<miArray.length;i++){
            if(miArray[i]>max){
                max = miArray[i];
            }
        }
        System.out.println("El mayor elemento del array es: "+max);

    }
}
