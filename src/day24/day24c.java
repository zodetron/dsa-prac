package day24;
//leetcode 150. Evaluate Reverse Polish Notation
import java.util.*;

public class day24c {

        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String c : tokens) {
                if (c.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (c.equals("-")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                } else if (c.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (c.equals("/")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                } else {
                    stack.push(Integer.parseInt(c));
                }
            }
            return stack.pop();
        }

        public static void main(String[] args) {
            day24c sol = new day24c();

            String[] tokens1 = {"2", "1", "+", "3", "*"}; // (2 + 1) * 3 = 9
            String[] tokens2 = {"4", "13", "5", "/", "+"}; // 4 + (13 / 5) = 6
            String[] tokens3 = {"10", "6", "9", "3", "/", "-", "*"}; // 10 * (6 - (9 / 3)) = 30

            System.out.println(sol.evalRPN(tokens1)); // Output: 9
            System.out.println(sol.evalRPN(tokens2)); // Output: 6
            System.out.println(sol.evalRPN(tokens3)); // Output: 30
        }
}
