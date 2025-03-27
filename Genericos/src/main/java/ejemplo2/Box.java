package ejemplo2;

public class Box {
    private Object value;
    private boolean empty;
    public static final Box EMPTY;

    static {
        EMPTY = new Box(true);
    }
    private Box(boolean empty) {
        this.empty = empty;
    }
    public Box(Object value) {
        this.value = value;
        if(this.value!=null) {
            this.empty = false;
        }else {
            this.empty = true;
        }
    }

    public Object getValue() {
        return value;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setValue(Object value) {
        if(this.value!=null) {
            this.empty = false;
        }else {
            this.empty = true;
        }
    }
}
