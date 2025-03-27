package ejemplo3;

import org.example.*;

public class App {

    public static void main(String[] args) {
        A a = new A("Hello");
        B b = new B(3.14);
        Box<A> boxA = new Box<>(a);
        Box<B> boxB = new Box<>(b);
        Box<?> boxEmpty = Box.EMPTY;
        Box<?>[] array = new Box[]{boxA, boxB, boxEmpty};
        Box<Integer> container = new Box<>(42);
        Box<String> container2 = new Box<>("Hello");
        Box<Double> container3 = new Box<>(3.14);

    }
}
