package day24;
// Leetcode 155. Min Stack
import java.util.*;

public class day24b {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public day24b() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        day24b minStack = new day24b();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Current Min: " + minStack.getMin()); // 2
        minStack.pop();
        System.out.println("Top Element: " + minStack.top()); // 7
        System.out.println("Current Min: " + minStack.getMin()); // 3
        minStack.pop();
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // 5
    }
}
