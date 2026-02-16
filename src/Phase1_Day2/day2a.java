package Phase1_Day2;
//Stack Q1
// Leetcode 20
import java.util.*;

class day2a {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == '}' || c == ']') {
                // 1. check stack empty
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // 2. check current closing one
                if (
                        (c == ')' && top != '(') ||
                                (c == ']' && top != '[') ||
                                (c == '}' && top != '{')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        day2a sol = new day2a();

        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}",
                ""
        };

        for (String test : tests) {
            System.out.println(test + " -> " + sol.isValid(test));
        }
    }
}
