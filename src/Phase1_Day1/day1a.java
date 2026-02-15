package Phase1_Day1;
// two pointer q1
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // psvm for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println(sol.isPalindrome(test1)); // expected: true
        System.out.println(sol.isPalindrome(test2)); // expected: false
    }
}
