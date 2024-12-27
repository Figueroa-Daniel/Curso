package org.example;

public class VariosMetodos {
    public static void main(String[] args) {
        String text="holaholahola";
        //Imprimir la primera mitad
        System.out.println(text.substring(0, text.length()/2));
        //Imprimir el ultimo caracter
        System.out.println(text.charAt(text.length()-1));
        //Imprimir en forma inversa
        String text2="";
        for(int i=text.length()-1;i>=0;i--){
            text2=text2+text.charAt(i);
        }
        System.out.println(text2);
        //Cadena con guiones
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.print(c);
            if (i != text.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println("");
        //Numero de vocales
        int vocalesCount = 0;
        for (char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocalesCount++;
                }
            }
        }
        System.out.println("El numero de vocales: "+vocalesCount);
        //Saber si es un anagrama
        String resp2="";
        for(int i=text.length()-1;i>=0;i--){
            resp2=resp2+text.charAt(i);
        }
        if (resp2.equals(text)) {
            System.out.println("Es un anagrama");
        }
        else {
            System.out.println("No es un anagrama");
        }
    }
}
