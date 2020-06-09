public class BubbleSort {
    int [] array;

    public BubbleSort(int [] arr){
        this.array = arr;
    }

    public void ascendingSort(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[ j + 1]){
                    swap(j, j+1);
                }
            }
        }
    }

    public void descendingSort(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] < array[j + 1]){
                    swap(j, j + 1);
                }
            }
        }
    }


    public void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
