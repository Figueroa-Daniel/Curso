package JavaYaObjetos;

import static JavaYaObjetos.SueldosOperarios.agregarS;

public class Operarios {
    private String nombre;
    private int sueldo;

        public Operarios(String nombre, int sueldo) {
            this.nombre = nombre;
            this.sueldo = sueldo;
            agregarS(sueldo);
        }
        public void imprimir() {
            System.out.println("Nombre del empleado: " + nombre);
            System.out.println("Sueldo del empleado: " + sueldo);
        }
        public String getNombre() {
            return nombre;
        }

        public int getSueldo() {
            return sueldo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setSueldo(int sueldo) {
            this.sueldo = sueldo;
        }

        @Override
        public String toString() {
            return "Operarios{" +
                    "nombre='" + nombre + '\'' +
                    ", sueldo=" + sueldo +
                    '}';
        }
}
