package org.example;

import java.util.Scanner;

public class JavaIntro_Ej7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n1,n2,sum,resta,mult,resto,div;
        System.out.println("Dime el primer numero");
        n1= sc.nextDouble();
        System.out.println("Dime el segundo numero");
        n2= sc.nextDouble();
        sum=n1+n2;
        resta=n1-n2;
        mult=n1*n2;
        div=n1/n2;
        resto=n1%n2;
        System.out.println("la suma es "+sum);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicación es "+mult);
        System.out.println("la division es "+div);
        System.out.println("el resto es "+resto);
        sc.close();
    }
}
