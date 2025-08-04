package day12;
import java.util.Stack;

public class day12a {

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
            day12a sol = new day12a();

            String[] input1 = {"2", "1", "+", "3", "*"}; // (2 + 1) * 3 = 9
            String[] input2 = {"4", "13", "5", "/", "+"}; // 4 + (13 / 5) = 6
            String[] input3 = {"10", "6", "9", "3", "/", "-", "*"}; // 10 * (6 - (9 / 3)) = 30

            System.out.println("Result 1: " + sol.evalRPN(input1)); // 9
            System.out.println("Result 2: " + sol.evalRPN(input2)); // 6
            System.out.println("Result 3: " + sol.evalRPN(input3)); // 30
        }

}
