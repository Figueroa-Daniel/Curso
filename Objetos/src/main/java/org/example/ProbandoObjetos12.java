package org.example;

import java.util.Scanner;

public class ProbandoObjetos12 {
    private int[] valores;
    private Scanner tec;
    public void cargar8valores(){
        for(int i=0;i<valores.length;i++){
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = tec.nextInt();
        }
    }
    public int sumaValores(){
        int suma = 0;
        for(int i=0;i<valores.length;i++){
            suma = suma + valores[i];
        }
        return suma;
    }
    public void promedioValores(){
        int suma = sumaValores();
        int promedio = suma / valores.length;
        System.out.println("El promedio de los valores es: " + promedio);
    }
    public void mostrarMayoresA36(){
        for(int i=0;i<valores.length;i++){
            if(valores[i]>36){
                System.out.println(valores[i]);
            }
        }
    }
    public void cantidadValoresMayoresA50(){
        int cantidad = 0;
        for(int i=0;i<valores.length;i++){
            if(valores[i]>50){
                cantidad++;
            }
        }
        System.out.println("La cantidad de valores mayores a 50 es: " + cantidad);
    }
    public static void main(String[] args) {
        ProbandoObjetos12 valores = new ProbandoObjetos12();
        valores.valores = new int[8];
        valores.tec = new Scanner(System.in);
        valores.cargar8valores();
        int suma= valores.sumaValores();
        System.out.println("La suma de los valores es: " + suma);
        valores.promedioValores();
        System.out.println("Los valores mayores a 36 son:");
        valores.mostrarMayoresA36();
        valores.cantidadValoresMayoresA50();
    }
}
