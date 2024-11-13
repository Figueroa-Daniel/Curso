package org.example;

public class JavaIntro_Ej20 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int x=0;x<n-i;x++){
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++){
                System.out.print("* ");
            }
            System.out.print("\n");

        }

    }

}
