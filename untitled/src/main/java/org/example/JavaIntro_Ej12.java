package org.example;

import java.util.Scanner;

public class JavaIntro_Ej12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int suma=0;
        System.out.println("Dime el numero n");
        int n= sc.nextInt();
        for(int i=0;i<=n;n--){
            suma=suma+n;
        }
        System.out.println("la suma de los numeros hasta n es "+suma);
        sc.close();
    }
}
