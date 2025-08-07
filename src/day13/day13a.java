package day13;
import java.util.*;

public class day13a {

        public boolean isPalindrome(String s) {
            StringBuilder newStr = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    newStr.append(Character.toLowerCase(c));
                }
            }
            return newStr.toString().equals(newStr.reverse().toString());
        }

        public static void main(String[] args) {
            day13a sol = new day13a();

            // Test cases
            String input1 = "A man, a plan, a canal: Panama";
            String input2 = "race a car";
            String input3 = " ";

            System.out.println("Is palindrome? " + sol.isPalindrome(input1)); // true
            System.out.println("Is palindrome? " + sol.isPalindrome(input2)); // false
            System.out.println("Is palindrome? " + sol.isPalindrome(input3)); // true
        }

}
