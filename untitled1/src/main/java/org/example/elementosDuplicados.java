package org.example;

public class elementosDuplicados {
    public static void main(String[] args) {
        //este programa desordena el resultado y modifica el array inicial
        int[] miArray ={1,2,3,4,4,5,6,6,6,6,7,8,8,9};
        int lenght = miArray.length;
        for(int i=0;i<lenght;i++){
            for(int j=i+1;j<lenght;j++){
                if(miArray[i]==miArray[j]){
                    miArray[j]=miArray[lenght-1];
                    lenght--;
                    j--;
                }
            }
        }
        System.out.println(miArray.length-lenght);
    }
}
