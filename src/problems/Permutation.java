package problems;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    public static LinkedList<String> getPermutations(String input) {
        LinkedList<String> result = new LinkedList<String>();
        if (input.length() <= 1) {
            result.add(input);
        } else {
            for (Character c: input.toCharArray()) {
                LinkedList<String> tempResults = getPermutations(input.replaceFirst(c.toString(), ""));
                for (String tempResult : tempResults) {
                    result.add(c + tempResult);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        LinkedList<String> result = getPermutations("ABC");
        System.out.println("The string representation of array is:");
        System.out.println(result.toString());
    }
}