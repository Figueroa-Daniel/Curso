package org.example;

import java.util.Scanner;

public class JavaIntro_EJ14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int resultado=0;
        System.out.println("Dime un numero entre 1 y el 10");
        int n= sc.nextInt();
        for (int i=0;i<=10;i++){
            resultado=n*i;
            System.out.println(n+"x"+i+"="+resultado);
        }
        sc.close();
    }
}
