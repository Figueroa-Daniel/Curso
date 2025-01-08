package org.example;

public class ObjetosArrayAlumnos {
    public static void main(String[] args) {
        var alumnos = new MayorEdad[5];
        alumnos[0] = new MayorEdad("Juan", 25, 1.75);
        alumnos[1] = new MayorEdad("Maria", 30, 1.80);
        alumnos[2] = new MayorEdad("Pedro", 20, 1.70);
        alumnos[3] = new MayorEdad("Ana", 35, 1.60);
        alumnos[4] = new MayorEdad("Luis", 40, 1.90);
        int posicionMasJoven = 0;
        for (int i = 1; i < alumnos.length; i++){
            /*
            MayorEdad a1 = alumnos[posicionMasJoven];
            MayorEdad a2 = alumnos[i];
            if (a2.getEdad() < a1.getEdad()){
                posicionMasJoven = i;
            }
            *)
             */
            if (alumnos[i].getEdad() < alumnos[posicionMasJoven].getEdad()){
                posicionMasJoven = i;
        }
        MayorEdad masJoven = alumnos[posicionMasJoven];
        System.out.println("El alumno mas joven es: " + masJoven.getNombre()+ " con " + masJoven.getEdad() + " años");
    }

}
