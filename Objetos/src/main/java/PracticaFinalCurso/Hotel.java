package PracticaFinalCurso;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Hotel {
    private Habitacion[] habitaciones;
    private Reserva[] reserva;
    private int cantidadReservas;
    public Hotel(){
        habitaciones=new Habitacion[10];
        reserva = new Reserva[100];
        cantidadReservas=0;
        init();
    }
    private void init(){
        //habitaciones dobles
        for(int i=0;i<habitaciones.length;i++){
            int numero = i+1;
            String descripcion = "Habitacion doble estandar";
            habitaciones[i] = new HabitacionDoble(numero, Precios.PRECIO_DOBLE, descripcion);
        }
        //suites
        String [] nombreSuites = {"presidencial", "junior"};
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int numero = i + 11;
            String descripcion = "Suite de lujo";
            String nombre = "Suite " + nombreSuites[i];
            int numeroDePlazas = random.nextInt(3) + 3;
            String serviciosExtra = "Servicio minibar,Acceso a piscina";
            habitaciones[i + 10] = new Suite(numero, Precios.PRECIO_SUITE, descripcion, nombre, numeroDePlazas, serviciosExtra);
        }
    }
    public Reserva agregarReserva(Cliente cliente, Huesped[] huespeds, LocalDate fechaInicio,int numDias, Habitacion habitacion){
        if(cantidadReservas>=reserva.length){
            reserva = Arrays.copyOf(reserva,reserva.length+10);
        }
        Reserva r = new Reserva(fechaInicio,numDias,cliente,huespeds,habitacion);
        reservas[cantidadReservas++] = r;
        return r;
    }
    public void mostrarReservas(){
        for (int i = 0; i < cantidadReservas; i++) {
            Reserva r= reserva[i];
            System.out.println("RESERVA");
            System.out.println("Fecha de inicio: "+r.getFechaInicio());
            System.out.println("Fecha de fin: "+r.getFechaFin());
            System.out.println("Cliente: "+r.getCliente().getNombre());
            System.out.println("Huespedes: ");
            for (Huesped h: r.getHuesped()) {
                System.out.println(h.getNombre());
            }
            System.out.println("Habitacion: "+r.getHabitacion().getNumero());
            System.out.println("Numero de dias: "+r.getNumDias());
            System.out.println("_________________________");
        }
    }
}
