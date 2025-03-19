package PracticaFinalCurso;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Reserva implements Cobrable{
    private LocalDate fechaInicio;
    private int numDias;
    private Cliente cliente;
    private Huesped[] huesped;
    private Habitacion habitacion;

    public Reserva(LocalDate fechaInicio, int numDias, Cliente cliente, Huesped[] huesped, Habitacion habitacion) {
        this.fechaInicio = fechaInicio;
        this.numDias = numDias;
        this.cliente = cliente;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin(){
        return fechaInicio.plusDays(numDias);
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Huesped[] getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped[] huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return numDias == reserva.numDias && Objects.equals(fechaInicio, reserva.fechaInicio) && Objects.equals(cliente, reserva.cliente) && Objects.deepEquals(huesped, reserva.huesped) && Objects.equals(habitacion, reserva.habitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, numDias, cliente, Arrays.hashCode(huesped), habitacion);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaInicio=" + fechaInicio +
                ", numDias=" + numDias +
                ", cliente=" + cliente +
                ", huesped=" + Arrays.toString(huesped) +
                ", habitacion=" + habitacion +
                '}';
    }

    @Override
    public double getImporte() {
        return habitacion.getPrecio()*numDias;
    }
}
