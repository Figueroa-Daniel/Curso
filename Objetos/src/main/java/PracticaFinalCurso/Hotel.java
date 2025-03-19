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
        reserva[cantidadReservas++] = r;
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
    public boolean isHabitacionDisponible(int numero, LocalDate fecha, int numDias){
        boolean disponible = true;
        int i = 0;
        while(i<cantidadReservas && disponible){
            Reserva r = reserva[i];
            if(r.getHabitacion().getNumero()==numero) {
                disponible = !UtilFechas.overlaps(r.getFechaInicio(), r.getFechaFin(), fecha, fecha.plusDays(numDias));
            }
            i++;
        }
        return disponible;
    }
    public Habitacion[] getHabitacionesDisponibles(String tipo, LocalDate fecha, int numDias){
        Habitacion[] habitacionesDisponibles = new Habitacion[10];
        int j = 0;
        for(Habitacion h : habitaciones){
            if(this.isHabitacionDisponible( h.getNumero(), fecha, numDias)){
                if (tipo.toUpperCase()=="DOBLE" && h instanceof HabitacionDoble){
                    habitacionesDisponibles[j++] = h;
                }else if(tipo.toUpperCase()=="SUITE" && h instanceof Suite){
                    habitacionesDisponibles[j++] = h;

                }

            }
        }
        return Arrays.copyOf(habitacionesDisponibles,j);

    }
    public Habitacion[] getHabitaciones() {
        return habitaciones.clone();
    }
    public void mostrarHabitaciones(){
        System.out.println("HABITACIONES");
        for (Habitacion h: habitaciones) {
            String tipo = h instanceof HabitacionDoble ? "Doble" : "Suite";
            System.out.println("Numero: "+h.getNumero());
            System.out.println("Tipo: "+tipo);
            System.out.println("Precio: "+h.getPrecio());
            System.out.println("Descripcion: "+h.getDescripcion());
            if(h instanceof Suite){
                Suite s = (Suite) h;
                System.out.println("Nombre: "+s.getNombre());
                System.out.println("Numero de plazas: "+s.getNumeroDePlazas());
                System.out.println("Servicios extra: "+s.getServiciosExtra());
            }
            System.out.println("_________________________");
            String disponibilidad= (this.isHabitacionDisponible(h.getNumero(), LocalDate.now(), 1)) ? "Disponible" : "No disponible";
            System.out.println("Disponibilidad: "+disponibilidad);

        }
    }
    public Reserva agregarReserva(Cliente cliente, Huesped[] huespeds, LocalDate fechaInicio, int numDias, String tipoHabitacion) {
        Habitacion[] disponibles =getHabitacionesDisponibles(tipoHabitacion, fechaInicio, numDias);
        Reserva r = null;
        if(disponibles.length>0){
             if (tipoHabitacion.toUpperCase().equals("DOBLE")) {
                 if (huespeds.length > 1) {
                     System.out.println("No se pueden alojar más de 2 personas en una habitación doble");
                     return r;
                 } else {
                     r = agregarReserva(cliente, huespeds, fechaInicio, numDias, disponibles[0]);
                 }
             }else{
                 for(int i=0;i<disponibles.length && r==null;i++){
                     Suite s = (Suite) disponibles[i];
                     if(s.getNumeroDePlazas()>=huespeds.length){
                         r = agregarReserva(cliente, huespeds, fechaInicio, numDias, disponibles[i]);
                     }
                 }
                 if(r==null){
                     System.out.println("No hay suites disponibles con plazas suficientes");
                 }
             }
        }else {
            System.out.println("No hay habitaciones disponibles");
        }
        return r;
    }
}
