package problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
    static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> results = new HashMap<String, Integer>();
        String spaceSeparated = input.toLowerCase().replaceAll("\\.", " ").replaceAll(",", " ");
        String[] words = spaceSeparated.split(" ");
        for (String word : words) {
            if (word.length() > 0) {
                if (results.containsKey(word)) {
                    results.put(word, results.get(word) + 1);
                } else {
                    results.put(word, 1);
                }
            }
        }
        return results;
    }

    static void findDuplicates(HashMap<String, Integer> hashMap) {
        System.out.println("Finding Duplicates...");
        boolean duplicatesFound = false;
        for (String word : hashMap.keySet()) {
            Integer wordCount = hashMap.get(word);
            if (wordCount > 1) {
                duplicatesFound = true;
                System.out.println(word + ":" + wordCount);
            }
        }

        if (!duplicatesFound) {
            System.out.println("No duplicates found.");
        }
    }

    static void calculateAverage(HashMap<String, Integer> hashMap) {
        System.out.println("Calculating Average...");
        int numberOfWords = 0;
        int letterCount = 0;

        int totalNumberOfWords = 0;
        int totalLetterCount = 0;

        for (String word : hashMap.keySet()) {
            numberOfWords++;
            letterCount += word.length();

            totalNumberOfWords += hashMap.get(word);
            totalLetterCount += hashMap.get(word) * word.length();
        }

        System.out.println("Unique number Of words:" + numberOfWords);
        System.out.println("Average word length:" + (double) letterCount / (double) numberOfWords);

        System.out.println("Total number Of words:" + totalNumberOfWords);
        System.out.println("Weighted average word length:" + (double) totalLetterCount / (double) totalNumberOfWords);
    }


    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        System.out.println("Analyzing string: " + st);
        HashMap<String, Integer> hashMap = countWords(st);
        findDuplicates(hashMap);
        calculateAverage(hashMap);

        st = "Java is a programming Language.";
        System.out.println("\nAnalyzing string: " + st);
        hashMap = countWords(st);
        findDuplicates(hashMap);
        calculateAverage(hashMap);
    }

}
