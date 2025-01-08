package org.example;

import java.util.Scanner;

public class ObjetosCurso {
    private String nombre;
    private int edad;
    private double altura;
    private Scanner tec;

    public ObjetosCurso(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;

    }
    public void crecer(){
        tec = new Scanner(System.in);
        System.out.println("Cuanto ha crecido %s".formatted(nombre));
        double crecimiento = tec.nextDouble();
        altura = altura + crecimiento;
    }
    public void mayorAltura() {
        if (altura > 1.70) {
            System.out.println("La persona %s es alta".formatted(nombre));
        } else {
            System.out.println("La persona %s no es alta".formatted(nombre));
        }
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: %s".formatted(nombre));
        System.out.println("Edad: %d".formatted(edad));
        System.out.println("Altura: %.2f".formatted(altura));
    }

    @Override
    public String toString() {
        return "ObjetosCurso{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", tec=" + tec +
                '}';
    }
}
