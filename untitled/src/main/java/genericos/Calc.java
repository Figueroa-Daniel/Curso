package genericos;

public class Calc{
    public static <T extends Number> double suma(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <T> String concatenar(T a,T b){
        return a+"" + "" +b;
    }
    public static <T> String[] concatenarArrays(T[]a,T[]b){
        String nuevoArray[] =new String[a.length+b.length];
        for(int i=0;i<a.length;i++){
            nuevoArray[i]= ""+ a[i];
        }
        int j=a.length;
        for(int i=0;i<b.length;i++){
            nuevoArray[j]=""+ b[i];
            j++;
        }
        return nuevoArray;
    }
}
