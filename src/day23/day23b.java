package day23;
import java.util.Arrays;
//leetcode 242

public class day23b {

        public boolean isAnagram(String s, String t) {
            char[]sa=s.toCharArray();
            char[]ta=t.toCharArray();

            Arrays.sort(sa);
            Arrays.sort(ta);

            // Compare sorted arrays
            return Arrays.equals(sa, ta);
        }

        // main to run tests while you develop
        public static void main(String[] args) {
            day23b sol = new day23b();

            String[][] tests = {
                    {"anagram", "nagaram"}, // expected: true
                    {"rat", "car"},         // expected: false
                    {"aacc", "ccac"},       // expected: false
                    {"", ""},               // expected: true
                    {"abc", "bac"}          // expected: true
            };

            for (String[] tc : tests) {
                String s = tc[0], t = tc[1];
                boolean res = sol.isAnagram(s, t);
                System.out.printf("isAnagram(\"%s\", \"%s\") = %b%n", s, t, res);
            }
        }
}
