package org.example;

import java.util.Scanner;

public class MayusRevertido {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String resp2="";
        System.out.println("Dime una cadena de caracteres ");
        String resp=tec.nextLine();
        resp=resp.toUpperCase();
        System.out.println(resp);
        for(int i=resp.length()-1;i>=0;i--){
            resp2=resp2+resp.charAt(i);
        }
        System.out.println(resp2);
    }
}