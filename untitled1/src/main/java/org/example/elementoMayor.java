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
        MayorEn2d();

    }
    //Calcular el segundo elemento mayor
    private static void segundoMayor(){
        int [] miArray={93,93,90,79,89,37,35,5,10,2,38,8,34,3,53,36,56,78,91,94,94};
        int max = miArray[0];
        int contador=0;
        for(int i=0;i<miArray.length;i++){
            if(miArray[i]>max){
                max = miArray[i];
                contador=i;
            }
        }
        int se=0;
        for(int j=0;j< miArray.length;j++){
            if(contador!=j){
                if(miArray[j]>se && miArray[j]!=miArray[contador]){
                    se= miArray[j];
                }
            }
        }
        System.out.println("El segundo elemento mayor del array es: "+se);
    }
    private static void MayorEn2d(){
        int[][] array2d2={
                {7,2},
                {67,4},
                {5,6}
        };
        int max = array2d2[0][0];
        for(int i=0;i<array2d2.length;i++){
            for(int j=0;j<array2d2[0].length;j++){
                if(array2d2[i][j]>max){
                    max = array2d2[i][j];
                }
            }
        }

        System.out.println("El elemento mayor del array 2D es: "+max);
    }
}
