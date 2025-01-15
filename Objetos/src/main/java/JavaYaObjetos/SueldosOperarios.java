package JavaYaObjetos;

import java.util.Arrays;

public class SueldosOperarios {
    private static int [] sueldos;
    private static int contador;
    static {
        sueldos = new int[5];
        contador = 0;
    }
    public SueldosOperarios(){}
    private static void AgrandarArray(){
        int []aux = Arrays.copyOf(sueldos, sueldos.length+5);
        sueldos = aux;
    }
    public static void agregarS(int valor){
        if(contador==sueldos.length){
            AgrandarArray();
        }
        sueldos[contador]=valor;
        contador++;
    }

    public static void imprimirS(){
        for(int i=0;i<contador;i++){
            System.out.println(sueldos[i]);
        }
    }

    public static int[] getSueldos() {
        return sueldos;
    }

    public static void setSueldos(int[] sueldos) {
        SueldosOperarios.sueldos = sueldos;
    }


}
