package ImplementacionClaseVector;

public class Vector<T> {
    private T [] array;
    private int size;
    public Vector(){
        this(10);
    }
    public Vector (int capacidad){
        if(capacidad>0){
            capacidad=10;
        }
        array = (T[]) new Object[capacidad];
        size = 0;
    }
    public void add(T element){
        if(size == array.length){
            incrementCapacity();
        }
        array[size] = element;
        size++;
    }
    private void incrementCapacity(){
        int newCapacity = array.length*2;
        array = java.util.Arrays.copyOf(array, newCapacity);
    }
    public void remove(int posicion){
        if (posicion >= 0 && posicion < size){
            for (int i = posicion; i < size-1; i++){
                array[i] = array[i+1];
            }
            array[size-1] = null;
            size--;
        }
    }
    public T get(int posicion){
        if (posicion >= 0 && posicion < size){
            return array[posicion];
        }
        return null;
    }
    public int size(){
        return size;
    }
}
