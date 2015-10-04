package binary_heap;

/**
 * Created by gonzalo on 10/4/15.
 */
public class Main {
    public static void main(String[] args) {
        HeapMax heap = new HeapMax(5);

        heap.insert(2);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(10);

        heap.print();

        heap.delete();
        heap.delete();

        heap.print();
    }
}
