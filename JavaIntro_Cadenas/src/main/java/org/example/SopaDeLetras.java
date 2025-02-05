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
        System.out.println("Dime la palabra que encontraste: ");
        String palabra = tec.next().toUpperCase();
        char[] palabraArray = palabra.toCharArray();
        boolean encontrada = false;

        // Etiqueta para salir de todos los bucles
        buscar:
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {

                if (sopaLetras[i][j] == palabraArray[0]) {
                    // Verificar todas las direcciones posibles
                    for (int dir = 0; dir < 8; dir++) {
                        int contadorCoincidencias = 1;
                        int nuevaFila = i;
                        int nuevaCol = j;

                        // Seguir la dirección actual hasta completar la palabra
                        for (int k = 1; k < palabraArray.length; k++) {
                            switch (dir) {
                                case 0: // Izquierda
                                    nuevaCol--;
                                    break;
                                case 1: // Derecha
                                    nuevaCol++;
                                    break;
                                case 2: // Arriba
                                    nuevaFila--;
                                    break;
                                case 3: // Abajo
                                    nuevaFila++;
                                    break;
                                case 4: // Diagonal superior izquierda
                                    nuevaFila--;
                                    nuevaCol--;
                                    break;
                                case 5: // Diagonal superior derecha
                                    nuevaFila--;
                                    nuevaCol++;
                                    break;
                                case 6: // Diagonal inferior izquierda
                                    nuevaFila++;
                                    nuevaCol--;
                                    break;
                                case 7: // Diagonal inferior derecha
                                    nuevaFila++;
                                    nuevaCol++;
                                    break;
                            }

                            // Verificar límites de la matriz
                            if (nuevaFila < 0 || nuevaFila >= sopaLetras.length ||
                                    nuevaCol < 0 || nuevaCol >= sopaLetras[i].length) {
                                break;
                            }

                            // Verificar coincidencia de letra
                            if (sopaLetras[nuevaFila][nuevaCol] == palabraArray[k]) {
                                contadorCoincidencias++;
                            } else {
                                break;
                            }
                        }

                        // Si todas las letras coinciden
                        if (contadorCoincidencias == palabraArray.length) {
                            encontrada = true;
                            System.out.println("¡Palabra encontrada!");
                            System.out.println("Dirección: " + obtenerNombreDireccion(dir));
                            System.out.println("Posición inicial: (" + i + "," + j + ")");
                            break buscar;
                        }
                    }
                }
            }
        }

        if (!encontrada) {
            System.out.println("La palabra no se encontró.");
        }
    }

    private static String obtenerNombreDireccion(int dir) {
        String[] nombres = {
                "izquierda",
                "derecha",
                "arriba",
                "abajo",
                "diagonal superior izquierda",
                "diagonal superior derecha",
                "diagonal inferior izquierda",
                "diagonal inferior derecha"
        };
        return nombres[dir];
    }
}