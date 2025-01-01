package org.example;

import java.util.Scanner;

public class ProbandoObjetos15 {
    private Scanner tec;
    private int[] valores;
    public void cargar10Valores(){
        valores = new int[10];
        tec = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = tec.nextInt();
        }
    }
    public void comprobarOrden(){
        boolean ordenados = true;
        for (int i = 0; i < valores.length - 1; i++) {
            if(valores[i] > valores[i + 1]){
                ordenados = false;
            }
        }
        if(ordenados){
            System.out.println("Los valores están ordenados de menor a mayor");
        }
        else{
            System.out.println("Los valores no están ordenados de menor a mayor");
        }
    }
    public void imprimirValores(){
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos15 valores = new ProbandoObjetos15();
        valores.cargar10Valores();
        valores.imprimirValores();
        valores.comprobarOrden();
    }
}
