package implementacionListaOrdenadaAscendente;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortedList<E extends Comparable<E>> extends AbstractList<E> {

    private final ArrayList<E> internalList;
    public SortedList() {
        this.internalList = new ArrayList<>();
    }

    public SortedList(ArrayList<E> internalList) {
        this.internalList = new ArrayList<>();
    }
    public SortedList(Collection<? extends E> collection) {
        this.internalList = new ArrayList<>(collection);
        Collections.sort(this.internalList);
    }
    @Override
    public boolean isEmpty() {
        return this.internalList.isEmpty();
    }
    @Override
    public boolean add(E e) {
        //El método binarySearch devuelve el índice donde se debería insertar el elemento para mantener el orden
        int index = Collections.binarySearch(this.internalList, e);
        if (index < 0) {
            index = -(index + 1); // Esto es porque el índice devuelto por binarySearch es negativo si no se encuentra el elemento
        }
        this.internalList.add(index, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return this.internalList.remove(o);
    }
    @Override
    public void clear() {
        this.internalList.clear();
    }

    @Override
    public int size() {
        return this.internalList.size();
    }
    @Override
    public E get(int index) {
        return this.internalList.get(index);
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            modified = add(e) || modified;
        }
        return modified;
    }
}
