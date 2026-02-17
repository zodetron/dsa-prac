package Phase1_Day3;
//Stack Q3
//LeetCode 150 Reverse Polish Notation
import java.util.*;

class day3a {

    public int evalRPN(String[] tokens) {
        Stack<Integer> intStack = new Stack<>();
        for (String tokenOld : tokens) {
            String token = tokenOld;   // keep token as String
            if (!token.equals("+") && !token.equals("-") && !token.equals("/") && !token.equals("*")) {
                intStack.push(Integer.parseInt(token));  // convert String to int
            } else {
                int b = intStack.pop();
                int a = intStack.pop();

                if (token.equals("+")) {
                    intStack.push(a + b);
                } else if (token.equals("-")) {
                    intStack.push(a - b);
                } else if (token.equals("*")) {
                    intStack.push(a * b);
                } else if (token.equals("/")) {
                    intStack.push(a / b);
                }
            }

        }
    return intStack.pop();

    }

    // 🔹 PSVM for local testing
    public static void main(String[] args) {
        day3a sol = new day3a();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(sol.evalRPN(tokens1));  // Expected: 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(sol.evalRPN(tokens2));  // Expected: 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(sol.evalRPN(tokens3));  // Expected: 22
    }
}

