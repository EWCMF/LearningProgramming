package ProgrammingExercise18;

import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        String word1 = "Tommy";
        String word2 = "omyTm";
        String word3 = "test";
        String word4 = "fail";
        isAnagram(word1, word2);
        isAnagram(word3, word4);
    }

    private static List<String> anagramRecursive(String word) {
        List<String> result = new LinkedList<>();

        if (word.isEmpty()) {
            result.add("");
        } else {
            for (char c : word.toCharArray()) {
                String without = word.replaceFirst(String.valueOf(c), "");
                for (String item : anagramRecursive(without)) {
                    result.add(c + item);
                }
            }
        }
        return result;
    }

    private static void isAnagram(String word1, String word2) {
        List<String> anagrams = anagramRecursive(word1);
        if (anagrams.contains(word2)) {
            System.out.println(word2 + " is an anagram of " + word1);
        } else {
            System.out.println(word2 + " is not an anagram of " + word1);
        }
    }
}
