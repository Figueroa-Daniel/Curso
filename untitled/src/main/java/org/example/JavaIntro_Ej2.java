package org.example;

import java.util.Scanner;

public class JavaIntro_Ej2 {
    public static void main(String []args){
        var sc = new Scanner(System.in);
        double nota1=0,nota2=0,nota3=0;
        for(int i=1;i<=3;i++) {
            System.out.print("Dime la nota del " + i + "º trimestre: ");
            if (i == 1) {
                nota1 = sc.nextDouble();
            } else if(i==2) {
                nota2 = sc.nextDouble();
            }else{
                nota3 = sc.nextDouble();

            }
        }
        double notaMedia=(nota1+nota2+nota3)/3;
        double notaRedondeada = Math.round(notaMedia);
        System.out.println("La nota media sin redondear es:"+notaMedia);
        System.out.println("La nota media redondeada es: "+notaRedondeada);
        String estado = (notaRedondeada>=5)?"APROBADO" : "SUSPENSO";
        System.out.println("El alumno está "+estado);
        sc.close();
    }
}
