package quick_sort;

/**
 * Created by gonzalo on 10/6/15.
 */
public class QuickSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if(right <= left) { //1 or 0 elements to sort
            return;
        }
        int i = left;
        int j = right;
        int pivotPosition = (left + right) / 2;
        int pivot; //Pivot

        pivot = array[pivotPosition];

        do {
            while(array[i] < pivot && i < right) {
                i++;
            }
            while(array[j] > pivot && j > left) {
                j--;
            }
            if(i <= j) {
                swap(array, i, j); //All the elements to the left of pivot are less, and to the right greater

                i++;
                j--;
            }
        } while(i <= j);

        sort(array, i, right);
        sort(array, left, j);
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
