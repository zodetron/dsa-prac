package day24;
//Leetcode 20. Valid Parentheses
import java.util.*;
import java.util.Scanner;

public class day24a {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> map = Map.of(
                    ')', '(',
                    ']', '[',
                    '}', '{'
            );

            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != map.get(c))
                        return false;
                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            day24a sol = new day24a();

            String s1 = "()[]{}";   // valid
            String s2 = "([{}])";   // valid
            String s3 = "(]";       // invalid
            String s4 = "({[)]}";   // invalid

            System.out.println(s1 + " -> " + sol.isValid(s1));
            System.out.println(s2 + " -> " + sol.isValid(s2));
            System.out.println(s3 + " -> " + sol.isValid(s3));
            System.out.println(s4 + " -> " + sol.isValid(s4));
        }
    }
