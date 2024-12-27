package org.example;

import java.util.Scanner;

public class SolicitarClaves {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String contraseña ="123abc";
        System.out.println("Introduce la contraseña");
        String pass = tec.nextLine();
        if(pass.equals(contraseña)){
            System.out.println("Contraseña correcta");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
    }
}
