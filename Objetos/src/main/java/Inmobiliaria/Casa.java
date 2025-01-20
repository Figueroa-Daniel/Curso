package Inmobiliaria;

import java.util.Arrays;
import java.util.Objects;

public final class Casa extends Vivienda{
    public int numPlantas;
    public Casa(){
        super();
    }

    public Casa(int identificador, String direccion, double precio, double superficie, Habitacion[] habitaciones, int numHabitaciones, int numBanos, int numPlantas) {
        super(identificador, direccion, precio, superficie, habitaciones, numHabitaciones, numBanos);
        this.numPlantas = numPlantas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Casa casa = (Casa) o;
        return numPlantas == casa.numPlantas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPlantas);
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numPlantas=" + numPlantas +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", numHabitaciones=" + numHabitaciones +
                ", numBanos=" + numBanos +
                '}';
    }
}
