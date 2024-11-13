package org.example;

public class JavaIntro_Ej6 {
    public static void main(String[]args){
        int n=4;
        String y=(n%2==0)?"par":"impar";//forma ternaria
        System.out.println(y);

        if(n%2==0){//forma en if
            y="par";
        }
        else{
            y="impar";
        }
        System.out.println(y);
    }
}
