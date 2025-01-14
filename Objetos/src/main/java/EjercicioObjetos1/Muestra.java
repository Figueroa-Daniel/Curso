package EjercicioObjetos1;

import java.util.Arrays;

public class Muestra {
    public static int[] numeros;
    public static int cantidad;
    public static final int DEFAULT_SIZE = 10;
    public Muestra() {
        this.numeros = new int[DEFAULT_SIZE];
        cantidad = 0;
    }
    public Muestra(int tam){
        numeros = new int[tam];
        cantidad = 0;
    }
    public Muestra(int[] array){
        numeros=array.clone();
        cantidad=numeros.length;
    }
    public static void agregar(int valor){
        if(cantidad==numeros.length){
            Agrandar();
        }
        numeros[cantidad]=valor;
        cantidad++;
    }
    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }
    public static int[] getNumeros() {
        return numeros;
    }

    public static int getCantidad() {
        return cantidad;
    }
    private static void Agrandar(){
        int[] copiaNumeros= numeros.clone();
        numeros = Arrays.copyOf(copiaNumeros, copiaNumeros.length + DEFAULT_SIZE);
    }
}
