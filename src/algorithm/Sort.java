package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

    public int[] selectionSort(int[] array) {
        int[] list = array.clone();
        //we need to this because array is passed by reference and thus after the first run our array is sorted and other sort functions have incorect base time
        final long startTime = System.currentTimeMillis();

        SelectionSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        InsertionSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        BubbleSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        MergeSort.sort(list, 0, list.length - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        QuickSort.sort(list, 0, list.length-1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }





    public int[] heapSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        HeapSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] bucketSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        BucketSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] shellSort(int[] array) {
        int[] list = array.clone();
        final long startTime = System.currentTimeMillis();

        ShellSort.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
