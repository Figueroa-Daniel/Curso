package org.example;

public record Producto(long codigo, String nombre, double precio) {
    public Producto(long codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre.trim().toUpperCase(); //Pasamos todo a mayuscula y quitamos los espacios del inicio y del final
        this.precio=precio;
    }

}
