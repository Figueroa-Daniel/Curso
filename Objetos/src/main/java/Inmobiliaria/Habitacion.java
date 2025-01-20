package Inmobiliaria;

import java.util.Objects;

public class Habitacion{
    public String uso;
    public double superficie;
    public int numVentanas;

    public Habitacion() {
    }

    public Habitacion(String uso, double superficie, int numVentanas) {
        super();
        this.uso = uso;
        this.superficie = superficie;
        this.numVentanas = numVentanas;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "uso='" + uso + '\'' +
                ", superficie=" + superficie +
                ", numVentanas=" + numVentanas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Double.compare(superficie, that.superficie) == 0 && numVentanas == that.numVentanas && Objects.equals(uso, that.uso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uso, superficie, numVentanas);
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }
}
