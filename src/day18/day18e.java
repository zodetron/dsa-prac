package day18;
import java.util.*;

public class day18e {

        public static int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int left = 0, maxLen = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                if (map.containsKey(c)) {
                    left = Math.max(left, map.get(c) + 1);
                }

                map.put(c, right);
                maxLen = Math.max(maxLen, right - left + 1);
            }
            return maxLen;
        }

        public static void main(String[] args) {
            String[] testCases = {"abcabcbb", "bbbbb", "pwwkew", "dvdf"};

            for (String test : testCases) {
                System.out.println("Input: " + test);
                System.out.println("Longest Substring Length: " + lengthOfLongestSubstring(test));
                System.out.println("------");
            }
        }
}
