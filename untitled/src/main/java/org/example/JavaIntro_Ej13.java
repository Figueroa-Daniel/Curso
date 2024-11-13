package org.example;

import java.util.Scanner;

public class JavaIntro_Ej13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la nota");
        int n= sc.nextInt();
        String notaliteral = switch (n){
            case 10,9 -> "Sobresaliente";
            case 8,7 -> "Notable";
            case 6 -> "Bien";
            case 5 -> "Suficiente";
            case 4,3,2,1,0 -> "Suspenso";
            default -> "Respuesta invalida";
        };
        System.out.println("la nota es "+notaliteral);
        sc.close();
    }
}
