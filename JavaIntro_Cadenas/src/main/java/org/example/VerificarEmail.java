package org.example;

import java.util.Scanner;

public class VerificarEmail {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean comprobador1=false,comprobador2=false,comprobador3=true,comprobador4=true;
        int i=0,contador=0;
        System.out.println("Dime el email");
        String email = tec.nextLine();
        for(;i<email.length();i++){
            if(Character.isLetter(email.charAt(i)) || Character.isDigit(i)){
                System.out.print("comprobando-");
            }
            else{
                System.out.println("no es valido");
            }
            if(email.charAt(i)=='@' && i>0){
                comprobador1=true;
                break;
            }
        }
        for(;i<email.length();i++){
            if(Character.isLetter(email.charAt(i)) || Character.isDigit(i)){
                System.out.print("comprobando-");
                contador++;
            }
            else{
                System.out.println("no es valido");
            }
            if(email.charAt(i)=='.'){
                if(contador>2) {
                    comprobador2 = true;
                    break;
                }
                else {
                    comprobador4=false;
                }
            }
        }
        if((email.length()-i) != 3) {
            System.out.println("no es valido");
        }
        else {
            for (; i < email.length(); i++) {
                if (Character.isLetter(email.charAt(i)) || Character.isDigit(i)) {
                    System.out.print("comprobando-");
                } else {
                    System.out.println("no es valido");
                    comprobador3=false;
                }
            }
        }
        System.out.println("-------------");
        if(comprobador1==true && comprobador3==true && comprobador3==true && comprobador4==true){
            System.out.println("El email es valido");
        }
        else {
            System.out.println("No es valido");
        }
    }
}
