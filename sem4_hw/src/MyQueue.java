public class MyQueue {

    private Integer[] array = new Integer[10];

    private int size = 0;

    void enqueue(int item) {
        if (size == array.length) {
            Integer[] arr2 = new Integer[array.length + 10];
            System.arraycopy(array, 0, arr2, 0, array.length);
            array = arr2;
        }
        array[size++] = item;
    }
    int dequeue() {
        int temp = array[0];
        array[0] = null;
        return temp;
    }
    int first() {
        if(array[0] != null)
            return array[0];
        return array[1];
    }
}
