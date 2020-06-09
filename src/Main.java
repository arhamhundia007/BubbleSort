public class Main {

    public static void main(String[] args) {
        int [] array = {7, 2, 9, 5, 0, 1};
        BubbleSort b = new BubbleSort(array);
        b.ascendingSort();
        b.print();
        System.out.println();
        b.descendingSort();
        b.print();
    }
}
