package Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        LocalDate ayer = hoy.minus(1, ChronoUnit.DAYS);
        System.out.println(ayer);
        LocalDate manana = hoy.plusDays(1);
        System.out.println(manana);
        LocalDate fechaFija = LocalDate.of(2020,07,10);
        System.out.println(fechaFija);
        LocalDate fechaTexto = LocalDate.parse("2020-07-10");
        System.out.println(fechaTexto);
        LocalDate fechaTexto2 = LocalDate.parse("2020/07/10", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(fechaTexto2);
        LocalDate fechaTexto3 = LocalDate.parse("10/07/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fechaTexto3);
        if(hoy.isAfter(ayer)){
            System.out.println("Hoy es después de ayer");
        }

    }
}
