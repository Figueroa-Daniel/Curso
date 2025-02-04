package org.example;

import java.util.Scanner;

public class SopaDeLetras {
    public static void main(String[] args) {
        char[][] sopaLetras = {
                {'C', 'A', 'S', 'A', 'T', 'R'},
                {'E', 'L', 'A', 'G', 'O', 'S'},
                {'R', 'I', 'O', 'P', 'E', 'Z'},
                {'T', 'I', 'G', 'R', 'E', 'L'},
                {'A', 'M', 'A', 'R', 'O', 'S'},
                {'S', 'O', 'L', 'U', 'V', 'E'}
        };
        Scanner tec = new Scanner(System.in);
        boolean comprobador=false;
        System.out.println("Dime la palabra que encontraste: ");
        String palabra= tec.next();
        char[] palabraArray = palabra.toCharArray();
        for(int i=0;i< sopaLetras.length;i++){
            for (int j=0;j<sopaLetras[0].length;j++){
                if(palabraArray[0]==sopaLetras[i][j]){
                    int contador=1;
                    while (comprobador==false || contador==palabraArray.length){
                        int matchCase = -1;

                        if (sopaLetras[i][j - 1] == palabraArray[contador]) {
                            matchCase = 0;
                        } else if (sopaLetras[i][j + 1] == palabraArray[contador]) {
                            matchCase = 1;
                        } else if (sopaLetras[i + 1][j] == palabraArray[contador]) {
                            matchCase = 2;
                        } else if (sopaLetras[i - 1][j] == palabraArray[contador]) {
                            matchCase = 3;
                        } else if (sopaLetras[i + 1][j - 1] == palabraArray[contador]) {
                            matchCase = 4;
                        } else if (sopaLetras[i - 1][j - 1] == palabraArray[contador]) {
                            matchCase = 5;
                        } else if (sopaLetras[i - 1][j + 1] == palabraArray[contador]) {
                            matchCase = 6;
                        } else if (sopaLetras[i + 1][j + 1] == palabraArray[contador]) {
                            matchCase = 7;
                        }

                        switch (matchCase) {
                            case 0:
                                System.out.println("Coincidencia en la izquierda");
                                int contador2=1;
                                for(int w=1;w<palabraArray.length;w++){
                                    if(sopaLetras[i][j - 1-w]==palabraArray[1+w]){
                                        contador2++;
                                    }
                                    else {
                                        break;
                                    }
                                    if(contador==palabraArray.length){
                                        comprobador=true;
                                    }
                                }
                                break;
                            case 1:
                                System.out.println("Coincidencia en la derecha");
                                break;
                            case 2:
                                System.out.println("Coincidencia abajo");
                                break;
                            case 3:
                                System.out.println("Coincidencia arriba");
                                break;
                            case 4:
                                System.out.println("Coincidencia diagonal inferior izquierda");
                                break;
                            case 5:
                                System.out.println("Coincidencia diagonal superior izquierda");
                                break;
                            case 6:
                                System.out.println("Coincidencia diagonal superior derecha");
                                break;
                            case 7:
                                System.out.println("Coincidencia diagonal inferior derecha");
                                break;
                            default:
                                System.out.println("No hay coincidencia");
                                break;
                        }
                    }
                }
            }
        }

    }

}
