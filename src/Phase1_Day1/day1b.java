package Phase1_Day1;
//Stack Q2 LeetCode 155. Min Stack
import java.util.Stack;

public class day1b {

    // One-stack MinStack implementation

    //can be solved by maintaining two stacks two but i used 1 as it is more reliable and easier
    static class MinStack {
        private Stack<Integer> stack;
        private int min;

        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            if (stack.isEmpty()) {
                stack.push(val);
                min = val;
            } else if (val <= min) {
                // Save old min first, then push new value
                stack.push(min);
                stack.push(val);
                min = val;
            } else {
                stack.push(val);
            }
        }

        public void pop() {
            if (stack.isEmpty()) return;

            int top = stack.pop();
            if (top == min) {
                if (!stack.isEmpty()) {
                    min = stack.pop(); // restore previous min
                }
            }
        }

        public int top() {
            if (stack.isEmpty()) return -1;
            return stack.peek();
        }

        public int getMin() {
            if (stack.isEmpty()) return -1; // safe for local runs
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println("Current Min: " + ms.getMin()); // 2
        System.out.println("Top: " + ms.top());            // 2

        ms.pop(); // pop 2
        System.out.println("Current Min: " + ms.getMin()); // 3
        System.out.println("Top: " + ms.top());            // 7

        ms.pop(); // pop 7
        System.out.println("Current Min: " + ms.getMin()); // 3
        System.out.println("Top: " + ms.top());            // 3

        ms.pop(); // pop 3
        System.out.println("Current Min: " + ms.getMin()); // 5
        System.out.println("Top: " + ms.top());            // 5
    }
}

