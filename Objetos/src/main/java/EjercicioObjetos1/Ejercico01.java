package EjercicioObjetos1;

public class Ejercico01 {
    public static void main(String[] args) {
        Muestra primeraMuestra = new Muestra(new int[]{1, 2, 2, 4, 5, 6, 7, 8, 9, 10});
        double media = Estadistica.media(primeraMuestra);
        System.out.println("La media de la primera muestra es: " + media);
        double moda = Estadistica.moda(primeraMuestra);
        System.out.println("La moda de la primera muestra es: " + moda);
    }


}
