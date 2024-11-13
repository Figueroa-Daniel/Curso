package org.example;

import java.util.Scanner;

public class JavaIntro_Ej19 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.print("Dime el segundo numero");
        int num2 = sc.nextInt();
        System.out.print("Dime el tercer numero");
        int num3 = sc.nextInt();
        if(num1>num2 && num2>num3){
            System.out.println("El primer numero es el más grande");
        }
        else if(num2>num3){
            System.out.println("El segundo numero es el más grande");
        }
        else {
            System.out.println("El tercer numero es el más grande");
        }

        sc.close();
    }

}
