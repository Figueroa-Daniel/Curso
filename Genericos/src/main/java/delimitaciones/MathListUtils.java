package delimitaciones;

import java.util.List;

public class MathListUtils<T extends Number> {
    public double suma(List<T> lista){
        double suma = 0;
        for (T elemento : lista) {
            suma += elemento.doubleValue();
        }
        return suma;
    }
}
