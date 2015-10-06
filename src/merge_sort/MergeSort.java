package merge_sort;

/**
 * Created by gonzalo on 10/6/15.
 */
public class MergeSort {
    public static int[] sort(int[] array) {
        if(array.length <= 1) {
            return array;
        }

        int middle = array.length / 2;
        int[] first = new int[middle];
        int[] second = new int[array.length - first.length];

        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);

        sort(first);
        sort(second);

        merge(first, second, array);

        return array;
    }

    private static void merge(int[] first, int[] second, int[] array) {
        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length) {
            int cmp = first[i] - second[j];

            if(cmp < 0) {
                array[k++] = first[i++];
            } else {
                array[k++] = second[j++];
                if(cmp == 0) {
                    i++;
                }
            }
        }
        while(i < first.length) {
            array[k++] = first[i++];
        }
        while(j < second.length) {
            array[k++] = second[j++];
        }
    }
}
