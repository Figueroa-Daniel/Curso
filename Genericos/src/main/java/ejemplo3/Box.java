package ejemplo3;

public class Box<T> {
    public static final Box<?> EMPTY;
    private T value;
    private boolean empty;
    static {
        EMPTY = new Box<>(true);
    }
    private Box (boolean empty) {
        this.empty = empty;
    }
    public Box(T value) {
        this.value = value;
        if(this.value!=null) {
            this.empty = false;
        }else {
            this.empty = true;
        }
    }
    public T getValue() {
        return value;
    }
    public boolean isEmpty() {
        return empty;
    }
}
