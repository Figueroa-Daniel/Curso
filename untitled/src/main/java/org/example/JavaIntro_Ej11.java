package org.example;

import java.util.Scanner;

public class JavaIntro_Ej11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int digitos=0;
        System.out.println("Dime un numero y contaré los digitos que tiene");
        int num= sc.nextInt();
        do{
            num=num/10;
            digitos = digitos +1;
        }
        while(num!=0);
        System.out.println("El numero de digitos es "+digitos);
        sc.close();
    }
}
