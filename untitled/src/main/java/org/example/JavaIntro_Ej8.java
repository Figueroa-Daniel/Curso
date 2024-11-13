package org.example;

import java.util.Scanner;

public class JavaIntro_Ej8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n1,n2,n3,media;
        System.out.println("Dime el primer numero");
        n1= sc.nextDouble();
        System.out.println("Dime el segundo numero");
        n2= sc.nextDouble();
        System.out.println("Dime el segundo numero");
        n3= sc.nextDouble();
        media=(n1+n2+n3)/3;
        System.out.println("La media es "+media);
        sc.close();
    }
}
