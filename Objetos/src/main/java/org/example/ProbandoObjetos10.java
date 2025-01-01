package org.example;

import java.util.Scanner;

public class ProbandoObjetos10 {
    private Scanner tec;
    private double[] alturas;
    private double promedioLocal;
    private double promedio=1.75;
    public void cargarAlturas(){
        alturas = new double[5];
        tec = new Scanner(System.in);
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Ingrese la altura " + (i + 1) + ": ");
            alturas[i] = tec.nextDouble();
        }
    }
    public void calcularPromedioLocal(){
        double suma = 0;
        for (int i = 0; i < alturas.length; i++) {
            suma = suma + alturas[i];
        }
        promedioLocal = suma / alturas.length;
        System.out.println("El promedio de las alturas es: " + promedioLocal);
    }
    public void CantidadesSuperioresAlPromedioLocal(){
        int cantidad = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedioLocal) {
                cantidad++;
            }
        }
        System.out.println("La cantidad de personas que superan el promedio de altura es: " + cantidad);
    }
    public void CantidadesSuperioresAlPromedio(){
        int cantidad = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                cantidad++;
            }
        }
        System.out.println("La cantidad de personas que superan el promedio de altura es: " + cantidad);
    }
    public void comparar(){
        if (promedioLocal > promedio) {
            System.out.println("El promedio local es mayor al promedio general");
        } else {
            if (promedioLocal < promedio) {
                System.out.println("El promedio local es menor al promedio general");
            } else {
                System.out.println("El promedio local es igual al promedio general");
            }
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos10 alturas = new ProbandoObjetos10();
        alturas.cargarAlturas();
        alturas.calcularPromedioLocal();
        alturas.CantidadesSuperioresAlPromedioLocal();
        alturas.CantidadesSuperioresAlPromedio();
        alturas.comparar();
    }
}
