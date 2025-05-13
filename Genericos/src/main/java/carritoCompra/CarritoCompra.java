package carritoCompra;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarritoCompra {
    private Map<Producto, Integer> carrito;
    public CarritoCompra(){
        carrito = new LinkedHashMap<>();
    }
    public int add(Producto p){
        int unidades = 1;
        if (carrito.containsKey(p)){
            unidades = carrito.get(p) + 1;
        }
        carrito.put(p, unidades);
        return unidades;
    }
    public void remove(Producto p){
        carrito.remove(p);
    }
    public void clear(){
        carrito.clear();
    }
    public double total(){
        double resultado = 0.0;
        for(Producto p: carrito.keySet()){
            resultado += p.getPrecio() * carrito.get(p);
        }
        return resultado;
    }
    public Map<Producto, Integer> get (){
        return Collections.unmodifiableMap(carrito);
    }
}
