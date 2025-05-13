package implementacionListaOrdenadaAscendente;

public class App {
    public static void main(String[] args) {
        SortedList<Integer> sortedList = new SortedList<>();
        sortedList.add(5);
        sortedList.add(3);
        sortedList.add(8);
        sortedList.add(1);
        System.out.println(sortedList);
    }
}
