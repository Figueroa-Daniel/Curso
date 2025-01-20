package Inmobiliaria;

import java.util.Arrays;
import java.util.Objects;

public abstract sealed class Vivienda extends Inmueble permits Casa, Apartamento{

    private static final int MIN_ZIZE_HABITACION = 3;
    protected Habitacion[] habitaciones;
    protected int numHabitaciones;
    protected int numBanos;

    public Vivienda(int identificador, String direccion, double precio, double superficie, Habitacion[] habitaciones, int numHabitaciones, int numBanos) {
        super(identificador, direccion, precio, superficie);
        this.habitaciones = habitaciones;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public Vivienda() {
        super();
        habitaciones = new Habitacion[MIN_ZIZE_HABITACION];
        numHabitaciones = 0;
    }
    public Habitacion[] getHabitaciones() {
        return habitaciones.clone();
    }
    public void addHabitacion(Habitacion h){
        if(numHabitaciones == habitaciones.length){
            habitaciones= Arrays.copyOf(habitaciones,habitaciones.length+1);

        }
        habitaciones[numHabitaciones++] = h;
    }
    public void removeHabitacion(int index){
        if(index>=0 && index<numHabitaciones){
            habitaciones[index] = null;
            for (int i = index; i < numHabitaciones-1; i++) {
                habitaciones[i] = habitaciones[i+1];
            }
            numHabitaciones--;
        }
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vivienda vivienda = (Vivienda) o;
        return numHabitaciones == vivienda.numHabitaciones && numBanos == vivienda.numBanos && Objects.deepEquals(habitaciones, vivienda.habitaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(habitaciones), numHabitaciones, numBanos);
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "habitaciones=" + Arrays.toString(habitaciones) +
                ", numHabitaciones=" + numHabitaciones +
                ", numBanos=" + numBanos +
                '}';
    }
}
