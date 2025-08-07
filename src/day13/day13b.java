package day13;

public class day13b {
        public boolean isPalindrome(String s) {
            int l = 0, r = s.length() - 1;

            while (l < r) {
                while (l < r && !alphaNum(s.charAt(l))) {
                    l++;
                }
                while (r > l && !alphaNum(s.charAt(r))) {
                    r--;
                }
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }

        public boolean alphaNum(char c) {
            return (c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9');
        }

        public static void main(String[] args) {
            day13b sol = new day13b();

            // Test cases
            String input1 = "A man, a plan, a canal: Panama";
            String input2 = "race a car";
            String input3 = " ";

            System.out.println("Is palindrome? " + sol.isPalindrome(input1)); // true
            System.out.println("Is palindrome? " + sol.isPalindrome(input2)); // false
            System.out.println("Is palindrome? " + sol.isPalindrome(input3)); // true
        }
    }
