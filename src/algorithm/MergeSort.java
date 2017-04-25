package algorithm;

/**
 * Created by Lili on 4/24/2017.
 */
public class MergeSort {
    public static void sort(int array[], int min, int max) {
        // prerequisite
        if (min < max) {
            // get the middle point
            int mid = (int) Math.floor((max + min) / 2);

            // apply merge sort to both parts of this
            sort(array, min, mid);
            sort(array, mid + 1, max);

            // and finally merge all that sorted stuff
            merge(array, min, max, mid);
        }
    }

    private static void merge(int array[], int min, int max, int mid) {
        int firstIndex = min;
        int secondIndex = mid + 1;
        int index = min;
        int[] tempArray = new int[array.length];

        // if there are still objects in both arrays
        while ((firstIndex <= mid) && (secondIndex <= max)) {
            if (array[firstIndex] < array[secondIndex]) {
                tempArray[index] = array[firstIndex];
                index++;
                firstIndex++;
            } else {
                tempArray[index] = array[secondIndex];
                index++;
                secondIndex++;
            }
        }

        // terminates the object of the lower array
        while (firstIndex <= mid) {
            tempArray[index] = array[firstIndex];
            index++;
            firstIndex++;
        }

        // terminates the object of the upper array
        while (secondIndex <= max) {
            tempArray[index] = array[secondIndex];
            index++;
            secondIndex++;
        }

        // transfer to the initial array
        for (int i = min; i < index; i++)
            array[i] = tempArray[i];
    }
}
