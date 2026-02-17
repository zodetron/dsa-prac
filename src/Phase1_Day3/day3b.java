package Phase1_Day3;
//Stack Q3
//LeetCode 150 Reverse Polish Notation
//Easier Less Complicated Approach

 import java.util.*;

class day3b {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for(String token : tokens){
                if(token.equals("+")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                }else if(token.equals("-")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                }else if(token.equals("*")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a * b);
                }else if(token.equals("/")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                }else{
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }
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

