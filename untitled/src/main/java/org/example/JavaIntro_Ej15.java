package org.example;

import java.util.Scanner;

public class JavaIntro_Ej15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int resto=0,intercambio=0;
        System.out.println("Dime un numero a");
        int a= sc.nextInt();
        System.out.println("Dime un numero b");
        int b= sc.nextInt();
        do{
            if(a!=0 && b!=0){
                a=a%b;
                intercambio=a;
                a=b;
                b=intercambio;

            }
            else{
                if(a==0){
                    a=b;
                }
                break;
            }
        }while (b != 0);
        System.out.println("El m.c.d es "+a);

        sc.close();
    }
}
