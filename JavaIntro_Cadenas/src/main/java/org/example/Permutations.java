package org.example;

public class Permutations {
    public static void main(String[] args) {
        String palabra="hola";
        String palabrArray[] = palabra.split("");
        int distancia=palabrArray.length;
        int conbinaciones = palabra.length()*palabra.length();
        int intercambio=0;
        int intercambio2=0;
        for(int i=0;i<conbinaciones;i++){
            String nuevapa="";
            nuevapa= nuevapa+ palabrArray[i];
            for(int j=1;j<distancia;j++){
                nuevapa=nuevapa+palabrArray[j];

            }
            System.out.println(nuevapa);

        }
    }
}
