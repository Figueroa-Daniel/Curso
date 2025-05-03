package carritoCompra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        CarritoCompra carrito = new CarritoCompra();

        Producto p1 = new Producto("Cerveza", 1.5);
        Producto p2 = new Producto("Vino", 2.5);
        Producto p3 = new Producto("Agua", 0.5);
        Producto p4 = new Producto("Refresco", 1.0);
        Producto p5 = new Producto("Zumo", 1.2);
        Producto p6 = new Producto("Leche", 0.8);
        Producto p7 = new Producto("Pan", 0.6);
        Producto p8 = new Producto("Carne", 5.0);
        Producto p9 = new Producto("Pescado", 4.0);
        Producto p10 = new Producto("Verdura", 2.0);
        Producto p11 = new Producto("Fruta", 1.5);
        Producto p12 = new Producto("Arroz", 1.0);
        Collections.addAll(listaProductos, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
        carrito.add(p1);
        carrito.add(p2);
        carrito.add(p2);

        Map<Producto, Integer> productosEnCarrito = carrito.get();

        for(Producto p: productosEnCarrito.keySet()){
            System.out.println(p.getNombre() + " " + p.getPrecio() + " " + productosEnCarrito.get(p));
        }
        System.out.println("Total: " + carrito.total());

    }
}
