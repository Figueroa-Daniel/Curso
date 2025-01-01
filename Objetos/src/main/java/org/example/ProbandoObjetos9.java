package org.example;

import java.util.Scanner;

public class ProbandoObjetos9 {
    private Scanner teclado;
    private int[] sueldos;
    private String[] nombres;
    private int indice;
    public void cargarSueldo(){
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for(int f=0;f<5;f++){
            System.out.print("Ingrese el sueldo de "+nombres[f]+":");
            sueldos[f]=teclado.nextInt();
        }
    }
    private void cargarNombres(){
        nombres = new String[5];
        teclado = new Scanner(System.in);
        for(int f=0;f<5;f++){
            System.out.print("Ingrese nombre del empleado:");
            nombres[f]=teclado.next();
        }
    }
    private int sueldo(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        String nom = teclado.next();
        for(int f=0;f<5;f++){
            if(nom.equals(nombres[f])){
                indice = f;
            }
        }
        return indice;
    }
    public void imprimirSueldo(){
        cargarNombres();
        cargarSueldo();
        int indice = sueldo();
        System.out.println("El sueldo de "+nombres[indice]+" es "+sueldos[indice]);
    }
    public static void main(String[] args) {
        ProbandoObjetos9 sueldos = new ProbandoObjetos9();
        sueldos.imprimirSueldo();
    }
}
