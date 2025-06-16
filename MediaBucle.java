import java.util.Scanner;

public class MediaBucle {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int acumulador=0;
        for(int i=1;i<4;i++){
            System.out.println("Dime el numero "+(i)+"º");
            int numeros = tec.nextInt();
            acumulador=acumulador+numeros;
        }
        System.out.println("La media es "+acumulador/3);

    }
}
