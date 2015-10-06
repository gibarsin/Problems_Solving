package merge_sort;

/**
 * Created by gonzalo on 10/6/15.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 6;
        array[1] = 2;
        array[2] = 1;
        array[3] = 10;
        array[4] = 7;

        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        MergeSort.sort(array);

        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
