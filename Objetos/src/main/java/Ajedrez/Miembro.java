package Ajedrez;

public abstract class Miembro {
    private String dni;
    private String nombre;
    private String apellidos;

    public Miembro(String dni, String nombre, String apellidos) {
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);

    }
    public abstract String aCadea();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        //castear el dni a int excluyendo la letra con el substring
        char letraValida = 0;
        char letra=dni.charAt(8);
        dni = dni.substring(0, 8);
        int dninumeros = Integer.parseInt(dni);
        if(dninumeros>0 && dninumeros<=99999999){
            int letrap = dninumeros % 23;
            // Hacemos el calculo para descubrir el numero necesario para hacer la conversion.
            switch (letrap) {
                case 0 -> letraValida = 'T';
                case 1 -> letraValida = 'R';
                case 2 -> letraValida = 'W';
                case 3 -> letraValida = 'A';
                case 4 -> letraValida = 'G';
                case 5 -> letraValida = 'M';
                case 6 -> letraValida = 'Y';
                case 7 -> letraValida = 'F';
                case 8 -> letraValida = 'P';
                case 9 -> letraValida = 'D';
                case 10 -> letraValida = 'X';
                case 11 -> letraValida = 'B';
                case 12 -> letraValida = 'N';
                case 13 -> letraValida = 'J';
                case 14 -> letraValida = 'Z';
                case 15 -> letraValida = 'S';
                case 16 -> letraValida = 'Q';
                case 17 -> letraValida = 'V';
                case 18 -> letraValida = 'H';
                case 19 -> letraValida = 'L';
                case 20 -> letraValida = 'C';
                case 21 -> letraValida = 'K';
                case 22 -> letraValida = 'E';
                default -> System.out.println("no es valido");
            }
            if (letra==letraValida){
                this.dni=dni+letra;
            }
            else {
                System.out.println("La letra no es valida");
            }

        }
        else {
            System.out.println("Su numero no es valido");
        }

    }

    public String getNombre() {
        return nombre;
    }
    //No puede tener menos de 2 caracteres
    public void setNombre(String nombre) {
        if (nombre.length()>2) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede tener menos de 2 caracteres");
        }

    }

    public String getApellidos() {
        return apellidos;
    }
    //Tienen que ser dos apellidos y mas de dos caracteres cada uno
    public void setApellidos(String apellidos) {
        String[] apellidosArray = apellidos.split(" ");
        if (apellidosArray.length == 2 && apellidosArray[0].length()>2 && apellidosArray[1].length()>2) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Los apellidos tienen que ser dos y mas de dos caracteres cada uno");
        }
    }
}
