package day24;
//leetcode 84. Largest Rectangle in Histogram
import java.util.*;

public class day24g {
        public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int maxArea = 0;
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i <= n; i++) {
                // Treat i == n as a height of 0 (sentinel) to flush remaining
                while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {
                    int height = heights[stack.pop()];
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }
            return maxArea;
        }

        public static void main(String[] args) {
            int[] heights = {2, 1, 5, 6, 2, 3};
            System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
        }
}
