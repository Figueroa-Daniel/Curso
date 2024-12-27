package org.example;

import java.util.Scanner;

public class NombresMail {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String[]nombre = new String[5];
        String[]email = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce tu nombre");
            nombre[i] = tec.nextLine();
            System.out.println("Introduce tu email");
            email[i] = tec.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println("Nombre: "+nombre[i]+" Email: "+email[i]);
        }
        boolean comprobador1=false;
        System.out.println("Introduce el nombre a buscar");
        String buscar = tec.nextLine();
        for(int i=0;i<5;i++){
            if(buscar.equals(nombre[i])){
                System.out.println("Nombre: "+nombre[i]+" Email: "+email[i]);
                comprobador1=true;
            }
        }
        if(comprobador1==false){
            System.out.println("No se ha encontrado el nombre");
        }
        //Mostrar los mail que no tienen el carácter @. Usando charAt
        for (int i = 0; i < 5; i++) {
            boolean comprobador2=false;
            for(int j=0;j<email[i].length();j++){
                if(email[i].charAt(j)=='@'){
                    comprobador2=true;
                    break;
                }
            }
            if(comprobador2==false){
                System.out.println("Email: "+email[i]);
            }
        }
    }
}
