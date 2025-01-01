package org.example;

import java.util.Scanner;

public class ProbandoObjetos14 {
    private Scanner tec;
    private float[] notasA;
    private float[] notasB;
    private float promedioA;
    private float promedioB;
    public void cargarNotas(){
        tec = new Scanner(System.in);
        notasA = new float[5];
        notasB = new float[5];
        for (int i = 0; i < notasA.length; i++) {
            System.out.println("Ingrese la nota A del alumno " + (i + 1) + ": ");
            notasA[i] = tec.nextFloat();
            System.out.println("Ingrese la nota B del alumno " + (i + 1) + ": ");
            notasB[i] = tec.nextFloat();
        }
    }
    public void calcularPromedio(){
        float sumaA = 0;
        float sumaB = 0;
        for (int i = 0; i < notasA.length; i++) {
            sumaA += notasA[i];
            sumaB += notasB[i];
        }
        promedioA = sumaA / notasA.length;
        promedioB = sumaB / notasB.length;
        System.out.println("El promedio de las notas A es: " + promedioA);
        System.out.println("El promedio de las notas B es: " + promedioB);
    }
    public void comparar(){
        if (promedioA > promedioB) {
            System.out.println("El promedio de las notas A es mayor al promedio de las notas B");
        } else {
            if (promedioA < promedioB) {
                System.out.println("El promedio de las notas A es menor al promedio de las notas B");
            } else {
                System.out.println("El promedio de las notas A es igual al promedio de las notas B");
            }
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos14 notas = new ProbandoObjetos14();
        notas.cargarNotas();
        notas.calcularPromedio();
        notas.comparar();
    }
}
