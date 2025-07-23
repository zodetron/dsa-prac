package day7;
import java.util.Arrays;

public class day7d {
    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted arrays
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        // Example 1: True case
        String word1 = "listen";
        String word2 = "silent";
        System.out.println("Are '" + word1 + "' and '" + word2 + "' anagrams? " + isAnagram(word1, word2));

        // Example 2: False case
        String word3 = "hello";
        String word4 = "world";
        System.out.println("Are '" + word3 + "' and '" + word4 + "' anagrams? " + isAnagram(word3, word4));
    }
}
