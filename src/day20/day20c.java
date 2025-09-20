package day20;
import java.util.*;

public class day20c {

        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] s1Map = new int[26];
            int[] s2Map = new int[26];

            // Initialize freq maps for s1 and the first window of s2
            for (int i = 0; i < s1.length(); i++) {
                s1Map[s1.charAt(i) - 'a']++;
                s2Map[s2.charAt(i) - 'a']++;
            }

            // Slide the window through s2 and compare the maps
            for (int i = 0; i < s2.length() - s1.length(); i++) {
                if (matches(s1Map, s2Map)) {
                    return true;
                }
                s2Map[s2.charAt(i + s1.length()) - 'a']++; // add new char
                s2Map[s2.charAt(i) - 'a']--;               // remove old char
            }

            // Check the last window
            return matches(s1Map, s2Map);
        }

        // Helper function to compare two freq maps
        private boolean matches(int[] s1Map, int[] s2Map) {
            for (int i = 0; i < 26; i++) {
                if (s1Map[i] != s2Map[i]) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        day20c sol = new day20c();

        // Test cases
        System.out.println(sol.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(sol.checkInclusion("ab", "eidboaoo")); // false
        System.out.println(sol.checkInclusion("adc", "dcda"));    // true
    }
}
