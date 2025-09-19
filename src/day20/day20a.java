package day20;
import java.util.HashSet;

public class day20a {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) return 0;
            if (s.length() == 1) return 1;

            int left = 0, right = 0, ans = 0;
            HashSet<Character> set = new HashSet<>();

            while (right < s.length()) {
                char c = s.charAt(right);

                // shrink window if duplicate
                while (set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(c);
                ans = Math.max(ans, right - left + 1);
                right++;
            }
            return ans;
        }

        public static void main(String[] args) {
            day20a sol = new day20a();

            String s1 = "abcabcbb";
            String s2 = "bbbbb";
            String s3 = "pwwkew";

            System.out.println(sol.lengthOfLongestSubstring(s1)); // 3
            System.out.println(sol.lengthOfLongestSubstring(s2)); // 1
            System.out.println(sol.lengthOfLongestSubstring(s3)); // 3
        }
}
