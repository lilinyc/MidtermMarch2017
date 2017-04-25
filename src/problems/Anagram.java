package problems;

import java.util.HashMap;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    public static HashMap<Character, Integer> indexString(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }

        return hashMap;
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();
        }

        HashMap<Character, Integer> hashMapA = indexString(a);
        HashMap<Character, Integer> hashMapB = indexString(b);

        if (hashMapA.size() != hashMapB.size()) {
            return false;
        }
        for (Character c : hashMapA.keySet()) {
            if (!hashMapB.containsKey(c)) {
                return false;
            }

            if (hashMapA.get(c) != hashMapB.get(c)) {
                return false;
            }
        }
        return true;
    }


    private static void checkIfStringsAreAnagram(String a, String b) {
        System.out.println("The strings '" + a + "' and '" + b + "' " + (isAnagram(a, b) ? "are anagrams" : "are not anagrams"));
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        checkIfStringsAreAnagram("cat", "act");
        checkIfStringsAreAnagram("cat", "ACT");
        checkIfStringsAreAnagram("ARMY", "MARY");
        checkIfStringsAreAnagram("BANANA", "ANANAB");

        checkIfStringsAreAnagram("ARMU", "MARY");
        checkIfStringsAreAnagram("ARMY1", "MARY");
        checkIfStringsAreAnagram("AAAA", "MARY");
    }

}
