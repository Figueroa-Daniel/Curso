package org.example;

import java.util.Scanner;

public class JavaIntro_Ej18 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Dime el anio y te diré si es bisiesto: ");
        int anio = sc.nextInt();
        if(anio%4==0 && anio%100!=0 || anio%400==0){
            System.out.println("El año es bisiesto");
        }
        else System.out.println("El año no es bisiestor");
        sc.close();
    }
}