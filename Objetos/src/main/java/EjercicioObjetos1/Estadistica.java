package EjercicioObjetos1;

public class Estadistica {
    public static double media(Muestra muestra){
        double suma = 0;
        for (int i = 0; i < muestra.getCantidad(); i++) {
            suma += muestra.getNumeros()[i];
        }
        return suma/muestra.getCantidad();
    }
    public static double media(int[] numeros){
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma/numeros.length;
    }
    public static int moda(Muestra muestra){
        int moda=0;
        int repeticiones=0;
        int n=muestra.getCantidad();
        int[] numeros=muestra.getNumeros();
        for(int i=0;i<n;i++){
            int veces=0;
            for(int j=0;j<n;j++){
                if(numeros[i]==numeros[j]){
                    veces++;
                }
            }
            if(veces>repeticiones){
                moda=numeros[i];
                repeticiones=veces;
            }
        }
        return moda;
    }
    private static double media(int[] numeros, int cantidad){
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }
        return suma/cantidad;

    }
}
