package day20;

public class day20b {
        public int characterReplacement(String s, int k) {
            int[] occurance = new int[26];
            int left = 0;
            int ans = 0;
            int maxOccurance = 0;

            for (int right = 0; right < s.length(); right++) {
                maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);

                if (right - left + 1 - maxOccurance > k) {
                    occurance[s.charAt(left) - 'A']--;
                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }

        public static void main(String[] args) {
            day20b sol = new day20b();

            String s1 = "ABAB";
            int k1 = 2;
            System.out.println(sol.characterReplacement(s1, k1)); // 4

            String s2 = "AABABBA";
            int k2 = 1;
            System.out.println(sol.characterReplacement(s2, k2)); // 4
        }
}
