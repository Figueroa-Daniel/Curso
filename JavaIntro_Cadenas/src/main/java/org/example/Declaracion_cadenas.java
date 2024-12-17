package org.example;

public class Declaracion_cadenas {
    public static void main(String[] args) {
        String saludo="Hola";
        System.out.println(saludo);
        //Declaración mutilinea(text blocks)
        String multi= """
                Hola
                    mundo
                """;
        System.out.println(multi);
        //Declarar como constructor de clase string
        String str =new String("Hola mundo");
        //Declarar cadena como Array
        char[] arr={'H','o','l','i'};
        String sal = new String(arr);
    }
}
