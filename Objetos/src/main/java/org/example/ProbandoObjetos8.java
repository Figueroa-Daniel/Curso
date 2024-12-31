package org.example;

import java.util.Scanner;

public class ProbandoObjetos8 {
    private Scanner tec;
    private int[] valores;
    public void cargar3Valores(){
        valores = new int[3];
        tec = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = tec.nextInt();
        }
    }
    public void imprimirValores(){
        if(valores[0]>valores[1] && valores[0]>valores[2]){
            System.out.println(valores[0] + " es el mayor");
        }
        else{
            if(valores[1]>valores[2]){
                System.out.println(valores[1] + " es el mayor");
            }
            else{
                System.out.println(valores[2] + " es el mayor");
            }
        }
        if(valores[0]<valores[1] && valores[0]<valores[2]){
            System.out.println(valores[0] + " es el menor");
        }
        else{
            if(valores[1]<valores[2]){
                System.out.println(valores[1] + " es el menor");
            }
            else{
                System.out.println(valores[2] + " es el menor");
            }

        }
    }
    public static void main(String[] args) {
        ProbandoObjetos8 valores = new ProbandoObjetos8();
        valores.cargar3Valores();
        valores.imprimirValores();
    }
}
