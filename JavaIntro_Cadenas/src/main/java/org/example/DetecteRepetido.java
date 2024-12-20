package org.example;

public class DetecteRepetido {
    public static void main(String[] args) {
        String text="lpi gaouh dfl";
        char result = 0;
        boolean comp=false;
        for(int i=0;i<text.length();i++){
            for(int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    result=text.charAt(i);
                        if(text.charAt(i)==' ') {
                            continue;
                        }
                    comp=true;
                        break;
                }
            }
            if(comp==true){
                break;
            }
        }
        if(comp==true) {
            System.out.println("El primer caracter repetido es " + result);
        }
        else {
            System.out.println("No se repite ningun caracter");
        }
    }
}

