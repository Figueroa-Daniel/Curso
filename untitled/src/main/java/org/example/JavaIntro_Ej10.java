package org.example;

import java.util.Scanner;

public class JavaIntro_Ej10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final int inicial=150000;
        int tiempo, fnal;
        System.out.println("Cuanto segundos lleva moviendose la sonda ");
        tiempo= sc.nextInt();
        fnal=(tiempo*17)+150000;
        System.out.println("Se movio "+fnal+"km");
        sc.close();
    }
}
