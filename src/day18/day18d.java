package day18;
import java.util.*;

public class day18d {
        public static int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0, maxLen = 0;

            for (int right = 0; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
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
