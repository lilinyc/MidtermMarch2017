package math;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    /**
     * Finds missing number in a array from max n, using hashmap
     *
     * @param n max length
     * @param array array with 1 missing numbers
     */
    private static int findMissingNumberUsingHashMap(int n, int[] array) {
        //index all the numbers from the array into a hashmap
        //for loop for all the items in array
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

        for (int element : array) {
            hashMap.put(element, true);
        }

        //iterate from 1 to n to find the missing number in the hashmap
        int missingNumber = 0;
        for (int i = 1; i <= n; i++) {
            if (!hashMap.containsKey(i)) {
                missingNumber = i;
            }
        }

        return missingNumber;
    }

    /**
     * Implementation of arrayContains algorithm which checks if a element is part of a array
     *
     * @param number element which we are searching for
     * @param array or numbers
     */
    private static boolean arrayContains(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds missing number in a array from max n, using array find method
     *
     * @param n max length
     * @param array array with 1 missing numbers
     */
    private static int findMissingNumberUsingArrayFind(int n, int[] array) {
        int missingNumber = 0;

        //for loop from 1 to n, check if number is part of array
        for (int i = 1; i <= n; i++) {
            if (!arrayContains(i, array)) {
                return i;
            }
        }

        return missingNumber;
    }

    /**
     * Finds multiple missing numbers in a array from max n
     *
     * @param n max length of the array
     * @param array with 0 or more missing numbers
     */
    private static LinkedList<Integer> findMissingNumbers(int n, int[] array) {
        LinkedList<Integer> missingNumbers = new LinkedList<Integer>();

        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

        for (int element : array) {
            hashMap.put(element, true);
        }

        for (int i = 1; i <= n; i++) {
            if (!hashMap.containsKey(i)) {
                missingNumbers.add(i);
            }
        }


        return missingNumbers;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int n = 10;
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


        int missingNumber = findMissingNumberUsingHashMap(n, array);
        System.out.println("The missing number is:" + missingNumber);


        missingNumber = findMissingNumberUsingArrayFind(n, array);
        System.out.println("The missing number is:" + missingNumber);


        List<Integer> missingNumbers = findMissingNumbers(n, new int[]{1,2,3,4,7,8,9});
        System.out.println("The missing number is:" + missingNumbers.toString());
    }
}
