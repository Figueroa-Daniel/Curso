package org.example;

import java.util.Scanner;

public class ProbandoObjetos16 {
    private Scanner tec;
    private int[] valores;
    public void cargarNvalores(){
        tec = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores que desea ingresar: ");
        int cantidad = tec.nextInt();
        valores = new int[cantidad];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = tec.nextInt();
        }
    }
    public void sumaValores(){
        int suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i];
        }
        System.out.println("La suma de los valores es: " + suma);
    }
    public static void main(String[] args) {
        ProbandoObjetos16 valores = new ProbandoObjetos16();
        valores.cargarNvalores();
        valores.sumaValores();
    }
}
