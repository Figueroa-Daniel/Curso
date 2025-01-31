package org.example;

import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char[] vocales = {'a','e','i','o','u','h'};
        System.out.println("Dime la palabra para deformar: ");
        String palabra = tec.next();
        int menor=palabra.length();
        int[] incidencia= new int[vocales.length];
        for(int i=0;i<vocales.length;i++){
            int aux=palabra.indexOf(vocales[i]);
            if(aux!=-1){
                incidencia[i]=aux;
            }
            if(menor>incidencia[i]){
                menor=incidencia[i];
            }
        }
        String primera=palabra.substring(0,menor+1);
        String segunda=palabra.substring(menor+1,palabra.length());
        String piglatin=segunda+primera+"ay";
        System.out.println(piglatin);
    }
}
