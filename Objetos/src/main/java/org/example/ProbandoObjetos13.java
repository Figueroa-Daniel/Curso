package org.example;

import java.util.Scanner;

public class ProbandoObjetos13 {
    private Scanner tec;
    private int[] valores1;
    private int[] valores2;
    private int[] suma;
    public void cargarValores(){
        valores1 = new int[5];
        valores2 = new int[5];
        suma = new int[5];
        tec = new Scanner(System.in);
        for (int i = 0; i < valores1.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " del primer arreglo: ");
            valores1[i] = tec.nextInt();
            System.out.println("Ingrese el valor " + (i + 1) + " del segundo arreglo: ");
            valores2[i] = tec.nextInt();
            suma[i] = valores1[i] + valores2[i];
        }
    }
    public void imprimirSuma(){
        for (int i = 0; i < suma.length; i++) {
            System.out.println("La suma de los valores " + valores1[i] + " y " + valores2[i] + " es: " + suma[i]);
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos13 valores = new ProbandoObjetos13();
        valores.cargarValores();
        valores.imprimirSuma();
    }
}
