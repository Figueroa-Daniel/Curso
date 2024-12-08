package org.example;

public class mostrarElementosDuplicados {
    public static void main(String[] args) {
        //este programa te dice, en una lista, que numeros se repiten y cuantas veces
        int[] miArray ={4,4,3,3,2,4};
        int cont=0,num=0, cont2=0;
        boolean c=false;
        int lenght = miArray.length;
        for(int i=0;i<lenght;i++){
            for(int j=i+1;j<lenght;j++){
                if(miArray[i]==miArray[j]){
                    cont++;
                    c=true;
                    num=miArray[i];
                }
            }

            if(c==true && cont2!=num){
                System.out.println("se repite el "+num+" "+(cont+1)+"veces");
                cont2=num;
            }
            c=false;
            cont=0;
        }
    }
}
