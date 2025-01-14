package org.example;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private int matricula;
    public Coche(String marca, String modelo, int anio, int matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.matricula = matricula;
    }
    public void arrancar(){
        System.out.println("El coche %s %s %d %d ha arrancado".formatted(marca, modelo, anio, matricula));
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
