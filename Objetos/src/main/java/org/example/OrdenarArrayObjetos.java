package org.example

class OrdenrArrayObjetos {
    private int [] notas = {10,5,3,2,8};
    private String [] nombres = {"Juan", "Pedro", "Maria", "Ana", "Luis"};
    public void ordenar(){
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas.length; j++){
                if(notas[i] < notas[j]){
                    int aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    String aux2 = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = aux2;
                }
            }
        }
    }
    public void imprimir(){
        for(int i = 0; i < notas.length; i++){
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }
    public static void main(String[] args) {
        OrdenrArrayObjetos orden = new OrdenrArrayObjetos();
        orden.ordenar();
        orden.imprimir();
    }


}