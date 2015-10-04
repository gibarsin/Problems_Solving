package binary_heap;

import java.util.NoSuchElementException;

/**
 * Created by gonzalo on 10/4/15.
 * Max heap implemented with a vector
 *
 * Insertion and Deletion are O(log(n))
 */
public class HeapMax implements Heap{
    private int[] heap;
    private int size;
    private static final int SIZE_FACTOR = 2;

    public HeapMax(int size) {
        heap = new int[size];
    }

    public void insert(int elem) {
        if(size == heap.length - 1) {
            enlargeHeap();
        }

        //Up Percolation
        int i = ++size;

        while(i > 1 && elem > heap[i / 2]) {
            heap[i] = heap[i/2];
            i /= 2;
        }

        heap[i] = elem;
    }

    public int delete() {
        if(size == 0) {
            throw new NoSuchElementException();
        }

        int max = heap[1];

        //Down Percolation
        heap[1] = heap[size--];

        percolateDown(1);

        return max;


    }

    private void percolateDown(int pos) {
        int tmp = heap[pos];
        int child;
        boolean finished = false;

        while(!finished && 2 * pos <= size) {
            child = 2 * pos;

            //Get max child
            if (child != size && heap[child] < heap[child + 1]) {
                child++; //Child to the right is bigger
            }

            if(tmp < heap[child]) {
                heap[pos] = heap[child];
                pos = child;
            } else {
                finished = true;
            }
        }
        heap[pos] = tmp;
    }

    private void enlargeHeap() {
        int[] newHeap = new int[heap.length * SIZE_FACTOR];

        System.arraycopy(heap, 1, newHeap, 1, heap.length - 1);

        heap = newHeap;
    }

    public void print() {
        for(int i = 0; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
