package org.example;

public class elementoMayor {
    public static void main(String[] args) {
        int [] miArray={5,10,2,8,3,53};
        int max = miArray[0];
        for(int i=1;i<miArray.length;i++){
            if(miArray[i]>max){
                max = miArray[i];
            }
        }
        System.out.println("El mayor elemento del array es: "+max);
        segundoMayor();

    }
    private static void segundoMayor(){
        int [] miArray={89,37,35,5,10,2,38,8,34,3,53,36,56,78};
        int max = miArray[0];
        int seg=;
        for(int i=1;i<miArray.length;i++){
            if(miArray[i]>max){
                max = miArray[i];
                if(seg<=max) {
                    seg = max;
                }
                if(miArray[miArray.length-1]>seg && miArray[miArray.length-1]<max) {
                    seg = miArray[miArray.length-1];
                }
            }
        }
        System.out.println("El segundo elemento mayor del array es: "+seg);
    }
}
