package algorithm;

/**
 * Created by Lili on 4/24/2017.
 */
public class QuickSort {
    public static void sort(int[] array, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = array[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j)
            sort(array,low, j);
        if (i < high)
            sort(array,i, high);
    }

}
